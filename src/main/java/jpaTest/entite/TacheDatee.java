package jpaTest.entite;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Td")
public class TacheDatee extends Tache {
	
	private LocalDate dateEcheance;

	public TacheDatee() {
	}

	/**
	 * @return the dateEcheance
	 */
	public LocalDate getDateEcheance() {
		return dateEcheance;
	}

	/**
	 * @param dateEcheance the dateEcheance to set
	 */
	public void setDateEcheance(LocalDate dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	
}
