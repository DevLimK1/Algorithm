package level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
	//solution1)
	/*
	public static int[] solution(int[] arr) {
		int[] answer_ = new int[arr.length];
		int[] answer = {};
		int index = 1;

		answer_[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] == arr[i]) { // 이전값과 현재값이 같다면
				continue;
			} else {
				answer_[index++] = arr[i];
			}
		}

		answer = new int[index];

		for (int i = 0; i < index; i++) {
			answer[i] = answer_[i];
		}

		return answer;
	}
	 */
	
	//solution2)
	public static int[] solution(int[] arr) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		int preNum = 10; //0~9까지의 숫자
		for (int num : arr) {
			if (preNum != num) //이전숫자와 같지 않으면
				tempList.add(num); //배열에 추가
			preNum = num;
		}
		
		int[] answer = new int[tempList.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = tempList.get(i).intValue();
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] answer = {};
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
//		int[] arr = { 4, 4, 4, 3, 3 };

		answer = solution(arr);

		for (int i = 0; i < answer.length; i++)
			System.out.println(answer[i]);
	}

}
