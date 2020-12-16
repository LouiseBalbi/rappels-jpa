package jpaTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.tools.javac.Main;

@SpringBootApplication
public class TestJpa implements CommandLineRunner{

	
	public static void main(String[] args) {
		
		//exo 1
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
//		EntityManager em = entityManagerFactory.createEntityManager();
		
		SpringApplication.run(TestJpa.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
