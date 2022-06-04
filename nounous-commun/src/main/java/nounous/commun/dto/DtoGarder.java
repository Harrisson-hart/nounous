package nounous.commun.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;



@SuppressWarnings("serial")
public class DtoGarder implements Serializable {
	

	

	private int id;

	private DtoCompte compte;
	

	private DtoEnfant enfant;
	

	private Date dateArrivee;
	

	private boolean aManger;
	

	private LocalTime heureArrivee;
	
	private LocalTime heureDepart;
	
	
	

	public DtoGarder() {

	}

	public DtoGarder(int id, DtoCompte compte, DtoEnfant enfant, Date dateArrivee, boolean aManger,
			LocalTime heureArrivee, LocalTime heureDepart) {
		this.id = id;
		this.compte = compte;
		this.enfant = enfant;
		this.dateArrivee = dateArrivee;
		this.aManger = aManger;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
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

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public boolean isaManger() {
		return aManger;
	}

	public void setaManger(boolean aManger) {
		this.aManger = aManger;
	}

	public LocalTime getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(LocalTime heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public LocalTime getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(LocalTime heureDepart) {
		this.heureDepart = heureDepart;
	}
	
	
	
	
}
