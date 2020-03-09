package InputOutput;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1924
 * 2007년
문제)
오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 
이를 알아내는 프로그램을 작성하시오.

입력)
첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 
2월은 28일까지 있다.

출력)
첫째 줄에 x월 y일이 무슨 요일인지에 따라 
SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.

입력 예1)
1 1
출력 예1)
MON

입력 예2)
9 2
출력 예2)
SUN
 *
 */


public class Main_1924 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] week= {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31}; 
		int allDay=0;
		
		int x=scanner.nextInt(); //x월 입력
		int y=scanner.nextInt(); //y일 입력
		
		for(int i=0;i<x-1;i++) {
			allDay+=days[i]; //x월 전까지의 일 수를 더함
		}
		allDay+=y-1;
		
		System.out.println(week[allDay%7]);
	}
}

/*
 다른 풀이 참고 후)
 String[] week= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
 위와 같이 선언하면 allDay+=y-1; 을 해줄 필요가 없다.
 왜냐하면 1월 1일이 MON 이 출력되어야하고, 배열 index도 같기때문이다.
 
 
 * */
