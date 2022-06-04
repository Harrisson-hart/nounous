SET search_path TO nounous;


-- Supprime toutes les données
DELETE FROM role;
DELETE FROM compte;


-- Insère les données

INSERT INTO compte (IdCompte, Pseudo, MotDePasse, Email ) VALUES 
  (1, 'geek', 'geek', 'geek@3il.fr' ),
  (2, 'chef', 'chef', 'chef@3il.fr' );
ALTER TABLE compte ALTER COLUMN IdCompte RESTART WITH 3;
  
INSERT INTO role (IdCompte, Role) VALUES 
  ( 1, 'ADMINISTRATEUR' ),
  ( 1, 'UTILISATEUR' ),
  ( 2, 'NOUNOU' );


INSERT INTO parent (IdParent, Nom, Prenom, DateNaissance, Telephone, Adresse ) VALUES 
  (1, 'p_n_1', 'p_p_1', '1996-12-02', '0766237898', 'p_a_1' ),
  (2, 'p_n_2', 'p_p_2', '1996-12-02', '0766237898', 'p_a_2' ),
  (3, 'p_n_3', 'p_p_3', '1996-12-02', '0766237898', 'p_a_3' ),
  (4, 'p_n_4', 'p_p_4', '1996-12-02', '0766237898', 'p_a_4' ),
  (5, 'p_n_5', 'p_p_5', '1996-12-02', '0766237898', 'p_a_5' );
ALTER TABLE parent ALTER COLUMN IdParent RESTART WITH 6;
  
INSERT INTO enfant (IdEnfant, IdParent, Nom, Prenom, DateNaissance, Sexe ) VALUES 
  (1, 1, 'e_n_1', 'e_p_1', '1996-12-02', 'M' ),
  (2, 1, 'e_n_2', 'e_p_2', '1996-12-02', 'F' ),
  (3, 2, 'e_n_3', 'e_p_3', '1996-12-02', 'M' ),
  (4, 3, 'e_n_4', 'e_p_4', '1996-12-02', 'M' ),
  (5, 4, 'e_n_5', 'e_p_5', '1996-12-02', 'A' );
ALTER TABLE enfant ALTER COLUMN IdEnfant RESTART WITH 6;
    
INSERT INTO contrat (IdContrat, IdEnfant, IdCompte, DateDebut, DateFin, TarifHoraire, IndemniteRepas, IndemniteEntretien ) VALUES 
  (1, 1, 1, '1996-12-02', '1996-12-02', 10.00, 10.00, 10.00 ),
  (2, 2, 1, '1996-12-02', '1996-12-02', 10.00, 10.00, 10.00 ),
  (3, 3, 1, '1996-12-02', '1996-12-02', 10.00, 10.00, 10.00 ),
  (4, 4, 1, '1996-12-02', '1996-12-02', 10.00, 10.00, 10.00 ),
  (5, 5, 1, '1996-12-02', '1996-12-02', 10.00, 10.00, 10.00 );
  ALTER TABLE contrat ALTER COLUMN IdContrat RESTART WITH 6;
    
INSERT INTO garder (IdGarder, IdEnfant, IdCompte, DateArrivee, AManger, HeureArrivee, HeureDepart ) VALUES 
  (1, 1, 1, '1996-12-02', true, '09:00:00', '09:00:00' ),
  (2, 1, 1, '1996-12-02', false, '09:00:00', '09:00:00' ),
  (3, 3, 1, '1996-12-02', true, '09:00:00', '09:00:00' );
  ALTER TABLE garder ALTER COLUMN IdGarder RESTART WITH 4;
    

