/**
 * 
 */
package dev.sgp.entite;
import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
public class Departement  {
	/** id : int
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	

}
