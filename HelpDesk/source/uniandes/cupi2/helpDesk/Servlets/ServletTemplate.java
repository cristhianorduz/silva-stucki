package uniandes.cupi2.helpDesk.Servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uniandes.cupi2.helpDesk.mundo.HelpDesk;

/**
 * Servelt Abstracto principal con el template del dise�o de la p�gina
 */
@SuppressWarnings("serial")
public abstract class ServletTemplate extends HttpServlet
{

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Maneja un pedido GET de un cliente
     * @param request Pedido del cliente
     * @param response Respuesta
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        procesarPedido( request, response );
    }

    /**
     * Maneja un pedido POST de un cliente
     * @param request Pedido del cliente
     * @param response Respuesta
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        procesarPedido( request, response );
    }

    /**
     * Procesa el pedido de igual manera para todos
     * @param request Pedido del cliente
     * @param response Respuesta
     * @throws IOException Excepci�n de error al escribir la respuesta
     */
    private void procesarPedido( HttpServletRequest request, HttpServletResponse response ) throws IOException
    {
    	// Inicializa el mundo
    	InputStream inputStream = getServletContext().getResourceAsStream(HelpDesk.RUTA_NOMINA);
    	Properties props = new Properties();
    	
    	props.load(inputStream); 
    	HelpDesk.getInstance(props);
    	inputStream.close();
    	
        // Comienza con el Header del template
        imprimirHeader( request, response );
        //
        // Escribe el contenido de la p�gina
        escribirContenido( request, response );
        //
        // Termina con el footer del template
        imprimirFooter( response );

    }

    /**
     * Imprime el Header del dise�o de la p�gina
     * @param request Pedido del cliente
     * @param response Respuesta
     * @throws IOException Excepci�n al imprimir en el resultado
     */
    private void imprimirHeader( HttpServletRequest request, HttpServletResponse response ) throws IOException
    {
        //
        // Saca el printer de la repsuesta
        PrintWriter respuesta = response.getWriter( );
        //
        // Imprime el header
        respuesta.write( "<html>\r\n" );
        respuesta.write( "<head>\r\n" );
        respuesta.write( "<meta http-equiv=\"Content-Language\" content=\"es-co\">\r\n" );
        respuesta.write( "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n" );
        respuesta.write( "<title>Help Desk - " + darTituloPagina( request ) + "</title>\r\n" );
        respuesta.write( "<link type=\"text/css\" rel=\"stylesheet\" href=\"style/style.css\">\r\n" );
        respuesta.write( "</head>\r\n" );

        respuesta.write( "<body>\r\n" );
        respuesta.write( "<div align=center>\r\n" );
        respuesta.write( "<center>\r\n" );

        respuesta.write( "<table border=\"0\" width=\"720\" id=\"table1\">\r\n" );
        respuesta.write( "   <tr>\r\n" );
        respuesta.write( "       <td>\r\n" );
        respuesta.write( "       <p align=\"center\">\r\n" );
        respuesta.write( "       <img border=\"0\" src=\"imagenes/logo.jpg\" width=\"640\" height=\"100\"></td>\r\n" );
        respuesta.write( "   </tr>\r\n" );
        respuesta.write( "   <tr>\r\n" );
        respuesta.write( "       <td>&nbsp;</td>\r\n" );
        respuesta.write( "   </tr>\r\n" );
        respuesta.write( "   <tr>\r\n" );
        respuesta.write( "       <td>\r\n" );
        respuesta.write( "       <table border=\"1\" width=\"100%\" style=\"border-collapse: collapse\" bordercolor=\"#999999\" id=\"table2\">\r\n" );
        respuesta.write( "           <tr>\r\n" );
        respuesta.write( "           </tr>\r\n" );
        respuesta.write( "           <tr>\r\n" );
        respuesta.write( "               <td bgcolor=\"#000000\" height=\"3px\"></td>\r\n" );
        respuesta.write( "           </tr>\r\n" );
        respuesta.write( "           <tr>\r\n" );
        respuesta.write( "               <td>\r\n" );    
    }

    /**
     * Imprime el Footer del dise�o de la p�gina
     * @param response Respuesta
     * @throws IOException Excepci�n al escribir en la respuesta
     */
    private void imprimirFooter( HttpServletResponse response ) throws IOException
    {
        //
        // Saca el writer de la respuesta
        PrintWriter respuesta = response.getWriter( );
        //
        // Imprime el footer
        respuesta.write( "               </td>\r\n" );
        respuesta.write( "           </tr>\r\n" );
        respuesta.write( "           <tr>\r\n" );
        respuesta.write( "               <td bgcolor=\"#000000\" height=\"2px\"></td>\r\n" );
        respuesta.write( "           </tr>\r\n" );
        respuesta.write( "           <tr>\r\n" );
        respuesta.write( "               <td>Proyecto CUPI2<br>\r\n" );
        respuesta.write( "               Help Desk en l&iacute;nea<br>\r\n" );
        respuesta.write( "               <b>2009</b></td>\r\n" );
        respuesta.write( "           </tr>\r\n" );
        respuesta.write( "       </table>\r\n" );
        respuesta.write( "       </td>\r\n" );
        respuesta.write( "   </tr>\r\n" );
        respuesta.write( "</table>\r\n" );

        respuesta.write( "</center>\r\n" );
        respuesta.write( "</div>\r\n" );
        respuesta.write( "</body>\r\n" );

        respuesta.write( "</html>\r\n" );
    }

    /**
     * Imprime un mensaje de error
     * @param respuesta Respuesta al cliente
     * @param titulo T�tulo del error
     * @param mensaje Mensaje del error
     */
    protected void imprimirMensajeError( PrintWriter respuesta, String mensaje )
    {
        respuesta.write( "                      <p class=\"error\"><b>Ha ocurrido un error!:<br>\r\n" );
        respuesta.write( "                      <p>" + mensaje + " </p>\r\n" );
        respuesta.write( "                      <p>Intente la \r\n" );
        respuesta.write( "                      operaci�n nuevamente. Si el problema persiste, contacte \r\n" );
        respuesta.write( "                      al administrador del sistema.</p>\r\n" );
        respuesta.write( "                      <p><a href=\"index.htm\">Volver a la p�gina principal</a>\r\n" );
    }



    // -----------------------------------------------------------------
    // M�todos Abstractos
    // -----------------------------------------------------------------

    /**
     * Devuelve el t�tulo de la p�gina para el Header
     * @param request Pedido del cliente
     * @return T�tulo de la p�gina para el Header
     */
    public abstract String darTituloPagina( HttpServletRequest request );

    /**
     * Escribe el contenido de la p�gina
     * @param request Pedido del cliente
     * @param response Respuesta
     * @throws IOException Excepci�n de error al escribir la respuesta
     */
    public abstract void escribirContenido( HttpServletRequest request, HttpServletResponse response ) throws IOException;

}