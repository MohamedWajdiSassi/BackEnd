package com.tekup.soap.service;

import java.util.List;

import com.tekup.soap.entities.User;
import com.tekup.soap.entities.Voiture;

public interface VoitureService {
	public Voiture saveVoiture(Voiture v) ;
	public void deleteById(Long id);
	public List<User> findALL();

}
