package src.level2;

import java.util.HashMap;
import java.util.Map;

/*문제 설명
데이터 처리 전문가가 되고 싶은 어피치는 문자열을 압축하는 방법에 대해 공부를 하고 있습니다.
 최근에 대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부를 하고 있는데,
 문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여
 더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.
간단한 예로 aabbaccc의 경우 2a2ba3c(문자가 반복되지 않아 한번만 나타난 경우 1은 생략함)와 같이 표현할 수 있는데,
 이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮다는 단점이 있습니다.
 예를 들면, abcabcdede와 같은 문자열은 전혀 압축되지 않습니다.
어피치는 이러한 단점을 해결하기 위해 문자열을 1개 이상의 단위로 잘라서 압축하여
더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.

예를 들어, ababcdcdababcdcd의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 2개 단위로 잘라서 압축한다면 2ab2cd2ab2cd로 표현할 수 있습니다. 다른 방법으로 8개 단위로 잘라서 압축한다면 2ababcdcd로 표현할 수 있으며, 이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.

다른 예로, abcabcdede와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 abcabc2de가 되지만, 3개 단위로 자른다면 2abcdede가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다. 이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.

압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성해주세요.

제한사항
s의 길이는 1 이상 1,000 이하입니다.
s는 알파벳 소문자로만 이루어져 있습니다.
입출력 예
     s	                   result
"aabbaccc"	                7
"ababcdcdababcdcd"	        9
"abcabcdede"	            8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	        17
입출력 예에 대한 설명
입출력 예 #1

문자열을 1개 단위로 잘라 압축했을 때 가장 짧습니다.

입출력 예 #2

문자열을 8개 단위로 잘라 압축했을 때 가장 짧습니다.

입출력 예 #3

문자열을 3개 단위로 잘라 압축했을 때 가장 짧습니다.

입출력 예 #4

문자열을 2개 단위로 자르면 abcabcabcabc6de 가 됩니다.
문자열을 3개 단위로 자르면 4abcdededededede 가 됩니다.
문자열을 4개 단위로 자르면 abcabcabcabc3dede 가 됩니다.
문자열을 6개 단위로 자를 경우 2abcabc2dedede가 되며, 이때의 길이가 14로 가장 짧습니다.

입출력 예 #5

문자열은 제일 앞부터 정해진 길이만큼 잘라야 합니다.
따라서 주어진 문자열을 x / ababcdcd / ababcdcd 로 자르는 것은 불가능 합니다.
이 경우 어떻게 문자열을 잘라도 압축되지 않으므로 가장 짧은 길이는 17이 됩니다.
*/

public class 문자열압축 {

    public static int solution(String s) {
        int answer= s.length();

        for(int i=1;i<=s.length()/2;i++){ //문자열 패턴 단위 수
            int pos=0;
            int len=s.length();

            for(;pos+i<=s.length();){
                String unit=s.substring(pos,pos+i);
                pos+=i; //현재 가리키는 위치 증가

                int cnt=0;
                for(;pos+i<=s.length();){
                    if(unit.equals(s.substring(pos,pos+i))){ //연속된 문자가 같다면
                        cnt++; //기준문자열 뒤에 몇개의 연속된 문자열이 존재하는지 카운트
                        pos+=i;
                    }else
                        break;
                }

                if(cnt>0){
                    len-=i*cnt;

                    if(cnt<9) len+=1;
                    else if(cnt<99) len+=2;
                    else if(cnt<999) len+=3;
                    else len+=4;
                }

            } //end of for
            answer=Math.min(answer,len);
        }
        return answer;
    }

    //solution1)
    /*public static int solution(String s) {
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
    }*/


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
