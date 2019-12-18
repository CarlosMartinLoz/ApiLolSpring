package com.apilol.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.apilol.enitty.Datos;


@Mapper
public interface IDaoDatos {

	@Insert("insert into datos(navegador,ip,hora,endpoint) values(#{navegador},#{ip},#{hora},#{endpoint})")
	void insertarDatos(Datos datos);
}
