package jpaTest.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	@Column(name="annee_sortie")
	private String anneeSortie;
	@ManyToOne
	@JoinColumn(name="id_categ")
	private Categorie categorie;
	
	@ManyToMany
	@JoinTable(name="film_acteur",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName="id"),
	inverseJoinColumns= @JoinColumn(name="id_acteur", referencedColumnName="id")
	)
	private Set<Acteur> acteurs = new HashSet<>();
	
	
	
	/**
	 * @param tritre
	 */
	public Film(String titre) {
		super();
		this.titre = titre;
	}
	

	/**
	 * 
	 */
	public Film() {
		super();
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param tritre the tritre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the anneeSortie
	 */
	public String getAnneeSortie() {
		return anneeSortie;
	}
	/**
	 * @param anneeSortie the anneeSortie to set
	 */
	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	/**
	 * @return the acteurs
	 */
	public Set<Acteur> getActeurs() {
		return acteurs;
	}
	/**
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(Set<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
	
	@Override
	public String toString() {
		return "Film [id=" + id + ", tritre=" + titre + ", anneeSortie=" + anneeSortie + "]";
	}
	
	

}
