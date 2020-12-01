package com.tekup.soap.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="Trajet")
public class Trajet implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idTrajet ;
	private String dateDep;
	private String dateRet;
	private String pickup;
	private String dropOff;
	private Float prix ;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	//@JsonBackReference
	@JsonIgnore
	private Voiture voiture ;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonInclude(content = Include.NON_EMPTY)
	private List<User> passagers ; 
	
	

	public long getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(long idTrajet) {
		this.idTrajet = idTrajet;
	}

	public String getDateDep() {
		return dateDep;
	}

	public void setDateDep(String dateDep) {
		this.dateDep = dateDep;
	}

	public String getDateRet() {
		return dateRet;
	}

	public void setDateRet(String dateRet) {
		this.dateRet = dateRet;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDropOff() {
		return dropOff;
	}

	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}



	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public List<User> getPassagers() {
		return passagers;
	}

	public void setPassagers(List<User> passagers) {
		this.passagers = passagers;
	}

	

	
	
	
	

}
