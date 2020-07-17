package src.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*문제 설명
        n명의 사람이 일렬로 줄을 서고 있습니다. n명의 사람들에게는 각각 1번부터 n번까지 번호가 매겨져 있습니다.
         n명이 사람을 줄을 서는 방법은 여러가지 방법이 있습니다.
         예를 들어서 3명의 사람이 있다면 다음과 같이 6개의 방법이 있습니다.

        [1, 2, 3]
        [1, 3, 2]
        [2, 1, 3]
        [2, 3, 1]
        [3, 1, 2]
        [3, 2, 1]
        사람의 수 n과, 자연수 k가 주어질 때, 사람을 나열 하는 방법을 사전 순으로 나열 했을 때, k번째 방법을 return하는 solution 함수를 완성해주세요.

        제한사항
        n은 20이하의 자연수 입니다.
        k는 n! 이하의 자연수 입니다.
        입출력 예
        n	k	result
        3	5	[3,1,2]
        200710~
        */
public class 줄서는방법 {



    public static long factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }

//    public static long factorial(int n) {
//        long answer = 1L;
//        for (int i = 2; i <= n; i++) answer *= i;
//        return answer;
//    }

    public static int[] solution(int n, long k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            list.add(i);
        int[] answer = new int[n];
        long total = factorial(n);
        int index = 0;
        k = k - 1;
        while (n > 1) {
            long cycle = total / n;
            int now = (int) (k / cycle);
            answer[index] = list.remove(now);
            k = k % cycle;
            total = cycle;
            index++;
            n--;
        }
        answer[index] = list.remove(0);
        return answer;

    }

//solution 정답은 맞았으나, 효율성이 4/5개 틀림
   /* public static int[] solution(int n, long k) {
        int[] answer = new int[n];
//            int[] temp=new int[n];
        List temp=new LinkedList();
        long fac=0;
        long cycle=0;
        int index=0;
        int remainder=0;

        int people=n;

        for(int i=1;i<=n;i++){
            temp.add(i);
        }

        fac=factorial(people);
        System.out.println("fac:"+fac);
        cycle=fac/people; // cycle개씩 한 싸이클(주기)
        for(int i=0;i<n;i++){
            System.out.println("cycle:"+cycle+"개씩 한 싸이클");
            if(i==0) {
                index = (int) ((k - 1) / cycle); //자릿 수 index
                System.out.println("자릿 수 index:" + index);
                remainder = (int) ((k - 1) % cycle); //앞 자리수가 index인 것중에 remainder번째
                answer[i]= (int) temp.remove(index);
                people--;
                cycle=cycle/people;
                continue;
            }

            index = (int) (remainder / cycle); //자릿 수 index
            System.out.println("자릿 수 index:" + index);
            remainder = (int) (remainder % cycle); //앞 자리수가 index인 것중에 remainder번째

            System.out.println("나머지:"+remainder);

            answer[i]= (int) temp.remove(index);
            System.out.println(Arrays.toString(answer));
            people--;
            if(people==0)
                break;
            cycle=cycle/people;
        }


        return answer;
    }*/

      /*  public static int[] solution(int n, long k) {
            int[] answer = new int[n];
//            int[] temp=new int[n];
            List temp=new ArrayList();
            long fac=0;
            long cycle=0;
            int index=0;
            int remainder=0;

            int people=n;

            for(int i=1;i<=n;i++){
                temp.add(i);
            }


            for(int i=0;i<n;i++){
                fac=factorial(people); //factorial
                System.out.println("fac:"+fac);
                cycle=fac/people; // cycle개씩 한 싸이클(주기)
                System.out.println("cycle:"+cycle+"개씩 한 싸이클");

                if(i==0) {
                    index = (int) ((k - 1) / cycle); //자릿 수 index
                    System.out.println("자릿 수 index:" + index);
                    remainder = (int) ((k - 1) % cycle); //앞 자리수가 index인 것중에 remainder번째
                    answer[i]= (int) temp.get(index);
                    temp.remove(index);
                    people--;
                    continue;
                }

                index = (int) (remainder / cycle); //자릿 수 index
                System.out.println("자릿 수 index:" + index);
                remainder = (int) (remainder % cycle); //앞 자리수가 index인 것중에 remainder번째

                System.out.println("나머지:"+remainder);

                answer[i]= (int) temp.get(index);
                temp.remove(index);
                System.out.println(Arrays.toString(answer));
                people--;
            }


            return answer;
        }*/


    public static void main(String[] args) {
        int n = 3;
        int k = 5;

        int[] result = solution(n, k);

        System.out.println(Arrays.toString(result));
    }
}
