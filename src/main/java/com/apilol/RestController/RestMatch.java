package com.apilol.RestController;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.apilol.enitty.Datos;
import com.apilol.enitty.User;
import com.apilol.enitty.match.info.Match;
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
	public User findByName(@PathVariable("name") String name, HttpServletRequest request) {
		System.out.println(name);
		insertarDatos(request);
		return service.findByName(name);
	}


	@GetMapping("matches/{accountId}/from/{from}/to/{to}")
	public Match[] matchesByAccountId(@PathVariable("accountId") String accountId, @PathVariable("from") int from,
			@PathVariable("to") int to) {
		return serviceMatch.MatchHistory(accountId, from, to).getMatches();
	}
	
	public void insertarDatos(HttpServletRequest request)  {
		Calendar c = Calendar.getInstance();
		Timestamp date = new Timestamp(c.getTimeInMillis());

		Datos d = new Datos();

		d.setNavegador(request.getHeader("User-Agent"));
		d.setIp(request.getRemoteAddr());
		d.setHora(date);
		d.setEndpoint(request.getRequestURL().toString());
		servicedatos.addDatos(d);
	
	

}

}
