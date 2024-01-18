package controladores;

import com.autenticacion.auth.Autenticacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControladorServerlet", urlPatterns = {"/LoginServlet"})
public class ControladorServerlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        
        // Llamar a la lógica de validación de credenciales
        Autenticacion autenticacion = new Autenticacion();
        if (autenticacion.validarCredenciales(usuario, contrasena)) {
            // Credenciales válidas, redireccionar a la página de inicio
            response.sendRedirect("inicio.jsp");
        } else {
            // Credenciales inválidas, redireccionar a la página de error
            response.sendRedirect("error.jsp");
        }
    }
}
