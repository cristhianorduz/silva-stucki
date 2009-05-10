package uniandes.cupi2.helpDesk.iterfazServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet para el manejo 
 */
@SuppressWarnings("serial")
public class ServletRegistrarCliente extends ServletTemplate
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
        return "Registrar Cliente";
    }

    /**
     * Escribe el contenido de la p�gina
     * @param request Pedido del cliente
     * @param response Respuesta
     * @throws IOException Excepci�n de error al escribir la respuesta
     */
    public void escribirContenido( HttpServletRequest request, HttpServletResponse response ) throws IOException
    {
        //
        // Saca el Printer
        PrintWriter respuesta = response.getWriter( );
        

        respuesta.write( "                           <table border=\"0\" width=\"710\" id=\"table3\">\r\n" );
        respuesta.write( "                              <tr>\r\n" );
        respuesta.write( "                             		<td width=\"696\" colspan=\"4\" bgcolor=\"#E2E2E2\"> \r\n" );
        respuesta.write( "                              	<table border=\"0\" width=\"614\" id=\"table4\">\r\n" );						
        respuesta.write( "                              		<tr>\r\n" );
        respuesta.write( "                              			<td width=\"40\">&nbsp;</td>\r\n" );
        respuesta.write( "                              			<td width=\"564\">   Registraro nuevo cliente Help Desk</td>\r\n" );
        respuesta.write( "                              		</tr>\r\n" );
        respuesta.write( "                              	</table>\r\n" );
        respuesta.write( "                              	</td>\r\n" );
        respuesta.write( "                              </tr>\r\n" );
        respuesta.write( "                              <tr>\r\n" );
        respuesta.write( "                              	<td width=\"42\">&nbsp;</td>\r\n" );
        respuesta.write( "                              	<td width=\"572\" colspan=\"2\">&nbsp;</td>\r\n" );
        respuesta.write( "                              	<td width=\"82\">&nbsp;</td>\r\n" );
        respuesta.write( "                              </tr>\r\n" );
        respuesta.write( "                              <tr>\r\n" );
        respuesta.write( "                              	<td width=\"42\">&nbsp;</td>\r\n" );
        respuesta.write( "                              	<td width=\"25\">&nbsp;</td>\r\n" );					
        respuesta.write( "                              	<td width=\"543\"><form method=\"POST\" action=\"../Workspace/n18_HelpDesk/data/html/resultado.htm\">\r\n" );
        respuesta.write( "                               	<table border=\"0\" width=\"543\" id=\"table5\">\r\n" );
        respuesta.write( "                              		<tr>\r\n" );
        respuesta.write( "                              			<td width=\"121\" height=\"29\" valign=\"top\">\r\n" );
        respuesta.write( "                              			<p align=\"right\"><b>nombre completo:</b></td>\r\n" );
        respuesta.write( "                             				<td width=\"412\" valign=\"top\">\r\n" );
        respuesta.write( "                              			<input type=\"text\" name=\"valor1\" size=\"30\" class=\"normal\"></td>\r\n" );
        respuesta.write( "                             	 		</tr>\r\n" );
        respuesta.write( "                              		<tr>\r\n" );
        respuesta.write( "                              			<td width=\"121\" height=\"40\">\r\n" );
        respuesta.write( "                              			<p align=\"right\"><b>login:</b></td>\r\n" );
        respuesta.write( "                              			<td><input type=\"password\" name=\"valor3\" size=\"30\" class=\"normal\"></td>\r\n" );
        respuesta.write( "                              		</tr>\r\n" );
        respuesta.write( "                              		<tr>\r\n" );
        respuesta.write( "                              			<td width=\"121\" height=\"24\" valign=\"top\">\r\n" );
        respuesta.write( "                              			<p align=\"right\"><b>password:</b></td>\r\n" );
        respuesta.write( "                              			<td valign=\"top\"><input type=\"password\" name=\"valor2\" size=\"30\" class=\"normal\"></td>\r\n" );
        respuesta.write( "                              		</tr>\r\n" );
        respuesta.write( "                              		<tr>\r\n" );
        respuesta.write( "                              			<td height=\"32\" valign=\"top\"><p align=\"right\"><b>repetir password:</b></td>\r\n" );
        respuesta.write( "                              			<td valign=\"top\"><input type=\"password\" name=\"valor4\" size=\"30\" class=\"normal\"></td>\r\n" );
        respuesta.write( "                             			</tr>\r\n" );
        respuesta.write( "                              		<tr>\r\n" );
        respuesta.write( "                              			<td align=\"right\"><b>tipo:</b></td>\r\n" );
        respuesta.write( "                              			<td><select name=\"operacion\" size=\"1\" class=\"normal\">\r\n" );
        respuesta.write( "                              				<option value=\"4\">Estudiante</option>\r\n" );
        respuesta.write( "                              				<option value=\"5\">Profesor</option>\r\n" );
        respuesta.write( "                              				<option value=\"6\">Personal Administrativo</option>\r\n" );
        respuesta.write( "                              			</select></td>\r\n" );
        respuesta.write( "                              			</tr>\r\n" );
        respuesta.write( "                              	</table>\r\n" );
        respuesta.write( "                              	<p>\r\n" );
        respuesta.write( "                              	<input type=\"submit\" value=\"Aceptar\" name=\"B1\" class=\"normal\">\r\n" );	
        respuesta.write( "                              	<input type=\"reset\" value=\"Restablecer\" name=\"Borrar\" class=\"normal\">\r\n" );
        respuesta.write( "                             		</p>\r\n" );
        respuesta.write( "                              </form>\r\n" );
        respuesta.write( "                              	<p>&nbsp;</td>\r\n" );
        respuesta.write( "                              	<td width=\"82\">&nbsp;</td>\r\n" );
        respuesta.write( "                              </tr>\r\n" );
        respuesta.write( "                              <tr>\r\n" );
        respuesta.write( "                              	<td width=\"42\">&nbsp;</td>\r\n" );
        respuesta.write( "                              	<td width=\"25\">&nbsp;</td>\r\n" );
        respuesta.write( "                              	<td width=\"543\">\r\n" );
        respuesta.write( "                              	</td>\r\n" );
        respuesta.write( "                              	<td width=\"82\">&nbsp;</td>\r\n" );
        respuesta.write( "                              </tr>\r\n" );
        respuesta.write( "                           </table>\r\n" );     	
    }
}