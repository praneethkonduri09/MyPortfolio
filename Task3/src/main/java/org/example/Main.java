package org.example;
import java.util.*;
public class Main{
   public static boolean helper(String str,String str1){
       if(str.length()!=str1.length()){
           return false;
       }

       HashMap<Character,Integer>a=new HashMap<>();
       HashMap<Character,Integer>b=new HashMap<>();
       for(int i=0;i<str.length();i++){
           a.put(str.charAt(i),a.getOrDefault(str.charAt(i),0)+1);
       }
       for(int i=0;i<str1.length();i++){
           b.put(str1.charAt(i),b.getOrDefault(str1.charAt(i),0)+1);
       }
       return a.equals(b);
   }



    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String str1=sc.nextLine();
      boolean a= helper(str,str1);
      if(a){
          System.out.print("true");
      }else{
          System.out.print("false");
      }
    }

}
