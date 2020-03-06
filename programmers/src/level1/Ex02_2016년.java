package level1;

public class Ex02_2016년 {
	public static String solution(int a, int b) {
		String[][] cal = new String[12][31];
		String answer = "";
		String start = "FRI";

		for (int i = 1; i <= 12; i++)
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				for (int j = 1; j <= 31; j++) {
					if (j % 7 == 1)
						cal[i][j] = "FRI";
					else if (j % 7 == 2)
						cal[i][j] = "SAT";
					else if (j % 7 == 3)
						cal[i][j] = "SUN";
					else if (j % 7 == 4)
						cal[i][j] = "MON";
					else if (j % 7 == 5)
						cal[i][j] = "TUE";
					else if (j % 7 == 6)
						cal[i][j] = "WED";
					else if (j % 7 == 0)
						cal[i][j] = "THU";	
				}
				
				break;
			case 2:
				
			
			}

		return answer;
	}

	public static void main(String[] args) {
		String resultString = solution(5, 24);
		System.out.println(resultString);
	}

}
