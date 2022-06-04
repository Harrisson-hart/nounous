package nounous.jsf.data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;




@SuppressWarnings("serial")
public class Garder implements Serializable {
	

	private Integer id;

	private Compte compte;
	

	private Enfant enfant;

	private Date dateArrivee;
	

	private boolean aManger;

	private LocalTime heureArrivee;
	

	private LocalTime heureDepart;
	
	
	public Garder() {
	}

	public Garder(int id, Compte compte, Enfant enfant, Date dateArrivee, boolean aManger, LocalTime heureArrivee,
			LocalTime heureDepart) {
		super();
		this.id = id;
		this.compte = compte;
		this.enfant = enfant;
		this.dateArrivee = dateArrivee;
		this.aManger = aManger;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
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
		Garder other = (Garder) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
