package src.keep;

import java.util.HashMap;
import java.util.Map;

public class 문자열압축 {
    //solution1)
    public static int solution(String s) {
        int answer = 1000; //문자열 최대길이 1000
        Map<String,Integer> map=new HashMap<>();
        int unit=0,j=0;
        int sameCnt=1;
        String now =""; //현재 가리키는 문자열 패턴
        String next=""; //다음 가리키는 문자열
        String unionString=""; //문자열 합친 것

        //문자열 압축 가능한 최대 수는 (문자열길이/2) 개씩 가능
        //문자열 자르기로 끊어서 해시맵에 저장? -> x
        //문자열 자른 String을 now에 보관해놓고 그 다음에 문자열과 비교해서 같으면 sameCnt++ 해준다.
        if(s.length()==1)
            return answer=1;
        for(unit=1;unit<=s.length()/2;unit++) { //문자열 단위 수 1~(문자열길이/2)까지
            now=s.substring(0,unit);
            for(j =unit; j <s.length(); j +=unit){ //
                if(j +unit>s.length())
                    break;
//                System.out.println("unit:"+unit);
//                System.out.println("문자열 패턴:"+now);

                next = s.substring(j, j + unit);

//                System.out.println("now:"+now);
//                System.out.println("next:"+next);

                if(now.equals(next)){ //이어지는 문자열이 현재 가리키는 문자열 패턴과 동일하다면
                    sameCnt++;
//                    System.out.println("sameCnt:"+sameCnt);
                }else{ //이어지는 문자열 패턴이 다르면
                    unionString+=combine(now,sameCnt); //문자열 결합
//                    System.out.println("unionString:"+unionString);
                    sameCnt=1;
                }
                now=next;
            }
            System.out.println("j:"+j);
            unionString+=combine(now,sameCnt);//j==s.length라서 반복문을 빠져나왔을 때

            if(j<s.length()) //문자열 단위 패턴 수만큼 비교후 뒤에 남은 문자열이 있으면
                unionString+=s.substring(j,s.length());
            System.out.println("unionString:"+unionString);

            answer=(answer>unionString.length()) ? unionString.length() : answer;
//            answer=Math.min(answer,unionString.length());

            sameCnt=1;
            unionString="";

        }

        return answer;
    }

    private static String combine(String now, int sameCnt) {
        if(sameCnt==1)
            return now;
        return sameCnt+now;
    }


    //solution2) 처리 속도 빠름, other solution
    /*
    public int solution(String s) {
        int min = s.length();
        int len = s.length()/2+1;
        for(int i = 1; i < len; i++) {
            String before = "";
            int sum = 0;
            int cnt = 1;
            for(int j = 0; j < s.length();) {
                int start = j;
                j = (j+i > s.length()) ? s.length():j+i;
                String temp = s.substring(start, j);
                if(temp.equals(before)) {
                    cnt++;
                } else {
                    if(cnt != 1) {
                        sum += (int)Math.log10(cnt)+1;
                    }
                    cnt = 1;
                    sum+=before.length();
                    before = temp;
                }
            }
            sum+=before.length();
            if(cnt != 1) {
                sum += (int)Math.log10(cnt)+1;
            }
            min = (min > sum) ? sum : min;
        }

        return min;
    }*/

    public static void main(String[] args) {
        String s = "";
//        s="a";
        s = "aabbaccc";//	7
//        s = "ababcdcdababcdcd";//	9
//        s = "abcabcdede";//	8
//        s = "abcabcabcabcdededededede";//	14
//        s = "xababcdcdababcdcd";//17
    int answer= solution(s);
        System.out.println("정답은 "+answer);
    }
}
