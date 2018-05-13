package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import control.AccesoDatos;

/**
 * Servlet implementation class Control
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pais = request.getParameter("pais");
		String ciudad = request.getParameter("ciudad");
		AccesoDatos datos= new AccesoDatos();
		List<String> clientes = datos.listCustomer(pais, ciudad);
		request.setAttribute("clientes", clientes);
		RequestDispatcher despachador = request.getRequestDispatcher("/JSPMostrarDatos.jsp");
		despachador.forward(request, response);
	}

}
