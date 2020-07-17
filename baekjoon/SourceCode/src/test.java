package SourceCode.src;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static int recursive(int sum,int[] numbers){
		if(numbers.length==0){
			System.out.println("총합은"+sum);
			return sum;
		}
		else{
			try {
				System.out.printf("recursive(%d ",sum);
				System.out.println(Arrays.toString(numbers));

				int[] numbers2=Arrays.copyOfRange(numbers,1,numbers.length);
				System.out.println("numbers2: "+ Arrays.toString(numbers2));
				return recursive(sum+numbers[0], numbers2);
			}catch (Exception e){
			}finally{
				System.out.println("이라고 말했어요.");
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] numbers={3,1,4,1,5,9};
		int sum=0;

		int result=recursive(sum,numbers);
		System.out.println(result);


	}
}