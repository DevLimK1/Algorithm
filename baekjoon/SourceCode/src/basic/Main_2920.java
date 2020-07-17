package SourceCode.src.basic;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 음계
*
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	42378	22069	19443	54.183%

문제
다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.

1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

입력
첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

출력
첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

예제 입력 1
1 2 3 4 5 6 7 8
예제 출력 1
ascending
예제 입력 2
8 7 6 5 4 3 2 1
예제 출력 2
descending
예제 입력 3
8 1 7 2 6 3 5 4
예제 출력 3
mixed
* */

public class Main_2920 {

    //solution2)
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //입력을 문자열로 입력받고
        String temp=scan.nextLine();
        StringTokenizer str=new StringTokenizer(temp);

        int[] arr=new int[str.countTokens()]; //토큰의 갯수만큼 배열 생성

        //문자열을 StringTokenizer로 토큰별로
        //int형 배열에 요소를 하나씩 입력
        int i=0;
        while(str.hasMoreTokens()) //배열에 값 넣기
            arr[i++]=Integer.parseInt(str.nextToken());

        boolean ascending=true;
        boolean descending=true;


        //0 index가 1부터 +1씩하여 순차적으로 증가하면 ascending
        //7 index가 8부터 -1씩하여 순차적으로 감소하면 descending
        // 그 외는 mixed
        for(int j=1;j<arr.length;j++){
            int value=arr[j]-arr[j-1];
            if(value==-1)
                ascending=false;
            else if(value==1)
                descending=false;
            else{
                System.out.println("mixed");
                return;
            }
        }

        if(ascending){
            System.out.println("ascending");
        }else if(descending){
            System.out.println("descending");
        }
        return;

    }

    //solution1)
    /*public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //입력을 문자열로 입력받고
        String temp=scan.nextLine();
        StringTokenizer str=new StringTokenizer(temp);
        
        int[] arr=new int[str.countTokens()]; //토큰의 갯수만큼 배열 생성

        //문자열을 StringTokenizer로 토큰별로
        //int형 배열에 요소를 하나씩 입력
        int i=0;
        while(str.hasMoreTokens()) //배열에 값 넣기
            arr[i++]=Integer.parseInt(str.nextToken());

        boolean flag=true;

        //0 index가 1부터 +1씩하여 순차적으로 증가하면 ascending
        //7 index가 8부터 -1씩하여 순차적으로 감소하면 descending
        // 그 외는 mixed
        for(int j=1;j<arr.length;j++){
            int value=arr[j]-arr[j-1];
            if(value==-1){
                flag=false;
            }else if(value!=1){
                System.out.println("mixed");
                return;
            }
        }

        if(flag){
            System.out.println("ascending");
            return;
        }

        System.out.println("descending");
        return;



    }*/
}
