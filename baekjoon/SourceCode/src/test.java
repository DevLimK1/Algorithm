import java.util.Scanner;

/*
입력)
3 29 38 12 57 74 40 85 61
*/
public class test {
	public static void main(String[] args) {
	
//	    for (int d = 0; d < 5; d++) {
	         for (int f = 1; f <= 5; f++) {
	            System.out.print(f);
	            for (int a = 0; a < f-1; a++)
	               System.out.print("☆");
	            for (int a = 0; a <= 5 - f; a++)
	               System.out.print("★");

	            System.out.println();
	         }
//	      }
		
		
		//별이 코드 리뷰
//		Scanner scan = new Scanner(System.in);
//		int nums = scan.nextInt();
//		int[] count = new int[nums];
//		for (int i = 0; i < nums; i++) {
//			count[i] = scan.nextInt();
//		}
//		
//		//밑에 부분에서 동일한 코드인 for문을 지우고 
//		//if - else if 로 해서 간결하게 쓸 수 있음!
//		int max = count[0];
//		int min = count[0];
//		for (int i = 0; i < nums; i++) {
//			if (max < count[i]) {
//				max = count[i];
//			}else if(min>count[i]) {
//				min=count[i];
//			}
//			
//		}
//		
//		System.out.println("최대값 :" + max);
//		System.out.println("최소값 :" + min);

	}
}