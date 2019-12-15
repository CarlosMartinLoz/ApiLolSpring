package com.apilol.exception;

//Excepcion sobre la inicializacion del singleton
public class InitializeSingletonException extends Exception{
	
	private static final String mensaje = "Pregunta a carlos sobre esta excepcion";
	public InitializeSingletonException() {
		// TODO Auto-generated constructor stub
		super(mensaje);
	}
	

}
