package jpaTest.dao;

import java.time.LocalDate;

import jpaTest.entite.TacheDatee;

public class TacheDateeDao {
	
	public TacheDatee creerTacheDatee(String description, LocalDate date, LocalDate dateEcheance) {
		TacheDatee t = new TacheDatee();
		t.setDescription(description);
		t.setDate(date);
		t.setDate(dateEcheance);
		return t;
	}

}
