package nounous.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import nounous.commun.dto.DtoContrat;
import nounous.commun.dto.DtoGarder;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceGarder;
import nounous.ejb.dao.IDaoGarder;
import nounous.ejb.data.Contrat;
import nounous.ejb.data.Garder;
import nounous.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceGarder implements IServiceGarder {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoGarder daoGarder;

	// Actions

	@Override
	public int inserer(DtoGarder dtoGarder) throws ExceptionValidation {

		int id = daoGarder.inserer(mapper.map(dtoGarder));
		return id;
	}

	@Override
	public void modifier(DtoGarder dtoGarder) throws ExceptionValidation {
		daoGarder.modifier(mapper.map(dtoGarder));
	}

	@Override
	public void supprimer(int idGarder) throws ExceptionValidation {
		daoGarder.supprimer(idGarder);
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoGarder retrouver(int idGarder) {
		return mapper.map(daoGarder.retrouver(idGarder));
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoGarder> listerTout() {
		List<DtoGarder> liste = new ArrayList<>();
		for (Garder garder : daoGarder.listerTout()) {
			liste.add(mapper.map(garder));
		}
		return liste;
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoGarder> listerPourNounou(int idCompte) {
		List<DtoGarder> liste = new ArrayList<>();
		for (Garder garder : daoGarder.listerPourNounou(idCompte)) {
			liste.add(mapper.map(garder));
		}
		return liste;
	}
}
