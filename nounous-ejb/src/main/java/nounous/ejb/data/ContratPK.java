package nounous.ejb.data;

import java.io.Serializable;

import java.util.Objects;


@SuppressWarnings("serial")
public class ContratPK implements Serializable {

	private int idcompte;


	private int idenfant;


	public int getIdcompte() {
		return idcompte;
	}


	public void setIdcompte(int idcompte) {
		this.idcompte = idcompte;
	}


	public int getIdenfant() {
		return idenfant;
	}


	public void setIdenfant(int idenfant) {
		this.idenfant = idenfant;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idcompte, idenfant);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContratPK other = (ContratPK) obj;
		return idcompte == other.idcompte && idenfant == other.idenfant;
	}


}
