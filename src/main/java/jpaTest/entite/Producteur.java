package jpaTest.entite;

import javax.persistence.Entity;

@Entity
public class Producteur extends Intervenant {
	
	private double budget;

	public Producteur() {
	}

	public Producteur(Integer id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	/**
	 * @return the budget
	 */
	public double getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	

}
