
package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * @author Axel B.
 *
 */

public class ListerCollaborateursController extends HttpServlet {
	/**
	 * serialVersionUID : long
	 * */
	 private static final long serialVersionUID = -6035975045435407352L;

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	
	{ collabService.listerCollaborateurs().add(new Collaborateur("Charles", "Charly", LocalDate.of(2010, 03, 02) , 
            "4 rue Piaf,Saint-Herblain", "123456789101112", "charles.charly@societe.com", "/img/app_photo.jpg", ZonedDateTime.now(),true)); 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		req.setAttribute("listCollaborateur", collabService.listerCollaborateurs());
		req.getRequestDispatcher("/WEB-INF/views/collab/index.jsp").forward(req, resp);
		
		
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
