package nounous.ejb.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enfant")
public class Enfant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idenfant")
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "dateNaissance")
	private Date dateNaissance;
	
	@Column(name = "sexe")
	private String sexe;
	
//	@OneToMany(mappedBy = "enfant", cascade = CascadeType.ALL)
//	private List<Contrat> contrats =new ArrayList<>();
//
//	@OneToMany(mappedBy = "enfant", cascade = CascadeType.ALL)
//	private List<Garder> garders= new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name = "idparent")
	private Parent parent;

	
	
	
	
	public Enfant() {

	}

	public Enfant(int id, String nom, String prenom, Date dateNaissance, String sexe, Parent parent) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.parent = parent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

//	public List<Contrat> getContrats() {
//		return contrats;
//	}
//
//	public void setContrats(List<Contrat> contrats) {
//		this.contrats = contrats;
//	}
//
//	public List<Garder> getGarders() {
//		return garders;
//	}
//
//	public void setGarders(List<Garder> garders) {
//		this.garders = garders;
//	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	
	
	
}
