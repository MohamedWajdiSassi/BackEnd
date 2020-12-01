package com.tekup.soap.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="User")
public class User implements Serializable  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser ;
@Column(name="nom")
	private String  nom ;
@Column(name="prenom")
	private String prenom ;
@Column(name="email")
	private  String email ;
@Column(name="numTel")
	private String numTel ;
@Column(name="password")
	private String password ;
@Column(name="genre")
	private String genre ;

	@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
	@JsonManagedReference
	@JsonInclude( Include.NON_NULL)
	private List<Voiture> voitures ;
	


	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", numTel="
				+ numTel + ", password=" + password + ", genre=" + genre + ", voitures=" + voitures + "]";
	}
	


	
	
	
	

	

}
