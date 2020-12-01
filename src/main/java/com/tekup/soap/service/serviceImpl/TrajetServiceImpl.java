package com.tekup.soap.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.soap.entities.Trajet;
import com.tekup.soap.entities.User;
import com.tekup.soap.repository.TrajetRepository;

import com.tekup.soap.service.TrajetService;

@Service
public class TrajetServiceImpl implements TrajetService {
	@Autowired
	private TrajetRepository trajetRepository;
	
	@Override
	public List<Trajet> findALL() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Trajet saveTrajet(Trajet t) {
		// TODO Auto-generated method stub
		return trajetRepository.save(t);
	}
	@Override
	public void deleteById(Long id) {
		trajetRepository.deleteById(id);		
	}
	

}
