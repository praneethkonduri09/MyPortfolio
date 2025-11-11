package org.example;
import java.util.*;

public class Main {
    public static void helper(int num,int a,int b){
        System.out.print(a+" "+b+" ");
        int c=0;
        for(int i=2;i<num;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int a=0;
       int b=1;
       helper(num,a,b);

    }
}