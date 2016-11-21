package com.weekofcode25;

import java.util.Scanner;

public class StoneDivision {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int pileSize = sc.nextInt();
			int setSize = sc.nextInt();
			int[] setArray = new int[setSize];
			int count=0;
			int count1=0;
			for(int i=0;i<setSize;i++){
//				setArray[i] = sc.nextInt();
				if(sc.hasNext()){
					int temp = sc.nextInt();
					if(pileSize%temp == 0){
						int quotient =pileSize/temp;
						if(quotient%2==0){
							count++;							
						}else{
							count1++;
							
						}
					}
				}
			}
			if(count > count1){
				System.out.println("First");
			}else{
				System.out.println("Second");
			}
			
			
			
		}
	}
}
