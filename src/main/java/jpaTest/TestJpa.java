package jpaTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sun.tools.javac.Main;

import jpaTest.entite.Acteur;
import jpaTest.entite.Categorie;
import jpaTest.entite.Film;

@SpringBootApplication
@EnableTransactionManagement
public class TestJpa implements CommandLineRunner {

	@PersistenceContext
	private EntityManager em;

	public static void main(String[] args) {

		// exo 1
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
//		EntityManager em = entityManagerFactory.createEntityManager();

		// exo 2
		SpringApplication.run(TestJpa.class, args);

	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Film f = em.find(Film.class, 1);
		Acteur a = em.find(Acteur.class, 1);
		System.out.println(f.toString());
		System.out.println(a.toString());

		// ajout d'un acteur
//	Acteur acteur = new Acteur("Pegg", "Simon");
//	em.persist(acteur);

		// lier un acteur à un film
//		Acteur a2 = em.find(Acteur.class, 8);
//		Film f2 = em.find(Film.class, 3);
//		a2.getFilms().add(f2);

		// changer la date du film 4
//		Film f3 = em.find(Film.class, 4);
//		f3.setAnneeSortie("2019");
		
		
		// créer un film
//		Categorie cat = em.find(Categorie.class, 8);
//		
//		Film f4 = new Film("Pirate des caraibes");
//		f4.setAnneeSortie("2003");
//		f4.setCategorie(cat);
//		Acteur a3 = new Acteur("Depp","Johnny");
//		Acteur a4 = new Acteur("Bloom","Orlando");
//		Acteur a5 = new Acteur("truc","bidule");
//		em.persist(f4);
//		em.persist(a3);
//		em.persist(a4);
//		em.persist(a5);
		
		// lier le film créé aux acteurs
//		Film f5 = em.find(Film.class, 7);
//		Acteur a3 = em.find(Acteur.class, 15);
//		Acteur a4 = em.find(Acteur.class, 16);
//		Acteur a5 = em.find(Acteur.class, 17);
//		a3.getFilms().add(f5);
//		a4.getFilms().add(f5);
//		a5.getFilms().add(f5);
		
		
		// supprimer des categories
		 Categorie cat10 = em.find(Categorie.class,10); 
         em.remove(cat10);

        Categorie cat13 = em.find(Categorie.class, 13);
        em.remove(cat13);

		
	}

}
