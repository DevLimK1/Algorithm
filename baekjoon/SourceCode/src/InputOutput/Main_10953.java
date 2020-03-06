package InputOutput;

import java.util.Scanner;

// A+B -6
// boj.kr/10953
/*
-----------------------------------------------------------------------------
문제:두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
-----------------------------------------------------------------------------
입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
-----------------------------------------------------------------------------
출력:각 테스트 케이스마다 A+B를 출력한다.
-----------------------------------------------------------------------------
입력1)
5
1,1
2,3
3,4
9,8
5,2
출력1)
2
5
7
17
7
*/   
public class Main_10953 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Sol1)
//		int size=scanner.nextInt();
//		scanner.nextLine();
		
		//Sol2)
		String string=scanner.nextLine();
		int size= Integer.parseInt(string);
		
		for(int i=0;i<size;i++) {
			string=scanner.nextLine(); //한 줄 입력받기
			int x=string.charAt(0)-'0'; // 문자-'0' 해서 문자->숫자로 변환
			int y=string.charAt(2)-'0'; 
	
			System.out.println(x+y);
		}
	}
}