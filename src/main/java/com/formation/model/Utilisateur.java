package com.formation.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Utilisateur {

	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private String prenom;
	private String departement;
	private String email;
	private String passe;
	private boolean membre;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(Integer id, String nom, String prenom, String departement, String email, String passe,
			boolean membre) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
		this.email = email;
		this.passe = passe;
		this.membre = membre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasse() {
		return passe;
	}
	public void setPasse(String passe) {
		this.passe = passe;
	}
	public boolean isMembre() {
		return membre;
	}
	public void setMembre(boolean membre) {
		this.membre = membre;
	}
	
	

}
