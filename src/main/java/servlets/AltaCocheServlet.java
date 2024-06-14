package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AltaCocheServlet
 */
@WebServlet("/registroCoche")
public class AltaCocheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AltaCocheServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida= response.getWriter();
		salida.println(UtilidadesServlets.getCabecera("Coche nuevo"));
		
		salida.println("<p>Debe rellenar el formulario</p>");
		salida.println("<a href='formularioCoches.html'>ir a alta de coche</a>");
		salida.println(UtilidadesServlets.getPie());
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida= response.getWriter();
		String Matricula= request.getParameter("matricula");
		String Marca= request.getParameter("marca");
		String Modelo= request.getParameter("modelo");
		String Potencia= request.getParameter("potencia");
		String Tipo= request.getParameter("tipo");
		salida.println(UtilidadesServlets.getCabecera("resusltado del formulario"));
		
			salida.println("<h1>Resultado del formulario");
			salida.println("<p>matricula:"+ Matricula + "<p>");
			salida.println("<p>marca:"+ Marca + "<p>");
			salida.println("<p> modelo:"+ Modelo + "<p>");
			salida.println("<p>potencia:"+ Potencia + "<p>");
			salida.println("<p>tipo:"+  Tipo + "<p>");
			
			
			salida.println(UtilidadesServlets.getPie());
	}

}
