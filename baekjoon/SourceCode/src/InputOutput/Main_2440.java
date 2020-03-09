package InputOutput;

import java.util.Scanner;

/*https://www.acmicpc.net/problem/2440
별 찍기 - 3
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	49195	32464	29754	67.021%

문제
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
*****
****
***
**
*

*/
public class Main_2440 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int height=scanner.nextInt();
		
		for(int i=0;i<height;i++) {
			for(int j=height-i;j>0;j--) //공백
				System.out.print("*");
			System.out.println();
		}
	}
}
