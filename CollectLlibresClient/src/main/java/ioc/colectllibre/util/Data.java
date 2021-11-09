package ioc.colectllibre.util;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * @author Rubén
 * 
 * Classe que emmagatzema dades
 */
public class Data {
    
    // URLS del servidor
    public static final String URL_LOGIN = "http://ec2-54-77-189-163.eu-west-1.compute.amazonaws.com:8080/ColectLlibres/res/login";
    public static final String URL_USUARIS = "http://ec2-54-77-189-163.eu-west-1.compute.amazonaws.com:8080/ColectLlibres/res/usuaris";
    public static final String URL_USUARI = "http://ec2-54-77-189-163.eu-west-1.compute.amazonaws.com:8080/ColectLlibres/res/usuaris/usuari/";
    
    // Colors
    public static final Color DARK = new Color(51,51,51);
    public static final Color DARK_LIGHT = new Color(77,77,77);
    public static final Color URL = new Color(0,171,214);
    public static final Color URL_HOVER = new Color(20, 208, 255);
    public static final Color BUTTON = new Color(241,241,244);
    public static final Color BUTTON_HOVER = new Color(204,204,204);
    public static final Color ERROR = new Color(255,51,51);
    public static final Color CORRECT = new Color(102,55,0);
    
    // Vora camps de text
    public static final Border BORDER = BorderFactory.createMatteBorder(0, 0, 1, 0, DARK);
    

}