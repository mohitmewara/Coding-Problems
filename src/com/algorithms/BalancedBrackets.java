package com.algorithms;


public class BalancedBrackets {
	public static void main(String[] args) {
		String[] ss = new String[4];
		ss[0] = "({})";
		
		String[] retValue = braces(ss);
		System.out.println(retValue[0]);
	}
	
	   static String[] braces(String[] values) {
		   String[] retValue = new String[values.length];
		   for(int i=0;i<values.length;i++){
			   if((values[i].length()%2 == 1)){
				   retValue[i] = "NO";
			   }else{
				   retValue[i] = recur(values[i]);
				   
			   }
		   }
		   return retValue;
	    }
	   
	   static String recur(String val){
		   char[] splitStr = val.toCharArray();
		   String yesNo = "";
		   int pos = 0;
		   for(int j=1;j<splitStr.length;j++){
			   if(splitStr[j] == ')' || splitStr[j] == '}' ||
					   splitStr[j] == ']' ){
				   pos = j;
			   }
			   
			   
			   
		   }
		   if(pos > 0){
			   for(int k=0;k<pos;k++){
				   if(splitStr[k] != splitStr[pos-k+pos-1]){
					   yesNo = "NO";
				   }else{
					   yesNo = "YES";
				   }
			   }
		   }else{
			   yesNo = "NO";
		   }
		   return yesNo;
	   }

}
