package com.software.app.utils;

public class Validaciones {
	public static boolean isAlphaNumeric(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (!Character.isLetterOrDigit(caracter))
				return false;
		}
		return true;
	}
	
	public static boolean containsDigit(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isDigit(caracter))
				return true;
		}
		return false;
	}
	
	public static boolean containsUpperCase(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isUpperCase(caracter))
				return true;
		}
		return false;
	}
	
	public static boolean lengthString(String cadena, int min, int max) {
		if (cadena.length() >= min && cadena.length() <= max)
			return true;
		return false;
	}
	
	public static boolean noSpaces(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (caracter == ' ')
				return false;
		}
		return true;
	}
	
	public static boolean isOnlyNumeric(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (!Character.isDigit(caracter))
				return false;
		}
		return true;
	}
	
	public static boolean noRepeats(String cadena) {
		for (int i = 0; i < cadena.length() - 3; i++) {
			if (cadena.charAt(i) == cadena.charAt(i + 1)
					&& cadena.charAt(i) == cadena.charAt(i + 2)
					&& cadena.charAt(i) == cadena.charAt(i + 3))
				return false;
		}
		return true;
	}
}
