package nounous.commun.dto;

import java.io.Serializable;

import java.util.Date;

@SuppressWarnings("serial")
public class DtoContrat implements Serializable {

	private int id;

	private DtoCompte compte;

	private DtoEnfant enfant;

	private Date dateDebut;

	private Date dateFin;

	private Double tarifHoraire;

	private Double indemniteRepas;

	private Double indemniteEntretien;

	
	
	
	
	
	public DtoContrat() {

	}

	public DtoContrat(int id, DtoCompte dtocompte, DtoEnfant dtoenfant, Date dateDebut, Date dateFin,
			Double tarifHoraire, Double indemniteRepas, Double indemniteEntretien) {
		this.id = id;
		this.compte = dtocompte;
		this.enfant = dtoenfant;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tarifHoraire = tarifHoraire;
		this.indemniteRepas = indemniteRepas;
		this.indemniteEntretien = indemniteEntretien;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DtoCompte getCompte() {
		return compte;
	}

	public void setCompte(DtoCompte compte) {
		this.compte = compte;
	}

	public DtoEnfant getEnfant() {
		return enfant;
	}

	public void setEnfant(DtoEnfant enfant) {
		this.enfant = enfant;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTarifHoraire() {
		return tarifHoraire;
	}

	public void setTarifHoraire(Double tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}

	public Double getIndemniteRepas() {
		return indemniteRepas;
	}

	public void setIndemniteRepas(Double indemniteRepas) {
		this.indemniteRepas = indemniteRepas;
	}

	public Double getIndemniteEntretien() {
		return indemniteEntretien;
	}

	public void setIndemniteEntretien(Double indemniteEntretien) {
		this.indemniteEntretien = indemniteEntretien;
	}

	
	
}
