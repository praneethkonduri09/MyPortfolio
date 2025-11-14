package org.example;
//Find duplicates using Map
import java.util.*;
public class Main {
public static void helper(String a){
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<a.length();i++){
        map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
    }
    for(char key:map.keySet()){
        if(map.get(key)>1){
            System.out.print(key);
        }
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        helper(a);
    }
}