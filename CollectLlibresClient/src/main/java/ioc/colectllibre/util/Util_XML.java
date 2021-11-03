package ioc.colectllibre.util;

import ioc.colectllibre.model.Usuari;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * @author Rubén
 * 
 * Classe que conté les funcions relacionades amb arxius XML.
 */
public class Util_XML {

    /**
     * Obté la informació de tots els usuaris de l'aplicació a partir de XML i
     * ho guarda a un String[][].
     *
     * @return = String[][] amb les dades de tots els usuaris a la BD.
     */
    public static String[][] getInfoUsuaris() {
	
	// Actualitzar informació d'usuaris
	Connection.getXMLUserInfo();
	
	try {
	    Document doc
		    = DocumentBuilderFactory
			    .newInstance()
			    .newDocumentBuilder()
			    .parse(new InputSource(new StringReader(Data.getXML())));

	    doc.getDocumentElement().normalize();

	    NodeList usuaris = doc.getElementsByTagName("usuaris");

	    int col = Usuari.class.getDeclaredFields().length;
	    int rows = usuaris.getLength();
	    String[][] info_Usuaris = new String[rows][col];

	    for (int i = 0; i < usuaris.getLength(); i++) {

		Node us = usuaris.item(i);

		if (us.getNodeType() == Node.ELEMENT_NODE) {

		    Element element = (Element) us;
		    info_Usuaris[i][0] = element.getElementsByTagName("idusuari").item(0).getTextContent();
		    info_Usuaris[i][1] = element.getElementsByTagName("nom").item(0).getTextContent();
		    info_Usuaris[i][2] = element.getElementsByTagName("cognoms").item(0).getTextContent();
		    info_Usuaris[i][3] = element.getElementsByTagName("telefon").item(0).getTextContent();
		    info_Usuaris[i][4] = element.getElementsByTagName("dni").item(0).getTextContent();
		    info_Usuaris[i][5] = element.getElementsByTagName("usuari").item(0).getTextContent();
		    info_Usuaris[i][6] = element.getElementsByTagName("pass").item(0).getTextContent();
		}
	    }
	    
	    return info_Usuaris;

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;
    }
}
