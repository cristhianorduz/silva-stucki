package uniandes.cupi2.helpDesk.iterfazServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uniandes.cupi2.helpDesk.mundo.HelpDesk;

/**
 * Servlet para la creacion de tickets
 */
@SuppressWarnings("serial")
public class ServletNuevoTicket extends ServletTemplate
{

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------	
    
	/**
     * Devuelve el t�tulo de la p�gina para el Header
     * @param request Pedido del cliente
     * @return T�tulo de la p�gina para el Header
     */
    public String darTituloPagina( HttpServletRequest request )
    {
        return "Nuevo Ticket";
    }

    /**
     * Escribe el contenido de la p�gina
     * @param request Pedido del cliente
     * @param response Respuesta
     * @throws IOException Excepci�n de error al escribir la respuesta
     */
    public void escribirContenido( HttpServletRequest request, HttpServletResponse response ) throws IOException
    {
    	PrintWriter respuesta = response.getWriter();
        HelpDesk mundo = HelpDesk.getInstance(null);
        int tipo = Integer.parseInt(request.getParameter("tipo"));
        try {
			mundo.nuevaSolicitud(tipo, request.getParameter("mensaje"), false);
		} catch (Exception e) {
			this.imprimirMensajeError(respuesta, e.getMessage());
		}
		respuesta.write("");
    }
}
