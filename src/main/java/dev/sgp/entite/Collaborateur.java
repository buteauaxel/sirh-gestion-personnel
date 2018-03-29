/**
 * 
 */
package dev.sgp.entite;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.*;
/**
 * @author Axel B.
 *
 */
@Entity
public class Collaborateur {
	
	
	/** id : int
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private String matricule;
	/** nom : String
	 * 
	 */
	private String nom;
	/** prenom : String
	 * 
	 */
	private String prenom;
	/** DateDeNaissance : LocalDate
	 * 
	 */
	@Column(name="DateDeNaissance")
	private LocalDate DateDeNaissance;
	/** adresse : String
	 * 
	 */
	private String adresse;
	/** numeroSecuriteSociale : String
	 * 
	 */
	private String numeroSecuriteSociale;
	/** emailPro : String
	 * 
	 */
	private String emailPro;
	/** photo : String
	 * 
	 */
	private String photo;
	/** dateHeureCreation : ZonedDateTime
	 * 
	 */
	@Column(name="DateHeureCreation")
	private ZonedDateTime dateHeureCreation;
	/** actif : Boolean
	 * 
	 */
	private Boolean actif;
	
	public static int compteur =1;
	/** intitulePoste : String
	 * 
	 */
	private String intitulePoste;
	/** departement : Departement
	 * 
	 */
	private Departement departement;
	
	
	

		

	public Collaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numeroSecuriteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.matricule = "Coll" + compteur;
		this.nom = nom;
		this.prenom = prenom;
		DateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numeroSecuriteSociale = numeroSecuriteSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		compteur++;
	
	}





	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return DateDeNaissance;
	}

	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		DateDeNaissance = dateDeNaissance;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the numeroSecuriteSociale
	 */
	public String getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	/**
	 * @param numeroSecuriteSociale the numeroSecuriteSociale to set
	 */
	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	/**
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}

	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Collaborateur [  matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom
				+ ", DateDeNaissance=" + DateDeNaissance + ", adresse=" + adresse + ", numeroSecuriteSociale="
				+ numeroSecuriteSociale + ", emailPro=" + emailPro + ", photo=" + photo + ", dateHeureCreation="
				+ dateHeureCreation + ", actif=" + actif + "]";
	}
	
	
	
	
}
