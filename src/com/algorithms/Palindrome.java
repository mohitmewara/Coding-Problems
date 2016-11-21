package com.algorithms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String read = in.nextLine();
		while(!read.trim().equals("0")){
			long len = findLength(read.trim());
			if(len != -1){
				System.out.println(len);
			}
			read = in.nextLine();
		}		
	}
	
	public static long findLength(String a){
		long b = Long.parseLong(a);
		char[] strArr = a.toCharArray();
		int zero =0;
		for(int i=0;i<strArr.length;i++){
			if(strArr[i] == 48){
				zero++;
			}else{
				break;
			}
		}
		if(strArr.length >= 2 && strArr.length <= 9){
			String str = a.substring(0, zero);
			int noZeroLength = strArr.length - zero;
			for(long i=0;i<100000000;i++){
				long c = b+i;
				int length = (int)(Math.log10(c)+1);
				int diff = length - noZeroLength;
				if(diff > 0){
					if(checkPalindrome(str.substring(0, zero-diff)+c)){
						//System.out.println(i);
						return i;
					}
				}else{
					if(checkPalindrome(str.substring(0, zero)+c)){
						//System.out.println(i);
						return i;
					}
				}
			}
		}
		return -1;
	}
	
	public static boolean checkPalindrome(String palin){
		StringBuffer rev = new StringBuffer(palin).reverse(); 
		String strRev = rev.toString();		
		if(palin.equalsIgnoreCase(strRev)){
			return true;
		}else{
			return false;
		}
	}
}
