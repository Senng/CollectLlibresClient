package ioc.colectllibre.util;

/**
 * @author Rubén
 * 
 * Classe que emmagatzema dades
 */
public class Data {
    
    // URLS del servidor
    public static final String URL_LOGIN = "http://ec2-54-77-189-163.eu-west-1.compute.amazonaws.com:8080/ColectLlibres/res/authentication";
    public static final String URL_USUARIS = "http://ec2-54-77-189-163.eu-west-1.compute.amazonaws.com:8080/ColectLlibres/res/usuaris";
    
    // XML amb les dades de tots els usuaris
    private static String xml;
    
    // GETTERS + SETTERS 
    
    public static String getXML() {
	return xml;
    }

    public static void setXML(String xml) {
	Data.xml = xml;
    }
}