SET search_path TO nounous;


-- Schéma

DROP SCHEMA IF EXISTS nounous CASCADE;
CREATE SCHEMA nounous AUTHORIZATION nounous;
GRANT ALL PRIVILEGES ON SCHEMA nounous TO nounous;


-- Tables
--ok
CREATE TABLE compte (
	IdCompte		INT			 	NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	Pseudo			VARCHAR(25)		NOT NULL,
	MotDePasse		VARCHAR(25) 	NOT NULL,
	Email			VARCHAR(100)	NOT NULL,
	PRIMARY KEY (IdCompte)
);

CREATE UNIQUE INDEX idx_compte_pseudo ON compte (Pseudo ASC);
--ok
CREATE TABLE role (
	IdCompte		INT				NOT NULL,
	Role			VARCHAR(20)		NOT NULL,
	CHECK( Role IN ('ADMINISTRATEUR','UTILISATEUR', 'NOUNOU', 'PARENT') ),	
	FOREIGN KEY (IdCompte) REFERENCES compte (IdCompte),
	PRIMARY KEY (IdCompte, Role)
);

--CREATE TABLE nounou (
--	IdNounou	INT NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
--	Nom			VARCHAR(25)  	NOT NULL,
--	Prenom		VARCHAR(25)  	NOT NULL,
--	PRIMARY KEY (idNounou)
--);

--ok
CREATE TABLE parent (
	IdParent		INT NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	Nom				VARCHAR(25)  	NOT NULL,
	Prenom			VARCHAR(25)  	NOT NULL,
	DateNaissance	Date	NOT	NULL,
	Telephone		VARCHAR(25)  	NOT NULL,
	Adresse			VARCHAR(25)  	NOT NULL,
	PRIMARY KEY (idParent)
);
--ok
CREATE TABLE enfant (
	IdEnfant			INT NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	idParent			INT	NOT NULL,
	Nom					VARCHAR(25)  	NOT NULL,
	Prenom				VARCHAR(25)  	NOT NULL,
	DateNaissance		Date	NOT	NULL,
	Sexe				VARCHAR(20)		NOT NULL,
	CHECK( Sexe IN ('M','F', 'A') ),	
	PRIMARY KEY (idEnfant),
	FOREIGN KEY (IdParent) REFERENCES parent (IdParent)
);


--ok
CREATE TABLE contrat (
	IdContrat			INT NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	IdEnfant			INT		NOT NULL,
	IdCompte			INT		NOT NULL,
	DateDebut			Date	NOT	NULL,
	DateFin				Date	NOT	NULL,
	TarifHoraire 		NUMERIC(10,2),
	IndemniteRepas 		NUMERIC(10,2),
	IndemniteEntretien	NUMERIC(10,2),
	PRIMARY KEY (IdContrat),
	FOREIGN KEY (IdCompte) REFERENCES compte (IdCompte),
	FOREIGN KEY (IdEnfant) REFERENCES enfant (IdEnfant)
);
--ok

CREATE TABLE garder (
	idGarder		INT NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	IdEnfant		INT		NOT NULL,
	IdCompte		INT		NOT NULL,
	DateArrivee		Date	NOT	NULL,
	AManger			BOOLEAN	NOT NULL,
	HeureArrivee 	TIME NOT NULL,
	HeureDepart 	TIME NOT NULL,
	PRIMARY KEY (IdGarder),
	FOREIGN KEY (IdCompte) REFERENCES compte (IdCompte),
	FOREIGN KEY (IdEnfant) REFERENCES enfant (IdEnfant)
);

