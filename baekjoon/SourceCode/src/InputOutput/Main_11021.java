package InputOutput;

import java.util.Scanner;

//A+B - 7
//boj.kr/11021
/*
-----------------------------------------------------------------------------
����)
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
-----------------------------------------------------------------------------
�Է�)
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
-----------------------------------------------------------------------------
���)
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�.
�׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
-----------------------------------------------------------------------------
�Է�1)
5
1 1
2 3
3 4
9 8
5 2
���1)
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/   
public class Main_11021 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string;
		string=scanner.nextLine();
		int size= Integer.parseInt(string);
		
		for(int i=1;i<=size;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			System.out.printf("Case #%d: %d%n",i,x+y);
		}
	}
}
