package com.apilol.enitty;

import java.util.Date;

public class Datos {

	private String navegador;
	private String IP;
	private Date hora;
	private String endpoint;

	public Datos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datos(String navegador, String iP, Date hora, String endpoint) {
		super();
		this.navegador = navegador;
		IP = iP;
		this.hora = hora;
		this.endpoint = endpoint;
	}

	public String getNavegador() {
		return navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	@Override
	public String toString() {
		return "Datos [navegador=" + navegador + ", IP=" + IP + ", hora=" + hora + ", endpoint=" + endpoint + "]";
	}

}
