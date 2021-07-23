package com.aisha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int num, s,r=0;
        String msg="";
        num= sc.nextInt();
        int l= (""+num).length();
        s=num*num;
        System.out.println(s);
        r=s% (int) Math.pow(10,l);
        if(num==r){
            System.out.println("automorphic");
        }else{
            System.out.println("not automorphic");
        }


        
    }
}
