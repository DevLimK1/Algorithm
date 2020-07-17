package src;

public class 하노이탑 {

    public static void hanoi(int n,String 처음,String 중간,String 끝){

        if(n==1)
            System.out.println("1:"+처음+"->"+끝);
        else{
            hanoi(n-1,처음,끝,중간);
            System.out.println(n+": "+처음+"->"+끝);
            hanoi(n-1,중간,처음,끝);

        }

    }

    public static void main(String[] args) {
        String 처음="A";
        String 중간="B";
        String 끝="C";
        
        hanoi(4,처음,중간,끝);
    }
}
