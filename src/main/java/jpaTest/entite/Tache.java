package jpaTest.entite;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE")
@DiscriminatorValue("Ta")
public class Tache {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="id_int")
	private Intervenant intervenant;
	
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the intervenant
	 */
	public Intervenant getIntervenant() {
		return intervenant;
	}
	/**
	 * @param intervenant the intervenant to set
	 */
	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
	
	
	
	
}
