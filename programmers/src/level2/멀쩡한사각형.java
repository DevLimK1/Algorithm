package src.level2;

public class 멀쩡한사각형 {
    public static long solution(int w, int h) {
        long answer = 1;
        long lw=(long)w; //조건에서 long형으로 해줘야함
        long lh=(long)h;
        long gNum=0;
        //유클리드 호제법을 사용하여 w,h의 최대공약수를 구한다.
        gNum=gcd(lw,lh);

        //최대공약수가 1일 때
        //w+h-1이 answer
        //최대공약수가 1 이상일 때
        //전체사각형 수 - (w/gNum+h/gNum-1)*gNum가 answer
        //    if(gNum==1)
        //     answer=(lw+lh-1);
        // else{
        //     answer=(lw*lh)-(lw+lh-gNum); // (w/gNum+h/gNum-1)*gNum 을 축약한 것
        // }  //아래와 같이 한 줄로 가능
        answer=(lw*lh)-(lw+lh-gNum);
        // System.out.println(answer);

        return answer;
    }

    public static long gcd(long w,long h){
        long remain=0;
        long tmp=0;
        //while문 사용
        //  if(w<h){
        //     tmp=w;
        //     w=h;
        //     w=tmp;
        // }
        while(h!=0){
            remain=w%h;
            w=h; //h가 0이면 w가 최대공약수가 된다.
            h=remain;
        }
        return w;
        //재귀 사용
//        if(h==0){
//            return w;
//        }else{
//            return gcd(h,w%h);
//        }

    }

    public static void main(String[] args) {
        int w=6;
        int h=10;
//        long result=solution(8,12);
        long result=solution(w,h);
        System.out.println(result);

    }
}
