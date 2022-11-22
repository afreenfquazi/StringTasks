package com.practice.stringAssignment;

public class StringEx6 {

	public static void main(String[] args) {
		String str = "JaVa StanDard EdiTion";
		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isUpperCase(str.charAt(i)))
					{
						System.out.println(str.charAt(i));
					}
		}
	}

}
