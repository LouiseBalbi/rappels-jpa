package jpaTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sun.tools.javac.Main;

import jpaTest.dao.ActeurDao;
import jpaTest.dao.AdresseDao;
import jpaTest.dao.FilmDao;
import jpaTest.dao.ProducteurDao;
import jpaTest.dao.RealisateurDao;
import jpaTest.dao.TacheDao;
import jpaTest.dao.TacheDateeDao;
import jpaTest.entite.Acteur;
import jpaTest.entite.Adresse;
import jpaTest.entite.Categorie;
import jpaTest.entite.Film;
import jpaTest.entite.Producteur;
import jpaTest.entite.Realisateur;
import jpaTest.entite.Tache;
import jpaTest.entite.TacheDatee;
import jpaTest.repo.ActeurRepo;
import jpaTest.repo.CategorieRepo;
import jpaTest.repo.FilmRepo;


@SpringBootApplication
@EnableTransactionManagement
public class TestJpa implements CommandLineRunner {

	@PersistenceContext
	private EntityManager em;
	
	
	CategorieRepo categorieRepo;
	ActeurRepo acteurRepo;
	FilmRepo filmRepo;
	
	public TestJpa(CategorieRepo categorieRepo, ActeurRepo acteurRepo, FilmRepo filmRepo) {
		this.categorieRepo = categorieRepo;
		this.acteurRepo = acteurRepo;
		this.filmRepo = filmRepo;
	}

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
//		Film f = em.find(Film.class, 1);
//		Acteur a = em.find(Acteur.class, 1);
//		System.out.println(f.toString());
//		System.out.println(a.toString());

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
//		 Categorie cat10 = em.find(Categorie.class,10); 
//         em.remove(cat10);
//
//        Categorie cat13 = em.find(Categorie.class, 13);
//        em.remove(cat13);
		
		
		////// avec SpringData
		
//		Film film = filmRepo.findByTitre("Traque à Boston");
//		System.out.println(film);
		
//		Acteur acteur = acteurRepo.findByNomAndPrenom("WAHLBERG", "Mark");
//		System.out.println(acteur);
//		
//		Film film = filmRepo.findByTitre("Traque à Boston");
//		System.out.println(film);
		
//		LocalDate date = LocalDate.of(2006,2,15);
//		Categorie categorie = categorieRepo.findByDateMaj(date);
//		System.out.println(categorie);
		
		
		//////TP 3
		ActeurDao acteurDao = new ActeurDao();
		Acteur acteur = acteurDao.creerActeur("Depp2", "Johnny2", "agence", 0);
		em.persist(acteur);
		
		Acteur acteur2 = acteurDao.creerActeur("Orlando", "Bloom", "agence", 150);
		em.persist(acteur2);
		
		Acteur acteur3 = acteurDao.creerActeur("truc", "truc", "agence", 150);
		em.persist(acteur3);
		
		AdresseDao adresseDao = new AdresseDao();
		Adresse adresse = adresseDao.creerAdresse(2, "rue de la liberte", "Montpellier", 34000);
		em.persist(adresse);
		
		ProducteurDao producteurDao = new ProducteurDao();
		Producteur p = producteurDao.creerProducteur("le", "producteur", 120);
		em.persist(p);
		
		RealisateurDao realisateurDao = new RealisateurDao();
		Realisateur r = realisateurDao.creerRealisateur("nomreal", "prenomreal", 30);
		em.persist(r);
		
		TacheDao tacheDao = new TacheDao();
		Tache tache = tacheDao.creerTache("test", LocalDate.now());
		em.persist(tache);
		
		TacheDateeDao tacheDateeDao = new TacheDateeDao();
		TacheDatee tacheDatee = tacheDateeDao.creerTacheDatee("test", LocalDate.now(), LocalDate.now());
		em.persist(tacheDatee);
		
		FilmDao filmDao = new FilmDao();
		Film f = filmDao.creerFilm("Pirates des caraibes 2");
		em.persist(f);
		
		f.getIntervenants().add(acteurRepo.findByNomAndPrenom("Orlando", "Bloom"));
		f.getIntervenants().add(acteurRepo.findByNomAndPrenom("truc", "truc"));
		acteurRepo.findByNomAndPrenom("Depp2", "Johnny2").setAdresse(adresse);
		acteurRepo.findByNomAndPrenom("Depp2", "Johnny2").getTaches().add(tache);
		acteurRepo.findByNomAndPrenom("Depp2", "Johnny2").getTaches().add(tacheDatee);

		
	}

}
