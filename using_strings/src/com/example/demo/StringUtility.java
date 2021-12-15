package com.example.demo;

public class StringUtility {
	public static String getSubString(String arg) {
		return arg.substring(5);
	}
//	Use overloaded subString method with two arg

	public static String getSubString(String arg ,int beginIndex, int endIndex) {
		return arg.substring(beginIndex, endIndex);
	}
	
	public static boolean checkContains(String arg,String srchChar) {
		return arg.contains(srchChar);
	}
	public static int checkPositionOfChar(String arg,String srchChar) {
		return arg.indexOf(srchChar);
	}
	public static String joinTwoStrings(String str1,String str2) {
		return str1.concat(str2);	
	}
	public static String replaceString(String originalString, String replaceString) {
		return originalString.replaceAll(originalString, replaceString);	
	}
//	Use split method
	public static String[] splitString(String arg,String delimit) {
//		return arg.split(regex);
		return arg.split( delimit);
	}
}
