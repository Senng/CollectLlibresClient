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
     * @param xml = arxiu amb les dades dels usuaris a la BD en format XML
     * @return = String[][] amb les dades de tots els usuaris a la BD.
     */
    public static String[][] getInfoUsuaris(String xml) {
	
	try {
	    Document doc
		    = DocumentBuilderFactory
			    .newInstance()
			    .newDocumentBuilder()
			    .parse(new InputSource(new StringReader(xml)));

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
    
    /**
     * Funció que implementa els credencials per registrar un usuari en un
     * String en format XML.
     * 
     * TODO implementar el rol
     * 
     * @param credentials = credencials de l'usuari
     * @return String en format xml 
     */
    public static String userCredentialsToXML(String[] credentials) {
	
	String nom = credentials[0];
	String cognoms = credentials[1];
	String telefon = credentials[2];
	String dni = credentials[3];
	String nomUsuari = credentials[4];
	String contrassenya = credentials[5];
	String rol = "admin";
	
	String xml = 
		    "<usuaris>" +
			"<usuari>"+nomUsuari+"</usuari>" +
			"<pass>"+contrassenya+"</pass>" +
			"<nom>"+nom+"</nom>" +
			"<cognoms>"+cognoms+"</cognoms>" +
			"<dni>"+dni+"</dni>" +
			"<telefon>"+telefon+"</telefon>" +
			"<rol>"+rol+"</rol>" +
		    "</usuaris>";
	
	return xml;
    }
    
    /**
     * Métode que retorna un objecte Usuari amb les dades obtingudes a partir
     * del String de xml obtingut per paràmetres
     * 
     * @param xmlString
     * @return 
     */
    public static Usuari getUsuariFromXMLString(String xmlString) {
	
	Usuari usuari = new Usuari();
	
	try {
	    Document doc
		    = DocumentBuilderFactory
			    .newInstance()
			    .newDocumentBuilder()
			    .parse(new InputSource(new StringReader(xmlString)));

	    doc.getDocumentElement().normalize();
	    
	    Node us = doc.getDocumentElement();
	    
	    if (us.getNodeType() == Node.ELEMENT_NODE) {

		Element element = (Element) us;

		usuari.setId(Integer.valueOf(element.getElementsByTagName("idusuari").item(0).getTextContent()));
		usuari.setNom(element.getElementsByTagName("nom").item(0).getTextContent());
		usuari.setCognoms(element.getElementsByTagName("cognoms").item(0).getTextContent());
		usuari.setTelefon(element.getElementsByTagName("telefon").item(0).getTextContent());
		usuari.setDni(element.getElementsByTagName("dni").item(0).getTextContent());
		usuari.setNomUsuari(element.getElementsByTagName("usuari").item(0).getTextContent());
		usuari.setContrasenya(element.getElementsByTagName("pass").item(0).getTextContent());
	    }
	    
	    return usuari;

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;
    }
    
    /**
     * Retorna les dades de l'usuari amb la nova contrassenya en format XML
     * 
     * @param user = usuari que vol canviar la contrasenya
     * @param pass = nova contrasenya
     * @return 
     */
    public static String passwordToXML(Usuari user, String pass) {
	String xml = 
		    "<usuaris>" +
			"<cognoms>"+user.getCognoms()+"</cognoms>" +
			"<dni>"+user.getDni()+"</dni>" +
			"<idusuari>"+user.getId()+"</idusuari>" +
			"<nom>"+user.getNom()+"</nom>" +
			"<pass>"+pass+"</pass>" +
			"<rol>"+user.getAdmin()+"</rol>" +
			"<telefon>"+user.getTelefon()+"</telefon>" +
			"<usuari>"+user.getNomUsuari()+"</usuari>" +
		    "</usuaris>";
	
	return xml;
    }
}