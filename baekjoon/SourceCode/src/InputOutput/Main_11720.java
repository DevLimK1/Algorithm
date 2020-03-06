package InputOutput;

import java.util.Scanner;

//������ ��
//boj.kr/11720
/*
-----------------------------------------------------------------------------
����)
N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
-----------------------------------------------------------------------------
�Է�)
ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
-----------------------------------------------------------------------------
���)
�Է����� �־��� ���� N���� ���� ����Ѵ�.
-----------------------------------------------------------------------------
�Է�1)
1
1    
���1)
1
�Է�2)
5
54321 
���2)
15
    
*/   
public class Main_11720 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string;
		string=scanner.nextLine();
		int size=Integer.parseInt(string); //������ ���� N
		int sum=0;
		string=scanner.nextLine();
		
		//Sol1)
//		for(int i=0;i<size;i++) {
//			char ch=string.charAt(i); //
//			sum+=Integer.parseInt(string.valueOf(ch)); //char -> string -> int ����ȯ
//		}
		
		//Sol2)
		for(int i=0;i<size;i++) {
			int num=string.charAt(i)-'0'; // ex) '5'-'0' = 5
			sum+=num; 
		}
		System.out.println(sum);
		
	}
}