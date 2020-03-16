package InputOutput;


/*
 * https://www.acmicpc.net/problem/2442
 * 별 찍기 - 5 
 
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	21847	12457	11296	57.958%

문제
첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., 
N번째 줄에는 별 2×N-1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
    *
   ***
  *****
 *******
*********
 */
import java.util.Scanner;


//Solution1
//public class Main_2442 {
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int size=scanner.nextInt();
//		scanner.close();
//		int count=1; //별 출력 카운트

//		for(int i=0;i<size;i++) {
//			for(int j=0;j<size-1-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<i+count;k++) { i:0->0+1(count) i:1->1+2 i:2->2+3 
//				System.out.print("*");
//			}
//			count++;
//			System.out.println();
//		}
//	}
//}

//Solution2
public class Main_2442 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		scanner.close();

		for(int i=0;i<size;i++) {  
			for(int j=size-1-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) { //2*i+1 =>홀수
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
