# 문제

- 알고리즘 분류: 스택
- 백준 온라인저지 9012번 - 괄호
- https://www.acmicpc.net/problem/9012

# 풀이

#### (생각하기)

- 여는괄호와 닫는괄호는 가장 가까운 것들로 짝이 이루어진다.
- 시간복잡도: N개의 괄호가 있을 때, index 0부터 순차적으로 검색하면서 닫는괄호가 나오면 다시 index 0부터 닫는괄호와 가장 가까운 여는 괄호를 검색할 수 있기 때문에 **_O(N^2)_** 의 시간복잡도가 구해진다.

#### (구현하기)

- 괄호를 담은 배열에서 닫는괄호 ')'을 찾으면 닫는 배열과 가장 가까운 여는괄호 '('를 찾아서 cnt(카운트 변수)를 차감하고, cnt가 0이되면 YES 아니면 NO를 출력한다.
- min 변수를 사용하여 가장 가까운 index를 찾는다.

  <br>

> 예제 입력1

---

    6
    (())())
    (((()())()
    (()())((()))
    ((()()(()))(((())))()
    ()()()()(()()())()
    (()((())()(

> 예제 출력1

---

    NO
    NO
    YES
    NO
    YES
    NO

# 소스코드 (JAVA)

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); //선언
		String s; //문자열 입력 변수
		String[] arr; //문자열 배열

		int size=Integer.parseInt(bf.readLine());
		int cnt;//괄호 갯수
		int min=-1;
		int i,j;
		while(size-- >0) {
			s=bf.readLine();//문자열 입력
			arr=s.split(""); //배열에 한글자씩 저장
			cnt=s.length(); //괄호 갯수

			for(i=0;i<s.length();i++) {
				if(arr[i].equals(")")) {//닫는 괄호가 나오면
					for(j=0;j<i;j++) {
						if(arr[j].equals("(")) {//여는 괄호가 나오면
							min=j; //닫는괄호와 가장 가까운 index
						}
					}

					if(min!=-1) { //닫는괄호와 여는 괄호의 짝이 맞으면
						cnt-=2; //짝이 맞는 괄호 갯수 차감
						arr[i]="X"; //여는괄호 X로 대입
						arr[min]="X"; //닫는괄호 X로 대입
						min=-1; //초기화
					}

				}
			}

			if(cnt==0) { //arr배열안에 괄호들이 없으면
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

		}

	}

}

```

# 느낀점

- Stack 라이브러리함수를 사용하여 구현하면 더 쉽게 구현할 수 있을 거 같다.

# 참고자료

- 코드플러스 알고리즘 자료구조
