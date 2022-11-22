package com.practice.stringAssignment;

public class StringEx8 {

	public static void main(String[] args) {
		String str = "b.v.raju college";
		
		
		System.out.println(str.replace(str.substring(4, 8), str.substring(4, 8).toUpperCase()));
		
	}

}
