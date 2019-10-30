# 문제

- 백준 온라인저지 9093번 - 단어뒤집기
- https://www.acmicpc.net/problem/9093

# 풀이

#### (생각하기)

- 단어를 역순으로 출력하기 위해 LIFO(Last In First Out)스택 자료구조를 활용하여 구현하면 어떨까?

#### (구현하기)

- 입력 문자열을 삽입받을 원본 배열(arr), 원본 배열에서 띄어쓰기 전까지 임시로 저장할 배열(temp), 임시저장배열에서 역순으로 삽입할 배열(stack)을 선언하여 구현함

- Stack 라이브러리를 사용한 소스 / 사용하지 않은 소스로 구현

# 소스코드

#### Stack 라이브러리 사용 X

```java
import java.io.BufferedReader;

public class baekjoon_9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int size =Integer.parseInt(bf.readLine()); //테스트 케이스 size 입력
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr; //문자열 담을 배열 선언
		String word;
		String[] stack; //스택 배열 선언
		String[] temp; //입력받은 배열에서 띄어쓰기 전까지 삽입
		int k=0; //stack배열에서의 index count
		int cnt=0; //temp배열에서의 index count


		while(size-->0) {
		word=bf.readLine();

		arr=word.split("",word.length()+1); //마지막 index를 추가하여 밑에 for문에서

		stack=new String[arr.length-1] ;
		temp=new String[arr.length-1] ;

		for(int i=0;i<=arr.length-1;i++) {
			if((arr[i].equals(" "))||(i==arr.length-1)) { //빈칸일 때 또는 원본배열길이 -1과 i가 같을 때 (마지막값을 stack배열에 추가하기위해)
				for(int j=cnt-1;j>=0;j--) { //temp 배열 역순으로 삽입
					stack[k]=temp[j]; //stack배열에 역순으로 삽입됨
					k++;
				}
				if(i<arr.length-1) {
					stack[k]=" "; //문자 모두 삽입 후 띄어쓰기
					k++;
					cnt=0;
				}
			}
			else { //문자일 때
				temp[cnt]=arr[i];
				cnt++;
			}
		}

		for(int i=0;i<arr.length-1;i++) { //Stack 배열에서 출력
			bw.write(stack[i]);
		}
		bw.write('\n');
		bw.flush();

		k=0;
		cnt=0;
		}//~while

		bw.close();

	}

}
```

#### Stack 라이브러리 사용

```java
public class baekjoon_9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int size =Integer.parseInt(bf.readLine()); //테스트 케이스 size 입력
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		while(size-->0) {
			String str=bf.readLine()+"\n"; //문자열 입력받기
			Stack<Character> s=new Stack<>();
			for(char ch:str.toCharArray()) { //문자열->char배열로 전환(toCharArray())
				if(ch=='\n'||ch==' ') { //개행문자 또는 띄어쓰기일 떄
					while(!s.isEmpty()) {
						bw.write(s.pop()); //버퍼에 pop
					}
					bw.write(ch);
				}else {
					s.push(ch); //Stack s에 push
				}
			}
		}//~while
		bw.flush();
		bw.close();

	}

}
```

# 참고자료

- 코드플러스 알고리즘 자료구조
