package es.upm.profundizacion2018.examen.PabloFernandezEx;

import junit.framework.TestCase;


public class MyStringTest extends TestCase {
		
    public void testIguales()
    {
        assertEquals("Los dos Strings son iguales",MyString.str.compareTo("hola"),0);
    }
    
    public void testDistintosLong()
    {
        assertEquals("Los dos Strings tienen distinta longitud",MyString.str.compareTo("holaaa"),-2);
    }
    
    public void testDistintosContenidoMismaLong()
    {
        assertEquals("Los dos Strings tienen distinto contenido pero misma longitud",MyString.str.compareTo("iola"),-1);
    }
    
    public void testDistintosContenido()
    {
        assertEquals("Los dos Strings tienen distinto contenido",MyString.str.compareTo("adios"),7);
    }

}
