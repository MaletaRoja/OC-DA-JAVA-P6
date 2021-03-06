package com.formation.escalade.model;

public class FormSite {

	private Integer idSite;
	private String nomSite;
	private String localisationSite;
	private int departementSite;
	private String remSite;
	
	private String nomSecteur;
	
	
	private String nomVoie;
	private String cotationVoie;
	
	private int nbreSpit;
	private String nomLongueur;
	private String cotationLongueur;
	
	
	public FormSite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FormSite(Integer idSite, String nomSite, String localisationSite, int departementSite, String remSite,
			String nomSecteur, String nomVoie, String cotationVoie, int nbreSpit, String nomLongueur,
			String cotationLongueur) {
		super();
		this.idSite = idSite;
		this.nomSite = nomSite;
		this.localisationSite = localisationSite;
		this.departementSite = departementSite;
		this.remSite = remSite;
		this.nomSecteur = nomSecteur;
		this.nomVoie = nomVoie;
		this.cotationVoie = cotationVoie;
		this.nbreSpit = nbreSpit;
		this.nomLongueur = nomLongueur;
		this.cotationLongueur = cotationLongueur;
	}


	public Integer getIdSite() {
		return idSite;
	}


	public void setIdSite(Integer idSite) {
		this.idSite = idSite;
	}


	public String getNomSite() {
		return nomSite;
	}


	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
	}


	public String getLocalisationSite() {
		return localisationSite;
	}


	public void setLocalisationSite(String localisationSite) {
		this.localisationSite = localisationSite;
	}


	public int getDepartementSite() {
		return departementSite;
	}


	public void setDepartementSite(int departementSite) {
		this.departementSite = departementSite;
	}


	public String getRemSite() {
		return remSite;
	}


	public void setRemSite(String remSite) {
		this.remSite = remSite;
	}


	public String getNomSecteur() {
		return nomSecteur;
	}


	public void setNomSecteur(String nomSecteur) {
		this.nomSecteur = nomSecteur;
	}


	public String getNomVoie() {
		return nomVoie;
	}


	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}


	public String getCotationVoie() {
		return cotationVoie;
	}


	public void setCotationVoie(String cotationVoie) {
		this.cotationVoie = cotationVoie;
	}


	public int getNbreSpit() {
		return nbreSpit;
	}


	public void setNbreSpit(int nbreSpit) {
		this.nbreSpit = nbreSpit;
	}


	public String getNomLongueur() {
		return nomLongueur;
	}


	public void setNomLongueur(String nomLongueur) {
		this.nomLongueur = nomLongueur;
	}


	public String getCotationLongueur() {
		return cotationLongueur;
	}


	public void setCotationLongueur(String cotationLongueur) {
		this.cotationLongueur = cotationLongueur;
	}


	@Override
	public String toString() {
		return "FormSite [idSite=" + idSite + ", nomSite=" + nomSite + ", localisationSite=" + localisationSite
				+ ", departementSite=" + departementSite + ", remSite=" + remSite + ", nomSecteur=" + nomSecteur
				+ ", nomVoie=" + nomVoie + ", cotationVoie=" + cotationVoie + ", nbreSpit=" + nbreSpit
				+ ", nomLongueur=" + nomLongueur + ", cotationLongueur=" + cotationLongueur + "]";
	}
	
	
	
	
}
