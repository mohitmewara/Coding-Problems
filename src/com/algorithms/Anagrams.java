package com.algorithms;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {
    public static int numberNeeded(String first, String second) {
        char[] word1 = first.toCharArray();
        char[] word2 = second.toCharArray();

	        Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();
	        Map<Character, Integer> lettersInWord2 = new HashMap<Character, Integer>();

	        for (char c : word1) {
	            int count = 1;
	            if (lettersInWord1.containsKey(c)) {
	            count = lettersInWord1.get(c) + 1;
	            }
	            lettersInWord1.put(c, count);
	        }

	        for (char c : word2) {
	          int count = 1;
	            if (lettersInWord2.containsKey(c)) {
	                count = lettersInWord2.get(c) + 1;                    
	            }
	            lettersInWord2.put(c, count);
	        }
	        int count =0;
	        for(Map.Entry<Character, Integer> entry : lettersInWord1.entrySet()){
	            if(lettersInWord2.containsKey(entry.getKey())){
	                if(entry.getValue() < lettersInWord2.get(entry.getKey())){
	                    count = count + entry.getValue();
	                }
	                else{
	                    count = count + lettersInWord2.get(entry.getKey());
	                }
	            }
	        }

	        return (word1.length + word2.length - (2*count));   
	}                
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }	    
	}
	                
