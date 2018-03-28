
package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Axel B.
 *
 */

public class ListerCollaborateursController extends HttpServlet {
	/**
	 * serialVersionUID : long
	 * 
	 */
	private static final long serialVersionUID = -6035975045435407352L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
		
		/* String avecPhotoParam = req.getParameter("avec  Photo");
		String departementParam = req.getParameter("departement");
		resp.setContentType("text/html");

		resp.getWriter().write("<h1>Liste des collaborateurs</h1>" + "<ul>" + "<li>avecPhoto=" + avecPhotoParam
				+ "</li>" + "<li>departement=" + departementParam + "</li>" + "</ul>"); */
	}
}
