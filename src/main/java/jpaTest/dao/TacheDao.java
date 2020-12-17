package jpaTest.dao;

import java.time.LocalDate;

import jpaTest.entite.Tache;

public class TacheDao {
	
	public Tache creerTache(String description, LocalDate date) {
		Tache t = new Tache();
		t.setDescription(description);
		t.setDate(date);
		return t;
	}

}
