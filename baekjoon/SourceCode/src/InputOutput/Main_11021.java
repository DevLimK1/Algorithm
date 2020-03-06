package InputOutput;

import java.util.Scanner;

//A+B - 7
//boj.kr/11021
/*
-----------------------------------------------------------------------------
문제)
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
-----------------------------------------------------------------------------
입력)
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
-----------------------------------------------------------------------------
출력)
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
테스트 케이스 번호는 1부터 시작한다.
-----------------------------------------------------------------------------
입력1)
5
1 1
2 3
3 4
9 8
5 2
출력1)
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/   
public class Main_11021 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string;
		string=scanner.nextLine();
		int size= Integer.parseInt(string);
		
		for(int i=1;i<=size;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			System.out.printf("Case #%d: %d%n",i,x+y);
		}
	}
}