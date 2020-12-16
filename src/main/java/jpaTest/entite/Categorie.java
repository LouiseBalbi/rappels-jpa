package jpaTest.entite;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	private LocalDate dateMaj;
	
	@OneToMany(mappedBy="categorie")
	private Set<Film> films = new HashSet<>();
	
	
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the dateMaj
	 */
	public LocalDate getDateMaj() {
		return dateMaj;
	}
	/**
	 * @param dateMaj the dateMaj to set
	 */
	public void setDateMaj(LocalDate dateMaj) {
		this.dateMaj = dateMaj;
	}
	/**
	 * @return the films
	 */
	public Set<Film> getFilms() {
		return films;
	}
	/**
	 * @param films the films to set
	 */
	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	
	

}
