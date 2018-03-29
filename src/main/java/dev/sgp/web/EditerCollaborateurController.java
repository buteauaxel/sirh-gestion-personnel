/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
public class EditerCollaborateurController extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);


//		String error = "Les paramètre suivant ne sont pas renseignés :";
//		/* Si l'un de ces paramètre est manquant */
//		if (req.getParameter("matricule") == null || req.getParameter("titre") == null
//				|| req.getParameter("nom") == null || req.getParameter("prenom") == null) {
//			if (req.getParameter("matricule") == null) {
//				error += "matricule";
//
//			}
//			if (req.getParameter("titre") == null) {
//				error += "titre";
//
//			}
//			if (req.getParameter("nom") == null) {
//				error += "nom";
//
//			}
//			if (req.getParameter("prenom") == null) {
//				error += "prenom";
//
//			}
//			/* Renvoie un message d'erreur */
//			resp.sendError(400, error);
//		} else {
//
//			String prenom = req.getParameter("prenom");
//			String nom = req.getParameter("nom");
//			String titre = req.getParameter("titre");
//			String matricule = req.getParameter("matricule");
//			/* envoie le status */
//			resp.setStatus(201);
//			/* Envoie les informations entré dans l'URL */
//			resp.getWriter().write("<h1>Editer collaborateur</h1>" + "<p> Matricule :" + matricule + "</p>"
//					+ "<p> Titre :" + titre + "</p>" + "<p> Nom :" + nom + "</p>" + "<p> prénom :" + prenom + "</p>");

//		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				
		

		
		
	}
}
