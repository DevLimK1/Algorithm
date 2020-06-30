package level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 모의고사
 * 
 * 
 * 문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...

2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

[제한 조건]

시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

입출력 예
answers	        return
[1,2,3,4,5]	   [1]
[1,3,2,4,2]	   [1,2,3]

입출력 예 설명

입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.

따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.
 */
public class 모의고사 {


    //solution1) Map 사용, 효율성에서 느리나 답은 맞음
 /*   public static int[] solution(int[] answers) {
        int[] answer = {};

      final int[] stu1 = { 1, 2, 3, 4, 5 }; // 1번 학생 찍는 방식
      final int[] stu2 = { 2, 1, 2, 3, 2, 4, 2, 5 };// 2번 학생 찍는 방식
      final int[] stu3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };// 3번 학생 찍는 방식

      Map<Integer, Integer> map = new HashMap<>();

      map.put(1, 0);
      map.put(2, 0);
      map.put(3, 0);

      //맞힌 갯수
      int stu1Cnt = 0;
      int stu2Cnt = 0;
      int stu3Cnt = 0;

      //맞힌 최대점
      int maxScore=0;
     
      for (int i = 0; i < answers.length; i++) {
          if (stu1[i%stu1.length] == answers[i]) {
              map.replace(1,++stu1Cnt);
              if(maxScore<stu1Cnt)
                  maxScore=stu1Cnt;
          }
          if (stu2[i%stu2.length] == answers[i]) {
              map.replace(2,++stu2Cnt);
              if(maxScore<stu2Cnt)
                  maxScore=stu2Cnt;
          }
          if (stu3[i%stu3.length] == answers[i]) {
              map.replace(3,++stu3Cnt);
              if(maxScore<stu3Cnt)
                  maxScore=stu3Cnt;
          }

      }


       Set<Integer> keys=map.keySet();
       List<Integer> list=new ArrayList<>();
     
      for(int key : keys){ //최대점수와 같은 사람 list에 추가
          
          if(maxScore==map.get(key))
              list.add(key);
      }
      
      System.out.println(list);
      //리스트 -> 배열
      answer=new int[list.size()];
      for(int i=0;i<list.size();i++){
          answer[i]=list.get(i);
      }
      
      return answer;
  }
*/

  //solution2) 정답, 효율성 좋음
    private static int[] solution(int[] answers) {
        int[] answer = {};
      
        int[] stu1 = { 1, 2, 3, 4, 5 }; // 1번 학생 찍는 방식
        int[] stu2 = { 2, 1, 2, 3, 2, 4, 2, 5 };// 2번 학생 찍는 방식
        int[] stu3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };// 3번 학생 찍는 방식

        // 맞힌 갯수
        int stu1Cnt = 0;
        int stu2Cnt = 0;
        int stu3Cnt = 0;

        // 맞힌 최대점
        int maxScore = 0;

        for (int i = 0; i < answers.length; i++) {
            if (stu1[i % stu1.length] == answers[i]) {
                ++stu1Cnt;
            }
            
            if (stu2[i % stu2.length] == answers[i]) {
                ++stu2Cnt;
            }
            
            if (stu3[i % stu3.length] == answers[i]) {
                ++stu3Cnt;
            }

        }

        //최대 점수 구하기(비교문 사용)
        // maxScore=stu1Cnt;
        // if(maxScore<stu2Cnt){
        //     maxScore=stu2Cnt;
        //     if(maxScore<stu3Cnt)
        //         maxScore=stu3Cnt;
        // }else if(maxScore<stu3Cnt){
        //     maxScore=stu3Cnt;
        // }
        
        maxScore = Math.max(Math.max(stu1Cnt, stu2Cnt), stu3Cnt);

        List<Integer> list = new ArrayList<>();

        //최대점수와 같으면 list에 추가
        if (maxScore == stu1Cnt)
            list.add(1);
        if (maxScore == stu2Cnt)
            list.add(2);
        if (maxScore == stu3Cnt)
            list.add(3);

        // 리스트 -> 배열
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    public static void main(final String[] args) {
        final int[] answers = { 1, 2, 3, 4, 5 };
        // final int[] answers = { 1, 3, 2, 4, 2 };
        int[] answer = {};
        answer = solution(answers);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}