package nounous.commun.dto;

import java.io.Serializable;
import java.util.Date;





@SuppressWarnings("serial")
public class DtoParent implements Serializable {

	// Champs


	private Integer id;

	private String nom;

	private String prenom;

	private String telephone;

	private String adresse;
	private Date dateNaissance;
	
	
	
	
	
	public DtoParent() {

	}
	public DtoParent(Integer id, String nom, String prenom, String telephone, String adresse, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
