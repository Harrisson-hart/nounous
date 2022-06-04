package nounous.jsf.data;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class Nounou implements Serializable {

	Integer id;
	private String nom;
	private String prenom;
	
	
	public Nounou(Integer id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Nounou( ) {

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
		Nounou other = (Nounou) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
