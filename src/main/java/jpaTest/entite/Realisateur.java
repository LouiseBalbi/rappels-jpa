package jpaTest.entite;

import javax.persistence.Entity;

@Entity
public class Realisateur extends Intervenant {
	
	private double commission;

	public Realisateur() {
	}

	public Realisateur(Integer id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	/**
	 * @return the commission
	 */
	public double getCommission() {
		return commission;
	}

	/**
	 * @param commission the commission to set
	 */
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	

}
