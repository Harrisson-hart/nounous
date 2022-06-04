package nounous.ejb.data;


import java.time.LocalTime;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name="garder")
public class Garder{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idgarder")
	private int id;
	@ManyToOne
	@JoinColumn(name = "idcompte")
	private Compte compte;
	
	@ManyToOne
	@JoinColumn(name = "idenfant")
	private Enfant enfant;
	
	@Column(name = "datearrivee")
	private Date dateArrivee;
	
	@Column(name = "amanger")
	private boolean aManger;
	
	@Column(name = "heurearrivee")
	private LocalTime heureArrivee;
	
	@Column(name = "heuredepart")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	

}
