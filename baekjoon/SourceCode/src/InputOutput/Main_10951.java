package InputOutput;

import java.util.Scanner;

public class Main_10951 {
	public static void main(String[] args) {

		//Sol1)
		//		Scanner scanner=new Scanner(System.in);
//		while(scanner.hasNextInt()) {
//			int x=scanner.nextInt();
//			int y=scanner.nextInt();
//			
//			System.out.println(x+y);
//		}
		
		//Sol2)
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt()+scanner.nextInt());
		}
	}
}
