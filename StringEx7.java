package com.practice.stringAssignment;

public class StringEx7 {

	public static void main(String[] args) {
		String str = "bvrit college";
		char ch = 'l';
		int i = str.indexOf(ch, str.indexOf(ch)+1);
		System.out.println(str.indexOf(ch)+1);
	//	System.out.println(str.toUpperCase().charAt(i));
		//System.out.println(str.charAt(i));
		System.out.println(str.replace(str.charAt(str.indexOf(ch)+1), str.toUpperCase().charAt(i)));
		
		
		
	}

}
