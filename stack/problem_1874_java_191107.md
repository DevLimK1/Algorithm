# 문제

- 알고리즘 분류: 스택
- 백준 온라인저지 1874번 - 스택 수열
- https://www.acmicpc.net/problem/1874

<!-- 2시간걸림 -->

# 풀이

#### (생각하기)

- stack의 push , pop을 활용하여 정답스택수열 배열의 값보다 임시배열의 값이 작거나 같으면 계속 push하고, 임시배열의 top 값과 같으면 pop을 하고, 다르면 NO를 출력한다.

#### (구현하기)

- 정답으로 주어진 스택 수열을 담을 배열과 pop하기 전까지 push할 임시 배열을 만들어서 비교한다.
- 임시배열에 정답 스택 수열배열과 같은 값이 있으면 임시배열에서 pop 하고 String에 +,- 기호를 덧붙인다.
- 정답배열과 임시배열의 top의 index 값이 다르면 "NO"를 출력하고<br>
  값이 같으면 String의 기호들을 한줄에 하나씩 출력한다.

  <br>

> 예제 입력1

---

    8
    4
    3
    6
    8
    7
    5
    2
    1

> 예제 출력1

---

    +
    +
    +
    +
    -
    -
    +
    +
    -
    +
    +
    -
    -
    -
    -
    -

> 예제 입력2

---

    5
    1
    2
    5
    3
    4

> 예제 출력2

---

    NO

# 소스코드 (JAVA)

```java
package co.kr.devlimk1.stack_queue_deque;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//String ch =""; //문자 +,-기호 변수
		StringBuilder sb=new StringBuilder();//문자 +,-기호 변수들을 덧붙일 변수
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int i;
		int[] ansStack = new int[size]; // 정답 수열을 담은 배열
		int[] temp = new int[size]; // 임시 배열
		int pushNum = 1; // stack 배열에 push or pop 할 변수
		int top = -1; // stack top


		for (i = 0; i < ansStack.length; i++) { // 정답 스택수열을 배열에 입력
			ansStack[i] = sc.nextInt();
		}

		for (i = 0; i < size; i++) { // 1부터~size까지 오름차순으로 입력
			while (true) {

				if (ansStack[i] >= pushNum) { //
					//ch+="+";
					sb.append("+");
					top++;
					temp[top] = pushNum;
					pushNum++;
					continue;
				}

				// 정답배열과 임시배열 top과 값이 같으면
				if (ansStack[i] == temp[top]) {
					//ch+="-";
					sb.append("-");
					top--;
					break;
				}
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		for(int j=0;j<sb.length();j++) {
			System.out.println(sb.charAt(j));
		}
		sc.close();
	}
}

```

# 느낀점

- 처음에 구현할 때,<br>
  String ch="";<br>
  ch+="+"; -> 메모리 초과 오류가 났음 <br>
  검색을 해보니, String에 +=을 하는 건 계속 메모리상에 누적되어 많은 메모리를 사용하게 된다고 함. 그래서, StringBuilder를 사용하여 append함수를 사용하니 메모리 초과 오류를 해결함 <br>

- 알고리즘공부가 막상 공부하려고하면 어렵고, 두려운(?) 느낌이 있는데, 오랜 시간들여서 공부한만큼 얻어가는게 크고, 새롭게 배우는 점도 많아서 앞으로도 "일단 하자!" 라는 마인드로 꾸준히 공부해야겠다.

<!-- # 코드리뷰 -->

# 참고자료
