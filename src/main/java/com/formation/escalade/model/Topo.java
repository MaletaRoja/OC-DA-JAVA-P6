package com.formation.escalade.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Topo {

	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private String description;
	private String lieu;
	private Date date;
	private boolean disponible;
	//private Integer idUtilisateur;
	//private Integer idSite;
	
	@OneToMany(mappedBy = "topo")
	List<Demande> demandes;
	
	@ManyToOne
	//@JoinColumn(name="id_site")
	private Site site;
	
	@OneToOne
	private Utilisateur proprietaire;

	public Topo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topo(Integer id, String nom, String description, String lieu, Date date, boolean disponible,
			List<Demande> demandes, Site site) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.lieu = lieu;
		this.date = date;
		this.disponible = disponible;
		this.demandes = demandes;
		this.site = site;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public List<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
	
	

	
}
