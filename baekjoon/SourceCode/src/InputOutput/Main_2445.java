package InputOutput;

import java.util.Scanner;

/*https://www.acmicpc.net/problem/2445
 * 
 별 찍기 - 8
 
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	12370	9046	8374	74.093%

문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 * */

public class Main_2445 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int tmp=0;
		
			for(int j=1;j<=2*size-1;j++) {
				
				if(j>size) //높이가 절반 지나면 
					tmp--;
				else
					tmp++;
				
				for(int k=0;k<tmp;k++) { //왼쪽 별 출력
					System.out.print("*");
				}
				
				//공백 출력 
				for(int k=0;k<2*size-2*tmp;k++) { //양끝 별 갯수 뺀만큼 공백 채우기!
					System.out.print(" ");
				}
				
				for(int k=tmp;k>0;k--) {//오른쪽 별 출력
					System.out.print("*");
				}
				System.out.println();
			} //end for j
		
	}
}
