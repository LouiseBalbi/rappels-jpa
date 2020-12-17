package jpaTest.repo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpaTest.entite.Categorie;

@Repository
public interface CategorieRepo extends JpaRepository<Categorie, Integer> {
	
	Categorie findByDateMaj(LocalDate dateMaj);

}
