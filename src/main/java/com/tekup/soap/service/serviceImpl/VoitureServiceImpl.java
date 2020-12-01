package com.tekup.soap.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tekup.soap.entities.User;
import com.tekup.soap.entities.Voiture;
import com.tekup.soap.repository.VoitureRepository;
import com.tekup.soap.service.VoitureService;

public class VoitureServiceImpl implements VoitureService {

	
	
	@Autowired
	private VoitureRepository voitureRepository;
	@Override
	public List<User> findALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Voiture saveVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return voitureRepository.save(v);
	}

	@Override
	public void deleteById(Long id) {
		voitureRepository.deleteById(id);
		
	}

}
