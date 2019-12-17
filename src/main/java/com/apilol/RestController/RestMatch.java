package com.apilol.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.apilol.enitty.Datos;
import com.apilol.enitty.User;
import com.apilol.enitty.match.info.Matches;
import com.apilol.service.ServiceDatos;
import com.apilol.service.ServiceMatchHistory;
import com.apilol.service.ServicePlayerInfo;



@RestController
@CrossOrigin(origins = "*")
public class RestMatch {
	
	@Autowired
	private ServicePlayerInfo service;
	
	@Autowired
	private ServiceMatchHistory serviceMatch;
	
	@Autowired
	private ServiceDatos servicedatos;
	
	
	@GetMapping("user/{name}")
	public User findByName(@PathVariable("name") String name) {
		System.out.println(name);
		
		Datos datos = new Datos();
		servicedatos.addDatos(datos);
		
		return service.findByName(name);
	}
	
	@GetMapping("") // MAPEO
	public ModelAndView insertarDatos() {
		
		
		return null;
	}
	
	
	@GetMapping("matches/{accountId}/from/{from}/to/{to}")
	public Matches matchesByAccountId(@PathVariable("accountId") String accountId,
			@PathVariable("from") int from,
			@PathVariable("to") int to) {
		return serviceMatch.MatchHistory(accountId,from,to);
	}

}
