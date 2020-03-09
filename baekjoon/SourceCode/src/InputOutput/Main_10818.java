package InputOutput;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10818
 * 최소, 최대

시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	45142	20135	16676	45.990%

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7
예제 출력 1 
7 35
 * 
 */
public class Main_10818 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size= scanner.nextInt();
		int max=-1_000_000;
		int min=1_000_000;
		
		for(int i=0;i<size;i++) {
			int num=scanner.nextInt();
			if(num>max) {
				int tmp=max;
				max=num;
				num=tmp;
			}
			else if(min>num) {
				int tmp=min;
				min=num;
				num=tmp;
			}
		}
		
		System.out.printf("%d %d",min,max);
	}
}
