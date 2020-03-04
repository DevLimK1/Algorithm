package InputOutput;

import java.util.Scanner;

// A+B -6
// boj.kr/10953
/*
-----------------------------------------------------------------------------
����:�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
-----------------------------------------------------------------------------
�Է�: ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
-----------------------------------------------------------------------------
���:�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
-----------------------------------------------------------------------------
�Է�1)
5
1,1
2,3
3,4
9,8
5,2
���1)
2
5
7
17
7
*/   
public class Main_10953 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Sol1)
//		int size=scanner.nextInt();
//		scanner.nextLine();
		
		//Sol2)
		String string=scanner.nextLine();
		int size= Integer.parseInt(string);
		
		for(int i=0;i<size;i++) {
			string=scanner.nextLine(); //�� �� �Է¹ޱ�
			int x=string.charAt(0)-'0'; // ����-'0' �ؼ� ����->���ڷ� ��ȯ
			int y=string.charAt(2)-'0'; 
	
			System.out.println(x+y);
		}
	}
}
