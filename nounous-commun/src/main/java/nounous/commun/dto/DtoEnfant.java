package nounous.commun.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@SuppressWarnings("serial")
public class DtoEnfant implements Serializable {

	private int id;

	private String nom;

	private String prenom;
	
	private Date dateNaissance;
	
	private String sexe;
	
	private List<DtoContrat> contrats = new ArrayList<DtoContrat>();

	private List<DtoGarder> garders = new ArrayList<DtoGarder>();

	private DtoParent parent;

	
	
	public DtoEnfant() {

	}

	public DtoEnfant(int id, String nom, String prenom, Date dateNaissance, String sexe, DtoParent parent) {

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

	public List<DtoContrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<DtoContrat> contrats) {
		this.contrats = contrats;
	}

	public List<DtoGarder> getGarders() {
		return garders;
	}

	public void setGarders(List<DtoGarder> garders) {
		this.garders = garders;
	}

	public DtoParent getParent() {
		return parent;
	}

	public void setParent(DtoParent parent) {
		this.parent = parent;
	}
	
	public boolean isInGarders( DtoGarder d ) {
		return garders.contains(d);
	}
	public boolean isInContrats( DtoContrat d ) {
		return contrats.contains(d);
	}

	
}
