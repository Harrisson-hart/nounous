package nounous.ejb.data;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//OK
@Entity
@Table(name = "contrat")
public class Contrat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontrat")
	private int id;

	@ManyToOne
	@JoinColumn(name = "idcompte")
	private Compte compte;

	@ManyToOne
	@JoinColumn(name = "idenfant")
	private Enfant enfant;

	@Column(name = "datedebut")
	private Date dateDebut;

	@Column(name = "datefin")
	private Date dateFin;

	@Column(name = "tarifhoraire")
	private Double tarifHoraire;

	@Column(name = "indemniterepas")
	private Double indemniteRepas;

	@Column(name = "indemniteentretien")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
