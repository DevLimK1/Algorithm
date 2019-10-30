# 문제

- 백준 온라인저지 10828번 - 스택
- https://www.acmicpc.net/problem/10828

# 풀이

#### (생각하기)

- 스택은 LIFO(Last In First Out) 형식 => 가장 최근에 스택에 추가한 항목이 가장 먼저 제거됨

#### (구현하기)

- 배열기반 스택 구현
- push X: 정수 X를 스택에 넣는 연산이다.
- pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size: 스택에 들어있는 정수의 개수를 출력한다.
- empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
- top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

# 소스코드

#### Stack 라이브러리 사용 X

```java
import java.util.Scanner;

public class baekjoon_10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stSize = sc.nextInt();
		int[] stack = new int[stSize];
		String input; // push,pop,size,empty,top 입력
		int num;
		int top = 0;
		int size = 0;
		while (stSize-- > 0) {
			input = sc.next();
			if (input.equals("push")) { // push 입력시
				num = sc.nextInt();
				stack[++top] = num;
				size++;
			} else if (input.equals("pop")) {// pop 입력시
				if (top < 1) //스택에 들어있는 정수가 없는 경우
					System.out.println(-1);
				else {
					System.out.println(stack[top]);
					top--;
					size--;
				}
			} else if (input.equals("size")) { // size 입력시
				System.out.println(size);
			} else if (input.equals("empty")) {// empty 입력시
				if (size == 0)//스택이 비어있으면
					System.out.println(1);
				else
					System.out.println(0);
			} else if (input.equals("top")) {// top입력시
				if (stack[top] == 0)//스택이 비어있으면
					System.out.println(-1);
				else
					System.out.println(stack[top]);
			}

		} // ~while

		sc.close();
	}

}

```

# 참고자료

- 코드플러스 알고리즘 자료구조
