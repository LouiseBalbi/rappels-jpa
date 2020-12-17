package jpaTest.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Intervenant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	
	@ManyToMany
	@JoinTable(name="film_int",
	joinColumns= @JoinColumn(name="id_int", referencedColumnName="id"),
	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName="id")
	)
	private Set<Film> films = new HashSet<>();
	
	@OneToMany(mappedBy="intervenant")
	private Set<Tache> taches = new HashSet<>();
	
	@OneToOne(mappedBy = "intervenant")
	private Adresse adresse;
	
	/**
	 * 
	 */
	public Intervenant() {
		super();
	}
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(Integer id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	/**
	 * @return the taches
	 */
	public Set<Tache> getTaches() {
		return taches;
	}
	/**
	 * @param taches the taches to set
	 */
	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}
	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	

}
