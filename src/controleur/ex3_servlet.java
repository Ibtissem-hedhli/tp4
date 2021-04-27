package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.ex2_authentificationBean;
import modele.ex3_clientBean;

/**
 * Servlet implementation class ex3_servlet
 */
@WebServlet("/ex3_servlet")
public class ex3_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ex3_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ex3_clientBean ex3 =(ex3_clientBean)request.getSession().getAttribute("ex3_clientBean");
		if(ex3 == null)
			ex3 =new ex3_clientBean();
		
		String nom =request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String  adresse =request.getParameter("adresse");
		String telephone =request.getParameter("telephone");
		String email =request.getParameter("email");
		ex3.setNom(nom);
		ex3.setPrenom(prenom);
		ex3.setAdresse(adresse);
		ex3.setTelephone(telephone);
		ex3.setEmail(email);
		request.getSession().setAttribute("ex3_clientBean", ex3);
		RequestDispatcher dispatcher =request.getRequestDispatcher("ex3_client.jsp");
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
