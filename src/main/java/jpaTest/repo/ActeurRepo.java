package jpaTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpaTest.entite.Acteur;

@Repository
public interface ActeurRepo extends JpaRepository<Acteur, Integer>{

	Acteur findByNomAndPrenom(String nom, String prenom);
	
	
}
