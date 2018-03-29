/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.ZonedDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * @author Axel B.
 *
 */
public class CreerCollaborateursController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	/**
	 * serialVersionUID : long
	 * 
	 */
	private static final long serialVersionUID = 1710160883757308069L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String error = "Les paramètre suivant ne sont pas renseignés :";
		if (req.getParameter("nom") == null || req.getParameter("prenom") == null
				|| req.getParameter("dateNaissance") == null || req.getParameter("adresse") == null
				|| req.getParameter("secu") == null) {

			if (req.getParameter("nom") == null) {
				error += "nom";

			}
			if (req.getParameter("prenom") == null) {
				error += "prenom";

			}
			if (req.getParameter("dateNaissance") == null) {
				error += "dateNaissance";

			}
			if (req.getParameter("adresse") == null) {
				error += "adresse";

			}
			if (req.getParameter("secu") == null) {
				error += "secu";

			}

			resp.sendError(400, error);
		} else {

			List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();

			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String date = req.getParameter("dateNaissance");
			String adresse = req.getParameter("adresse");
			String numeroSecuSociale = req.getParameter("secu");
			String emailPro = prenom +"."+ nom + "@societe.com";
			String photo = "/image/app_photo.jpg";
			LocalDate dateNaissance = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			ZonedDateTime dateCreation = ZonedDateTime.now();

			if (numeroSecuSociale.length() == 15) {
				collaborateurs.add(new Collaborateur(nom, prenom, dateNaissance, adresse, numeroSecuSociale, emailPro,
						photo, dateCreation, true));
				req.setAttribute("listCollaborateur", collabService.listerCollaborateurs());
				req.getRequestDispatcher("/WEB-INF/views/collab/index.jsp").forward(req, resp);
				
			}else{
				resp.sendError(400,"Le numéro de sécurité sociale est invalide");
				
			}


		}
	}

}
