package com.tekup.soap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.soap.entities.Trajet;
import com.tekup.soap.service.TrajetService;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/trajets")
public class TrajetController {
	@Autowired
	private TrajetService trajetService;
	
	@RequestMapping(value="/trajets",method = RequestMethod.POST)
	
	public Trajet saveTrajet(@RequestBody Trajet t) {
		// TODO Auto-generated method stub
		return trajetService.saveTrajet(t);
	}
	
	@RequestMapping(value="/trajets",method =RequestMethod.PUT)
	public Trajet UpdateTrajet(@RequestBody Trajet j) {
		return trajetService.saveTrajet(j);
	}
	@RequestMapping(value="/trajets",method = RequestMethod.GET)

	public List<Trajet> findALL() {
		return trajetService.findALL();
	}

}
