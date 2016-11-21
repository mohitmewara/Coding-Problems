package com.weekofcode25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
	public static void main(String[] args) {
		int[] arr1 = {2,4};
		int[] arr2 = {16,32,96};
		compareTwoSets(arr1, arr2);		
	}
	
	public static int gcd(int a, int b){
		while(b > 0){
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}

	public static int lcm(int a, int b){
		return a * (b/gcd(a,b));
	}
	
	public static int compareTwoSets(int[] a, int[] b){
		int lcm =1;
		for(int i=0;i<a.length;i++){
			lcm = (lcm > a[i]) ? lcm(lcm, a[i]) : lcm(a[i], lcm);
		}
		
		Arrays.sort(b);
		List<Integer> arrayList = new ArrayList<Integer>();		
		if(b != null && b.length >0){
			for(int j=1;j<=b[0];j++){
				int tmp = lcm *j;
				boolean flag = true;
				for(int k=0;k<b.length;k++){
					if(b[k]%tmp != 0){
						flag = false;
						break;
					}
				}
				if(flag){
					arrayList.add(tmp);
				}
			}			
		}
		return arrayList.size();
	}
}
