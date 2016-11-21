package com.algorithms;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        char[] character = s.toCharArray();
        int[] charInt = new int[character.length];
        
        for(int i=0;i<character.length;i++){
        	charInt[i] = (int) character[i];
        }
        int count=0;
        for(int i=0;i<charInt.length;i++){
        	if(charInt[i] >=65 && charInt[i] <= 90){
        		count++;
        	}
        }
        System.out.println(++count);
    }  
}
