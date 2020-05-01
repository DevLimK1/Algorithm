package math;

import java.util.Scanner;

//Do it 알고리즘 입문 자바편 p.82
//평년,윤년
//그 해 경과 일 수를 구하시오.
public class DayOfYear {
	//각 달의 일수
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
			{31,29,31,30,31,30,31,31,30,31,30,31}	//윤년
	};
	
	//윤년인가?
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0 || year%400==0) ? 1: 0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수 구하기
//	static int dayOfYear(int y,int m, int d) {
//		int days=d;
//		int isLeap_=isLeap(y);
//		
//		for(int i=1;i<m;i++)
//			days+=mdays[isLeap_][i-1];
//		
//		return days;
//		
//	}
	//서기 y년 m월 d일의 그 해 경과 일 수 구하기 while문 사용
	static int dayOfYear(int y,int m, int d) {
		while(--m!=0)
			d+=mdays[isLeap(y)][m-1];
		
		return d;
		
	}
	
	//남은 일 수 구하기
	static int leftDayOfYear(int y,int m,int d) {
		int days=d;
		
		for(int i=1;i<m;i++) {
			days+=mdays[isLeap(y)][i-1];
		}
		return 365+isLeap(y)-days;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일 수를 구합니다.");
		
		do {
			System.out.print("년: "); int y=scanner.nextInt();
			System.out.print("월: "); int m=scanner.nextInt();
			System.out.print("일: "); int d=scanner.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n",dayOfYear(y, m, d));
			System.out.printf("남은 일 수는 %d입니다.\n",leftDayOfYear(y, m, d));
			retry=scanner.nextInt();
		}while(retry==1);
		
	}
	
} //end of public class
