package com.KrishnaSandeep_Youtube_Programs;

public class PrintFirstLetterOfEachWord {
	public static String firstLetter(String str) {
		String fstr = "";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			fstr = fstr + split[i].charAt(0);
		}
		return fstr;
	}

	public static void main(String[] args) {
		String str = "Hello World Satish";
		String firstLetter = firstLetter(str);
		System.out.println(firstLetter);
	}
}
