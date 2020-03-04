# 문제

- 알고리즘 분류: 입출력
- 백준 온라인저지 10953번 : A+B - 6
- https://www.acmicpc.net/problem/10953

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

# 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.  
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다.  
 (0 < A, B < 10)

# 출력

각 테스트 케이스마다 A+B를 출력한다.

> 예제 입력1

```
5
1,1
2,3
3,4
9,8
5,2
```

> 예제 출력1

```
2
5
7
17
7
```
# 체크해야 할 사항 √
```java
   1: 	Scanner scanner = new Scanner(System.in);
   2: 		String string;
   3: 		int size=scanner.nextInt();
   4: 		
   5: 		for(int i=0;i<size;i++) {
   6: 			string=scanner.nextLine(); //한 줄 입력받기
   7: 			int x=string.charAt(0)-'0';
   8: 			int y=string.charAt(2)-'0';
   9: 	
  10: 			System.out.println(x+y);
  11: 		}
```
```
5
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 0
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:709)
	at InputOutput.Main_10953.main(Main_10953.java:38)  

위와 같은 에러가 발생!
```

> (체크해야 할 사항 √)
>
> 3: int size=scanner.nextInt();  5를 입력받으면   
>6: string=scanner.nextLine();  위에서 5를 입력하고  엔터(빈 문자열)가 자동으로 입력된다.
> 
>*해결방법1)* **scanner.nextLine() 추가**
> 
> 3: int size=scanner.nextInt();
> 4: scanner.nextLine();  **개행문자(엔터)를 제거하기위해 추가** 
> 
> *해결방법2)* **Scanner.nextLine( )**으로 입력받고 **Integer.parseInt( )**로 변환
> 
>String string=scanner.nextLine(); // 문자열 5로 입력받고
> int size= Integer.parseInt(string); // 문자열 5를 int형으로 변환

