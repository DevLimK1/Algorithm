package SourceCode.src;

import jdk.swing.interop.SwingInterOpUtils;

public class test2 {
    static int[] f=new int[100];
    public static int fibonacci(int num){

        if(f[num]!=0) {
            return f[num];
        }
        else{
            if(num==1||num==2){
                f[num]=1;
            }
            else{
                f[num]=fibonacci(num-1)+fibonacci(num-2);
                System.out.println(f[num]);
                return f[num];
            }

        }
        return f[num];
    }

    public static void main(String[] args) {
        int num=6;
        int result=fibonacci(num);
        System.out.println(result);
    }
}
