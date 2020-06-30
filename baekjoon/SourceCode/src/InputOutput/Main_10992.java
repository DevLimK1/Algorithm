package InputOutput;

import java.util.Scanner;

/*별 찍기 - 17
 * https://www.acmicpc.net/problem/10992
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	7102	4807	4461	69.410%
문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
1
예제 출력 1 
*
예제 입력 2 
2
예제 출력 2 
 *
***
예제 입력 3 
3
예제 출력 3 
  *
 * *
*****
예제 입력 4 
4
예제 출력 4 
   *
  * *
 *   *
*******
*/



public class Main_10992 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int j = 1; j <= input - i; ++j) { // 빈칸 출력 (n-1)
				System.out.print(" ");
			}

			if (i == 1 || i == input) {
				for (int j = 1; j <= i * 2 - 1 ; j++) { //별 출력 (2n-1)
					System.out.print("*");
				}
			} else {
				
				System.out.print("*"); //별 하나 출력
				
				for (int j = 1; j <= i * 2 - 3; j++) { //중간 빈칸 (2n-3)
					System.out.print(" ");
				}
 				
				System.out.print("*");// 별 하나 출력
			}
			System.out.println();
		}

		scanner.close();

	}

}

//////other source code ///////////////

/*
public class Main_10992 {
	public static void main(String[] args) {
		int input = 0;
		char star = '*';

		Scanner scanner = new Scanner(System.in);

		input = scanner.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int j = input - i; j > 0; j--) {// 빈칸 출력
				System.out.print(" ");
			}

			if (i == input) {// i가 입력값과 같으면 별 연속 출력
				int cnt = 0;
				while (cnt++ < i * 2 - 1)
					System.out.print(star);

				return;
			}

			if (i != input && input > 2) { // i가 입력값과 다르고 2보다 큰 값이라면

				if (i == 1) {
					// 별 하나 출력
					System.out.println(star);
					continue;
				}
				else { 
					// 별 하나 출력
					System.out.print(star);
					
					// 빈칸 출력
					int cnt = 0;
					while (cnt++ < i * 2 - 3)
						System.out.print(" ");

					// 별 하나 출력
					System.out.print(star);
				}
			} else { // input이 2라면
				System.out.print(star);
			}

			System.out.println();

		}
		scanner.close();
	}
}
*/

