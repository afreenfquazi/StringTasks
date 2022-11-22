package com.practice.stringAssignment;

public class StringEx7 {

		public static void main(String[] args) {
		String str = "bvrit college";
		char ch[] = str.toCharArray();
		int j = str.lastIndexOf("l");
		String str1 = null;
		for (int i = 0; i < ch.length; i++)

		{
			if (j == i) {
				ch[j] = Character.toUpperCase(ch[i]);
			}
			str1 = new String(ch);
		}
		System.out.println(str1);
	}

}
