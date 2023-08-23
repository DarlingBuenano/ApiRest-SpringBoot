package com.software.app.utils;

public class ValidacionDeUsuario {
	
	//Nombre de usuario:
	public static String validarNombreUsuario(String cadena) {
		//Validar que no contenga signos
		if (!Validaciones.isAlphaNumeric(cadena))
			return "El usuario debe ser alfanumérico";
		//Debe tener al menos un número
		if (!Validaciones.containsDigit(cadena))
			return "El usuario debe tener al menos 1 número";
		//Debe tener al menos una letra mayúscula
		if (!Validaciones.containsUpperCase(cadena))
			return "El usuario debe tener al menos 1 letra mayúscula";
		//Longitud mínima de 8 y máxima de 20 dígitos
		if (!Validaciones.lengthString(cadena, 8, 20))
			return "El usuario debe tener un mínimo 8 y máximo 20 dígitos";
		return "Correcto";
	}
	
	//Contraseña:
	public static String validarPassword(String cadena) {
		//Debe tener al menos 8 dígitos (Está arriba)
		if (!Validaciones.lengthString(cadena, 8, 50))
			return "La contraseña debe tener un mínimo de 8 y máximo 50 dígitos";
		//Debe tener al menos una letra mayúscula (Está arriba)
		if (!Validaciones.containsUpperCase(cadena))
			return "La contraseña debe contener letras mayúsculas";
		//No debe contener espacios
		if (!Validaciones.noSpaces(cadena))
			return "La contraseña tiene espacios";
		//Debe tener al menos un signo no alfanumérico (usar el método isAlphaNumeric)
		if (Validaciones.isAlphaNumeric(cadena))
			return "La contraseña debe tener al menos un signo";
		return "Correcto";
	}	
	
	//Identificación
	public static String validarIdentificacion(String cadena) {
		//Debe tener 10 dígitos (Usar el método lengthString)
		if (!Validaciones.lengthString(cadena, 10, 10))
			return "La identificación debe tener 10 dígitos";
		//Sólo números
		if (!Validaciones.isOnlyNumeric(cadena))
			return "La identificación debe tener sólo números";
		//Validar que no tenga 4 veces seguidas un mismo número
		if (!Validaciones.noRepeats(cadena))
			return "La identificación no debe tener 4 veces un mismo número";
		return "Correcto";
	}
	
	//Generar correo
	public static String generarCorreo(String nombres, String apellidos, char incremental) {
		int index_espacio = apellidos.indexOf(" ");
		String apellido1 = apellidos.substring(0, index_espacio);
		String apellido2 = apellidos.substring(index_espacio+1, index_espacio+2);
		String correo = nombres.substring(0, 1) + apellido1 + apellido2;
		correo = correo.toLowerCase();
		if (incremental != '0') {
			return correo + incremental;
		}
		return correo;
	}
}
