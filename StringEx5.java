package com.practice.stringAssignment;

public class StringEx5 {

	public static void main(String[] args) {
		String str = "Welcome to Java world";
		String arr[]= str.split(" ") ;
		int count = 0;
		for(String str1 : arr) {
			count++;
		}
		System.out.println("Number of words in a string "+count);

	}

}
