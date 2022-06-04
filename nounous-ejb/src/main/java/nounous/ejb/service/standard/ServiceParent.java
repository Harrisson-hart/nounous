package nounous.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import nounous.commun.dto.DtoParent;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceParent;
import nounous.ejb.dao.IDaoParent;
import nounous.ejb.data.Parent;
import nounous.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceParent implements IServiceParent {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoParent daoParent;

	// Actions

	@Override
	public int inserer(DtoParent dtoParent) throws ExceptionValidation {
		int id = daoParent.inserer(mapper.map(dtoParent));
		return id;
	}

	@Override
	public void modifier(DtoParent dtoParent) throws ExceptionValidation {
		daoParent.modifier(mapper.map(dtoParent));
	}

	@Override
	public void supprimer(int idParent) throws ExceptionValidation {
		daoParent.supprimer(idParent);
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoParent retrouver(int idParent) {
		return mapper.map(daoParent.retrouver(idParent));
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoParent> listerTout() {
		List<DtoParent> liste = new ArrayList<>();
		for (Parent parent : daoParent.listerTout()) {
			liste.add(mapper.map(parent));
		}
		return liste;
	}

}