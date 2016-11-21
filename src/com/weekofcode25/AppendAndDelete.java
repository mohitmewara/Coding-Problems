package com.weekofcode25;

import java.util.Scanner;

public class AppendAndDelete {
	public static void main(String[] args) {
		String s = "apple";
		String t = "apples";
		int k =3;
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        String t = in.next();
//        int k = in.nextInt();
		System.out.println(appendDelete(s,t, k));
	}
	
	public static String appendDelete(String s, String t, int k){
		char[] firstArr = s.toCharArray();
		char[] secondArr = t.toCharArray();
		int result=0;
		int count=0;
		
		if(firstArr.length >= secondArr.length){
			for(int i=0;i<secondArr.length;i++){
				if(firstArr[i] == secondArr[i]){
					count++;
				}else{
					break;
				}
			}
		}else{
			for(int i=0;i<firstArr.length;i++){
				if(firstArr[i] == secondArr[i]){
					count++;
				}else{
					break;
				}
			}			
		}
		if(t.length() > s.length() && t.contains(s)){
			result = secondArr.length - count;
			if(result%2 == 1 && k%2 ==1){
				return "Yes";
			}else if(result%2 == 0 && k%2 ==0){
				return "Yes";
			}else{
				return "No";
			}
		}
		if(s.equals(t) && (k <= s.length()) && (k%2 == 1)){
			return "No";
		}
		if(count == firstArr.length && firstArr.length > secondArr.length){
			if((k <= firstArr.length) && (k%2 == 1)){
				return "No";
			}
		}
		result = firstArr.length - count + secondArr.length - count;		
		return result <= k ? "Yes" : "No";
	}
}
