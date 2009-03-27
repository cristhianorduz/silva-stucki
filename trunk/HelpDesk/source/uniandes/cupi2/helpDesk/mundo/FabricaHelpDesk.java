package uniandes.cupi2.helpDesk.mundo;

import uniandes.cupi2.helpDesk.interfazMundo.FabricaAbstracta;
import uniandes.cupi2.helpDesk.interfazMundo.IHelpDesk;

/**
 * Es la clase que se encarga de crear int�rpretes de clave morse con una estructura de datos correspondiente a un �rbol
 */
public class FabricaHelpDesk extends FabricaAbstracta
{
    // ---------------------------------------------------------------------
    // Atributos
    // ---------------------------------------------------------------------

    /**
     * Es la �nica instancia posible de la f�brica abstracta
     */
    private static FabricaHelpDesk instancia;

    // ---------------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------------

    /**
     * El constructor vac�o de la clase
     */
    private FabricaHelpDesk( )
    {
    }

    // ---------------------------------------------------------------------
    // M�todos
    // ---------------------------------------------------------------------

    /**
     * Devuelve la �nica instancia de la clase
     * @return instancia
     */
    public static FabricaHelpDesk getInstance( )
    {
        if( instancia == null )
        {
            instancia = new FabricaHelpDesk( );
        }

        return instancia;

    }

    /**
     * Fabrica un un nuevo helpDesk
     */
    public IHelpDesk fabricarImplementacion( )
    {
        return new HelpDesk(  );
    }
    
    /**
     * Fabrica un HelpDesk a partir de un archivo
     * @throws Exception error si algo sale mal al cargar
     */
    public IHelpDesk fabricarImplementacion(String ruta) throws Exception
    {
    	return new HelpDesk(ruta);
    }
}
