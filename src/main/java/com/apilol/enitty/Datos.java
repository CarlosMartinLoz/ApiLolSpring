package com.apilol.enitty;

import java.sql.Timestamp;
import java.util.Date;

public class Datos {

	private String navegador;
	private String ip;
	private Timestamp hora;
	private String endpoint;

	public Datos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datos(String navegador, String ip, Timestamp hora, String endpoint) {
		super();
		this.navegador = navegador;
		this.ip = ip;
		this.hora = hora;
		this.endpoint = endpoint;
	}

	public String getNavegador() {
		return navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getHora() {
		return hora;
	}

	public void setHora(Timestamp hora) {
		this.hora = hora;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	

}
