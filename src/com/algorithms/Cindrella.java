package com.algorithms;

import java.util.Scanner;

public class Cindrella {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int bottleNumber = in.nextInt();
	     if(bottleNumber !=0){
		     int[] array = new int[bottleNumber];
		     int sum =0;
		     for(int i=0; i<bottleNumber;i++){
		    	 int a = in.nextInt();
		    	 array[i] = a;
		    	 sum += a;
		     }
		     sum = sum/bottleNumber;
		     int count =0;
		     for(int i=0; i<bottleNumber;i++){
		    	 if(array[i] > sum){
		    		 count++;
		    	 }
		     }
		     System.out.println(count);
	     }else{
	    	 System.out.println(0);
	     }

	}
}
