package InputOutput;

import java.util.Scanner;

//�� ���� ���� ����ϱ�
//boj.kr/11721
/*
-----------------------------------------------------------------------------
����)
���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.

�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
-----------------------------------------------------------------------------
�Է�)
ù° �ٿ� �ܾ �־�����. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�.
 ���̰� 0�� �ܾ�� �־����� �ʴ´�.
-----------------------------------------------------------------------------
���)
�Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. 
�ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
-----------------------------------------------------------------------------
�Է�1)
BaekjoonOnlineJudge   
���1)
BaekjoonOn
lineJudge
�Է�2)
OneTwoThreeFourFiveSixSevenEightNineTen
���2)
OneTwoThre
eFourFiveS
ixSevenEig
htNineTen    
*/   
public class Main_11721 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string;
		string=scanner.nextLine(); //�� �� ���ڿ� �Է�
		
		for(int i=0;i<string.length();i++) {
			if(i!=0&&i%10==0)  //10�� ����̸�
				System.out.println();
			System.out.print(string.charAt(i));
		}
	}
}
