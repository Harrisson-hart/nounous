package nounous.jsf.data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;




@SuppressWarnings("serial")
public class Contrat implements Serializable {

	private Integer id;
	private Compte compte;

	private Enfant enfant;

	private Date dateDebut;

	private Date dateFin;

	private Double tarifHoraire;

	private Double indemniteRepas;

	private Double indemniteEntretien;

	
	public Contrat() {

	}

	public Contrat(int id, Compte compte, Enfant enfant, Date dateDebut, Date dateFin, Double tarifHoraire,
			Double indemniteRepas, Double indemniteEntretien) {
		super();
		this.id = id;
		this.compte = compte;
		this.enfant = enfant;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tarifHoraire = tarifHoraire;
		this.indemniteRepas = indemniteRepas;
		this.indemniteEntretien = indemniteEntretien;
	}
	
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Enfant getEnfant() {
		return enfant;
	}

	public void setEnfant(Enfant enfant) {
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

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrat other = (Contrat) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Contrat [id=" + id + ", compte=" + compte + ", enfant=" + enfant + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", tarifHoraire=" + tarifHoraire + ", indemniteRepas=" + indemniteRepas
				+ ", indemniteEntretien=" + indemniteEntretien + "]";
	}
	
	
	

}
