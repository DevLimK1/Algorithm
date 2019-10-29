package co.kr.devlimk1.stack_queue_deque;

import java.util.Scanner;

//���� 10828��

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stSize = sc.nextInt();
		int[] stack = new int[stSize];
		String input; // push,pop,size,empty,top �Է�
		int num;
		int top = 0;
		int size = 0;
		while (stSize-- > 0) {
			input = sc.next();
			if (input.equals("push")) { // push �Է½�
				num = sc.nextInt();
				stack[++top] = num;
				size++;
			} else if (input.equals("pop")) {// pop �Է½�
				if (top < 1) //���ÿ� ����ִ� ������ ���� ���
					System.out.println(-1);
				else {
					System.out.println(stack[top]);
					top--;
					size--;
				}
				
				
			} else if (input.equals("size")) { // size �Է½�
				System.out.println(size);
			} else if (input.equals("empty")) {// empty �Է½�
				if (size == 0)//������ ���������
					System.out.println(1);
				else
					System.out.println(0);
			} else if (input.equals("top")) {// top�Է½�
				if (stack[top] == 0)//������ ���������
					System.out.println(-1);
				else
					System.out.println(stack[top]);
			}

		} // ~while

		sc.close();
	}

}
