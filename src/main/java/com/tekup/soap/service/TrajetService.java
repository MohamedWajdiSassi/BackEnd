package com.tekup.soap.service;

import java.util.List;

import com.tekup.soap.entities.Trajet;
import com.tekup.soap.entities.User;

public interface TrajetService {
	public List<Trajet> findALL();
	public void deleteById(Long id);
	public Trajet saveTrajet (Trajet t);

}
