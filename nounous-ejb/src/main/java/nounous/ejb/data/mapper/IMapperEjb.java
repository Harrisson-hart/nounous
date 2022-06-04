package nounous.ejb.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import nounous.commun.dto.DtoCompte;
import nounous.commun.dto.DtoContrat;
import nounous.commun.dto.DtoEnfant;
import nounous.commun.dto.DtoGarder;
import nounous.commun.dto.DtoParent;
import nounous.ejb.data.Compte;
import nounous.ejb.data.Contrat;
import nounous.ejb.data.Enfant;
import nounous.ejb.data.Garder;
import nounous.ejb.data.Parent;


 
@Mapper( componentModel = "cdi" )
public interface IMapperEjb {  
	
	static final IMapperEjb INSTANCE = Mappers.getMapper( IMapperEjb.class );
	
	
	// Compte
	
	Compte map( DtoCompte source );
	
	DtoCompte map( Compte source );
	
	// Contrat
	Contrat map( DtoContrat source );
	
	DtoContrat map( Contrat source );
//		
	// Enfant
	Enfant map( DtoEnfant source );
	
	DtoEnfant map( Enfant source );
//	
	// Garder
	Garder map( DtoGarder source );
	
	DtoGarder map( Garder source );
	
	// Parent
	Parent map( DtoParent source );
	
	DtoParent map( Parent source );

	
	// Categorie
	
//	Categorie map( DtoCategorie source );
//	
//	DtoCategorie map( Categorie source );

	
	// Personne
	
//	Personne map( DtoPersonne source );
//	
//	DtoPersonne map( Personne source );
//
//	@Mapping( target="categorie", ignore = true )
//	@Mapping( target="telephones", ignore = true )
//	DtoPersonne mapMinimal( Personne source );
//	
	
	// Telephone
	
//	@Mapping( target="personne", ignore=true )
//	Telephone map( DtoTelephone source );
//	
//	DtoTelephone map( Telephone source );
//	

	// Méthodes auxiliaires
	
//    @AfterMapping
//    public default void addBackReference(@MappingTarget Personne target) {
//        for (Telephone telephone : target.getTelephones() ) {
//        	telephone.setPersonne( target );
//        }
//    }	
	
}
