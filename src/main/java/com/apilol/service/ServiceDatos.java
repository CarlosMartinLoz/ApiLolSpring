package com.apilol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apilol.dao.IDaoDatos;
import com.apilol.enitty.Datos;


@Service
public class ServiceDatos {
	
	@Autowired
	IDaoDatos daodatos;
	
	public void addDatos(Datos datos) {
		// TODO Auto-generated method stub
		daodatos.insertarDatos(datos);
		
	}
	

}
