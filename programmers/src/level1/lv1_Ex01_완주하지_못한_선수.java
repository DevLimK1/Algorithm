package level1;

import java.util.Arrays;
import java.util.HashMap;

/*
https://programmers.co.kr/learn/courses/30/lessons/42576
문제 설명)
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항)
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예)
[participant]	[completion]	[return]
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav

입출력 예 설명)
예제 #1
leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
*/

//참고 https://dreamhollic.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C-%ED%92%80%EC%9D%B45-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-JAVA
public class lv1_Ex01_완주하지_못한_선수 {
	  
	//solution) 배열 사용한 풀이 
	 public static String solution(final String[] participant, final String[] completion) {
			Arrays.sort(participant);
			Arrays.sort(completion);
			int i;
			for (i = 0; i < completion.length; i++) {

				if (!participant[i].equals(completion[i])) {
					return participant[i];
				}
			}
			return participant[i];
		}

		///////////////////////////////////////////////////////////////////

		// solution) 해시 사용한 풀이
		/*
		 * public static String solution(String[] participant, String[] completion) {
		 * String answer = ""; int val=0; HashMap<String, Integer> map=new
		 * HashMap<String, Integer>();
		 * 
		 * for(String part : participant) { if(map.get(part) == null) map.put(part,1);
		 * else{ val = map.get(part) + 1; map.put(part,val); } }
		 * 
		 * for(String comp : completion) { val = map.get(comp) - 1; map.put(comp,val); }
		 * 
		 * 
		 * for(String key : map.keySet()) { if(map.get(key) == 1) answer = key; }
		 * 
		 * 
		 * return answer; }
		 */

		//////////////////////////////////////////////////////////

		// solution) 해시사용한 풀이 2
		// public String solution(String[] participant, String[] completion) {
		// String answer = "";
		// HashMap<String, Integer> hm = new HashMap<>();
		// for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) +
		// 1);
		// for (String player : completion) hm.put(player, hm.get(player) - 1);
		//
		// for (String key : hm.keySet()) {
		// if (hm.get(key) != 0){
		// answer = key;
		// }
		// }
		// return answer;
		// }

		//////////////////////////////////////////////////////////
		// solution2) 효율성 탈락
		/*
		 * public static String solution(String[] participant, String[] completion) {
		 * 
		 * String answer = ""; Boolean flag=false; Arrays.sort(participant);
		 * Arrays.sort(completion); for(int i = 0 ;i < participant.length;i++){ flag =
		 * true; for(int j = 0 ;j < completion.length;j++){
		 * if(participant[i].equals(completion[j])){ completion[j] = null; flag = false;
		 * break; } } if(flag) { answer += participant[i]; } }
		 * System.out.println(answer); return answer; }
		 */
		//////////////////////////////////////////////////////////////

		// solution3) 정답은 1개 틀림, 효율성에서 탈락

		// public static String solution(String[] participant, String[] completion) {
		// String answer = "";
		//
		// ArrayList<String> completionList = new ArrayList(Arrays.asList(completion));
		//
		// for (String participant_ : participant) {
		// if (Arrays.asList(completion).contains(participant_)) {
		// int index = completionList.indexOf(participant_);
		// completion[index] = "";
		// } else {
		// answer += participant_;
		// }
		// }
		//
		// System.out.println(answer);
		//
		// return answer;
		// }

		//////////////////////////////////////////////////////////////

		// solution4)
		/*
		 * //200306 - 정답은 통과, 효율성에서 통과하지 못함! -> 나중에 다시 풀 것(해시를 사용해야함) public static
		 * String solution(String[] participant, String[] completion) { String answer =
		 * ""; int j; int i; for(i=0;i<participant.length;i++){
		 * for(j=0;j<completion.length;j++){ if(completion[j].equals(participant[i])){
		 * completion[j]=""; break; } } if(j==completion.length) answer+=participant[i];
		 * } return answer; }
		 */

		public static void main(final String[] args) {
			final String[] participant = { "leo", "kiki", "eden" };
			final String[] completion = { "eden", "kiki" };

			final String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
			final String[] completion2 = { "josipa", "filipa", "marina", "nikola" };

			final String[] participant3 = { "mislav", "stanko", "mislav", "ana" };
			final String[] completion3 = { "stanko", "ana", "mislav" };

			// solution(participant, completion);
			// solution(participant2, completion2);
			final String answer = solution(participant3, completion3);
			System.out.println(answer);

		}
	
	
}
