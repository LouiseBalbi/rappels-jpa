package jpaTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpaTest.entite.Film;

@Repository
public interface FilmRepo extends JpaRepository<Film, Integer> {

	Film findByTitre(String titre);
}
