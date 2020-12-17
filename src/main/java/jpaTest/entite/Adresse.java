package jpaTest.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numeroRue;
	private String libelleRue;
	private String ville;
	private Integer codePostal;
	
	@OneToOne
	@JoinColumn(name="id_int")
	private Intervenant intervenant;
	
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
	/**
	 * @return the numeroRue
	 */
	public Integer getNumeroRue() {
		return numeroRue;
	}
	/**
	 * @param numeroRue the numeroRue to set
	 */
	public void setNumeroRue(Integer numeroRue) {
		this.numeroRue = numeroRue;
	}
	/**
	 * @return the libelleRue
	 */
	public String getLibelleRue() {
		return libelleRue;
	}
	/**
	 * @param libelleRue the libelleRue to set
	 */
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	
	

}
