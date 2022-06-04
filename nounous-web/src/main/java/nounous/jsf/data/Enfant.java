package nounous.jsf.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;




@SuppressWarnings("serial")
public class Enfant implements Serializable {


	private Integer id;

	private String nom;

	private String prenom;

	private Date dateNaissance;
	

	private String sexe;

	private List<Contrat> contrats= new ArrayList<>();


	private List<Garder> garders =new ArrayList<>();
	

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
	
	
	public Integer getId() {
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

	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}

	public List<Garder> getGarders() {
		return garders;
	}

	public void setGarders(List<Garder> garders) {
		this.garders = garders;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
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
		Enfant other = (Enfant) obj;
		return id == other.id;
	}
	
	
}
