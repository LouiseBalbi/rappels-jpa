package jpaTest.entite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Acteur extends Intervenant{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	private String nom;
//	private String prenom;
	private String agence;
	private double salaire;
	
//	@ManyToMany
//	@JoinTable(name="film_acteur",
//	joinColumns= @JoinColumn(name="id_acteur", referencedColumnName="id"),
//	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName="id")
//	)
//	private Set<Film> films = new HashSet<>();
	
	
//	/**
//	 * @param nom
//	 * @param prenom
//	 */
//	public Acteur(String nom, String prenom) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//	}
//		
//	/**
//	 * 
//	 */
	public Acteur() {
		super();
	}
	


	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Acteur(Integer id, String nom, String prenom) {
		super(id, nom, prenom);
	}



	/**
	 * @return the agence
	 */
	public String getAgence() {
		return agence;
	}



	/**
	 * @param agence the agence to set
	 */
	public void setAgence(String agence) {
		this.agence = agence;
	}



	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}



	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	


//	/**
//	 * @return the id
//	 */
//	public Integer getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	/**
//	 * @return the nom
//	 */
//	public String getNom() {
//		return nom;
//	}
//	/**
//	 * @param nom the nom to set
//	 */
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//	/**
//	 * @return the prenom
//	 */
//	public String getPrenom() {
//		return prenom;
//	}
//	/**
//	 * @param prenom the prenom to set
//	 */
//	public void setPrenom(String prenom) {
//		this.prenom = prenom;
//	}
//	/**
//	 * @return the films
//	 */
//	public Set<Film> getFilms() {
//		return films;
//	}
//	/**
//	 * @param films the films to set
//	 */
//	public void setFilms(Set<Film> films) {
//		this.films = films;
//	}
//	
//	@Override
//	public String toString() {
//		return "Acteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
//	}
	
	
	
}
