package jpaTest.dao;

import jpaTest.entite.Producteur;

public class ProducteurDao {

	public Producteur creerProducteur(String nom, String prenom, double budget) {
		Producteur p = new Producteur();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setBudget(budget);
		return p;
	}

}
