package jpaTest.dao;

import jpaTest.entite.Realisateur;

public class RealisateurDao {
	
	public Realisateur creerRealisateur(String nom, String prenom, double commission) {
		Realisateur r = new Realisateur();
		r.setNom(nom);
		r.setPrenom(prenom);
		r.setCommission(commission);
		return r;
	}

}
