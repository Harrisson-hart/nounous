package nounous.ejb.dao;

import java.util.List;

import nounous.ejb.data.Garder;


public interface IDaoGarder {

	int			inserer( Garder garder );

	void 		modifier( Garder garder );

	void 		supprimer( int idGarder );

	Garder 		retrouver( int idGarder );

	List<Garder> listerTout();

}
