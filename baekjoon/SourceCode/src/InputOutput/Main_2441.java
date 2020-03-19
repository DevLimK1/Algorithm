package InputOutput;

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
