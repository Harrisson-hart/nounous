package nounous.jsf.model.standard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import nounous.commun.dto.DtoContrat;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceContrat;
import nounous.jsf.data.Contrat;
import nounous.jsf.data.mapper.IMapper;
import nounous.jsf.util.CompteActif;
import nounous.jsf.util.UtilJsf;


@SuppressWarnings("serial")
@Named
@ViewScoped
public class ModelContrat implements Serializable {

	
	// Champs
	
	private List<Contrat>	liste;
	private List<Contrat>	listec;
	private Contrat			courant;
	
	@EJB
	private IServiceContrat	serviceContrat;
	
	@Inject
	private IMapper			mapper;

	@Inject
	private CompteActif		compteActif;
	
	// Getters 
	
	public List<Contrat> getListe() {
		if ( liste == null ) {
			liste = new ArrayList<>();
			for ( DtoContrat dto : serviceContrat.listerTout() ) {
				liste.add( mapper.map( dto ) );
			}
		}
		for (Contrat contrat : liste) {
			System.out.println(contrat.toString());
		}
		return liste;
	}
	
	public List<Contrat> getListePourNounou() {
		if ( listec == null ) {
			listec = new ArrayList<>();
			for ( DtoContrat dto : serviceContrat.listerPourNounou(compteActif.getId()) ) {
				listec.add( mapper.map( dto ) );
			}
		}
		return listec;
	}
	
		public Contrat getCourant() {
			if ( courant == null ) {
				courant = new Contrat();
			}
			return courant;
		}
	
	
	// Initialisaitons
	
	public String actualiserCourant() {
		if ( courant != null ) {
			DtoContrat dto = serviceContrat.retrouver( courant.getId() ); 
			if ( dto == null ) {
				UtilJsf.messageError( "Le contrat demandé n'existe pas" );
				return "test/liste";
			} else {
				courant = mapper.map( dto );
			}
		}
		return null;
	}
	
	
	// Actions
	
	public String validerMiseAJour() {
		try {
			if ( courant.getId() == null) {
				serviceContrat.inserer( mapper.map(courant) );
			} else {
				serviceContrat.modifier( mapper.map(courant) );
			}
			UtilJsf.messageInfo( "Mise à jour effectuée avec succès." );
			return "liste";
		} catch (ExceptionValidation e) {
			UtilJsf.messageError(e);
			return null;
		}
	}
	
	public String supprimer( Contrat item ) {
		try {
			serviceContrat.supprimer( item.getId() );
			liste.remove(item);
			UtilJsf.messageInfo( "Suppression effectuée avec succès." );
		} catch (ExceptionValidation e) {
			UtilJsf.messageError( e ); 
		}
		return null;
	}
	
}
