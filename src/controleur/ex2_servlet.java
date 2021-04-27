package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.ex2_authentificationBean;

/**
 * Servlet implementation class ex2_servlet
 */
@WebServlet("/ex2_servlet")
public class ex2_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ex2_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ex2_authentificationBean ex2 =(ex2_authentificationBean)request.getSession().getAttribute("ex2_authentificationBean");
		if(ex2 == null)
			ex2 =new ex2_authentificationBean();
		
		String prenom =request.getParameter("prenom");
		
		String nom =request.getParameter("nom");
		ex2.setPrenom(prenom);
		
		ex2.setNom(nom);
		request.getSession().setAttribute("ex2_authentificationBean", ex2);
		RequestDispatcher dispatcher =request.getRequestDispatcher("ex2_authentification.jsp");
		dispatcher.forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
