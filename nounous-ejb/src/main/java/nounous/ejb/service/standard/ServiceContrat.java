package nounous.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import nounous.commun.dto.DtoContrat;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceContrat;
import nounous.ejb.dao.IDaoContrat;
import nounous.ejb.data.Contrat;
import nounous.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceContrat implements IServiceContrat {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoContrat daoContrat;

	// Actions

	@Override
	public int inserer(DtoContrat dtoContrat) throws ExceptionValidation {

		int id = daoContrat.inserer(mapper.map(dtoContrat));
		return id;
	}

	@Override
	public void modifier(DtoContrat dtoContrat) throws ExceptionValidation {
		daoContrat.modifier(mapper.map(dtoContrat));
	}

	@Override
	public void supprimer(int idContrat) throws ExceptionValidation {
		daoContrat.supprimer(idContrat);
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoContrat retrouver(int idContrat) {
		return mapper.map(daoContrat.retrouver(idContrat));
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoContrat> listerTout() {
		List<DtoContrat> liste = new ArrayList<>();
		for (Contrat contrat : daoContrat.listerTout()) {
			liste.add(mapper.map(contrat));
		}
		return liste;
	}

	@Override
	public List<DtoContrat> listerPourNounou(int idCompte) {
		List<DtoContrat> liste = new ArrayList<>();
		for (Contrat contrat : daoContrat.listerPourNounou(idCompte)) {
			liste.add(mapper.map(contrat));
		}
		return liste;
	}

}
