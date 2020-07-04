# 문제

- 알고리즘 분류: 입출력
- 백준 온라인저지 10951번 : A+B - 4
- https://www.acmicpc.net/problem/10951

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

# 입력

입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

# 출력

각 테스트 케이스마다 A+B를 출력한다.

> 예제 입력1

```
1 1
2 3
3 4
9 8
5 2
```

> 예제 출력1

```
2
5
7
17
7
```

# 풀이

#### (생각하기)

- 예제 입력에서 몇 번 입력받을 것인지 _입력부분의 기준이 주어지지않아서_ 문제가 잘 못 된건지 알았다.
- 검색해보니, **EOF**에 대한 이해가 필요했다.

#### (구현하기)

- 데이터를 필요시까지 입력받아서 결과를 출력하고, EOF(eof) 입력을 받으면 프로그램 종료

# 소스코드 (JAVA)

```java
		Sol1)
        Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()) { //데이터를 입력받을 때까지 반복
			int x=scanner.nextInt();
			int y=scanner.nextInt();

			System.out.println(x+y);
		}
```

```java
		Sol2)
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()) { //데이터를 입력받을 때까지 반복
			System.out.println(scanner.nextInt()+scanner.nextInt());
		}

```

> - **Sol1, Sol2 의 차이점**은 변수에 입력을 받고 결과를 출력하느냐, 아니면 바로 System.out.println() 의 인자로 입력값을 받아 더해서 결과를 출력하느냐에 있다.
> - while(scanner.hasNextInt()) 를 사용하여 데이터를 입력받을 때까지 반복하고, EOF(End Of File) 또는 eof 를 입력하면 종료된다.
> - 컴퓨팅에서, **파일 끝(End of File, EOF)** 는 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 나타낸다.

# 느낀점

- 입력예제에 얼만큼 입력을 할 것이냐의 기준이 없어서 당황했다.
- 이 문제를 통해 다음번에 비슷한 유형의 문제가 나온다면 당황하지않고, 문제해결전략을 펼칠 수 있겠다.
  <!-- # 코드리뷰 -->

<!-- # 참고자료 -->
