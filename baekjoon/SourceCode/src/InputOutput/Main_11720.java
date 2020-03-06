package InputOutput;

import java.util.Scanner;

//숫자의 합
//boj.kr/11720
/*
-----------------------------------------------------------------------------
문제)
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
-----------------------------------------------------------------------------
입력)
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
-----------------------------------------------------------------------------
출력)
입력으로 주어진 숫자 N개의 합을 출력한다.
-----------------------------------------------------------------------------
입력1)
1
1    
출력1)
1
입력2)
5
54321 
출력2)
15
    
*/   
public class Main_11720 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string;
		string=scanner.nextLine();
		int size=Integer.parseInt(string); //숫자의 개수 N
		int sum=0;
		string=scanner.nextLine();
		
		//Sol1)
//		for(int i=0;i<size;i++) {
//			char ch=string.charAt(i); //
//			sum+=Integer.parseInt(string.valueOf(ch)); //char -> string -> int 형변환
//		}
		
		//Sol2)
		for(int i=0;i<size;i++) {
			int num=string.charAt(i)-'0'; // ex) '5'-'0' = 5
			sum+=num; 
		}
		System.out.println(sum);
		
	}
}