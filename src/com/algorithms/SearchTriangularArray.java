package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchTriangularArray {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		 Scanner in = new Scanner(System.in);
		 List<Long> sumList = new ArrayList<Long>();
	     int lineNumber = in.nextInt();
	     int totalSubTriangle = in.nextInt();
	     boolean flag = true;
	     int[][] triArray = new int[lineNumber][lineNumber];
	     for(int i=0;i<lineNumber;i++){
	    	 for(int j=0;j<=i;j++){	    		 
	    		 int input = in.nextInt();
	    		 if(input < -100000 || input > 100000){
	    			 flag = false;
	    			 break;
	    		 }
	    		 triArray[i][j] = input;
	    		 sumList.add((long)input);
	    	 }
	     }
	     
	     if((lineNumber >= 1 && lineNumber <=350) && (totalSubTriangle >=1) && flag){
		     for(int row=0;row<lineNumber-1;row++){
		    	 for(int column=0;column<=row;column++){
		    		 long sum = triArray[row][column];
		    		 for(int nextRow=row+1;nextRow<lineNumber;nextRow++){
		    			 for(int nextColumn=column;nextColumn<=column+nextRow-row;nextColumn++){
		    				 sum += triArray[nextRow][nextColumn];
		    			 }
		    			 sumList.add(sum);
		    		 }
		    	 }
		     }
		     
		     Collections.sort(sumList);
		     for(int i =0;i<totalSubTriangle;i++){
		    	 System.out.println(sumList.get(i));
		     }
				long endTime = System.nanoTime();
				System.out.printf("Total Time: %.6f seconds\n",
						((endTime - startTime) / 1000000000.0));
	     }
	     
 
	}
}
