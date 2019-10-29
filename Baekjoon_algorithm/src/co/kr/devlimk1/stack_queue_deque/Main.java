package co.kr.devlimk1.stack_queue_deque;

import java.util.Scanner;

//백준 10828번

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stSize = sc.nextInt();
		int[] stack = new int[stSize];
		String input; // push,pop,size,empty,top 입력
		int num;
		int top = 0;
		int size = 0;
		while (stSize-- > 0) {
			input = sc.next();
			if (input.equals("push")) { // push 입력시
				num = sc.nextInt();
				stack[++top] = num;
				size++;
			} else if (input.equals("pop")) {// pop 입력시
				if (top < 1) //스택에 들어있는 정수가 없는 경우
					System.out.println(-1);
				else {
					System.out.println(stack[top]);
					top--;
					size--;
				}
				
				
			} else if (input.equals("size")) { // size 입력시
				System.out.println(size);
			} else if (input.equals("empty")) {// empty 입력시
				if (size == 0)//스택이 비어있으면
					System.out.println(1);
				else
					System.out.println(0);
			} else if (input.equals("top")) {// top입력시
				if (stack[top] == 0)//스택이 비어있으면
					System.out.println(-1);
				else
					System.out.println(stack[top]);
			}

		} // ~while

		sc.close();
	}

}
