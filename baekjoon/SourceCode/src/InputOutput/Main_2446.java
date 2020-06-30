package InputOutput;

import java.util.Scanner;

/* 
 * https://www.acmicpc.net/problem/2446
별 찍기 - 9
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	13574	8694	8169	65.263%

문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/
public class Main_2446 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int starSize=size;
		int tmp=-1;
		
		for(int i=0;i<2*size-1;i++) {
			if(i<size)
				tmp++;
			else
				tmp--;
			
			for(int j=0;j<tmp;j++) {
				System.out.print(" ");
			} //end for j
			for(int k=0;k<2*(size-tmp)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}//end for i
		
	}
}
