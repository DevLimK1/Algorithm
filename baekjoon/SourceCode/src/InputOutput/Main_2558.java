package InputOutput;

import java.util.Scanner;

public class Main_2558 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size= scanner.nextInt();
		int result;
		
		for(int i=0;i<size;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			
			result=x+y;
			System.out.println(result);
		}
	}

}
