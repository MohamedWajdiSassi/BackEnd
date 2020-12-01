package com.tekup.soap.entities;

import java.io.Serializable;
import java.sql.Blob;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@Table(name="Voiture")
public class Voiture implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idVoiture ;
	
	private String marque ;
	private String modele ;
	private String couleur;
	private boolean  abs ;
	private boolean  climatiseur ;
	private boolean lecteurAudio;
	private boolean  gps;
	//private Blob images ;

	@ManyToOne
	@JsonBackReference
	private User user ;
	
	
	@OneToMany(mappedBy = "voiture",cascade = CascadeType.ALL)
	//@JsonManagedReference
	@JsonInclude(content = Include.NON_EMPTY)
	private List<Trajet> trajets ;





	public Long getIdVoiture() {
		return idVoiture;
	}


	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public boolean isAbs() {
		return abs;
	}


	public void setAbs(boolean abs) {
		this.abs = abs;
	}


	public boolean isClimatiseur() {
		return climatiseur;
	}


	public void setClimatiseur(boolean climatiseur) {
		this.climatiseur = climatiseur;
	}


	public boolean isLecteurAudio() {
		return lecteurAudio;
	}


	public void setLecteurAudio(boolean lecteurAudio) {
		this.lecteurAudio = lecteurAudio;
	}


	public boolean isGps() {
		return gps;
	}


	public void setGps(boolean gps) {
		this.gps = gps;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Trajet> getTrajets() {
		return trajets;
	}


	public void setTrajets(List<Trajet> trajets) {
		this.trajets = trajets;
	}
	


	
	
	
}
