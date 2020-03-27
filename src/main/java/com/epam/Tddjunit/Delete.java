package com.epam.Tddjunit;

public class Delete {
	public static String remove(String string) {
		String result ="";
		int stringLen = string.length();
		if(stringLen >= 1 && string.charAt(0) != 'a' && string.charAt(0) != 'A') {
			result += string.charAt(0);
		}
		if(stringLen >= 2 && string.charAt(1) != 'a' && string.charAt(1) != 'A') {
			result += string.charAt(1);
		}
		if(stringLen > 2) {
			result += string.substring(2);
		}
		return result;
	}
}
