package InputOutput;


/*
 * 
별 찍기 - 4
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	43020	31040	28393	73.540%

문제
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

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
 * */

import java.util.Scanner;

public class Main_2441 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		scanner.close();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<size-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
