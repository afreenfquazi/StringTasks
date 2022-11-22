package com.practice.stringAssignment;

public class StringEx2 {

	public static void main(String[] args) {
		
		String str = new String("java standard edition");
		String[] arr = str.split(" ");
		String uppercaseString="";
		for(String str1:arr) {
			String str2 = str1.substring(0, 1);
			String remainString= str1.substring(1);
			uppercaseString= str2.toUpperCase()+remainString;
			System.out.print(uppercaseString+" ");
		}
		
		
		}
		
	}

