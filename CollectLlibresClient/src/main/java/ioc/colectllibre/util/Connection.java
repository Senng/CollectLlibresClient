package ioc.colectllibre.util;

import ioc.colectllibre.model.Usuari;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

/**
 * @author Rubén
 *
 * Classe que conté les funcions de comunicació amb el servidor.
 */
public class Connection {

    private static HttpURLConnection con;
    
    /**
     * Obté el XML del servidor a /res/usuaris i emmagatzema la seva informació
     * a un String[][].
     * 
     * @return Les dades de cada usuari a la BD en un String[][]
     */
    public static String[][] getAllUserInfo() {
	
	String xml;
	String[][] dadesUsuaris;
	
	try {

	    URL url = new URL(Data.URL_USUARIS);
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("Accept", "application/xml");
	    
	    // Legir resposta servidor
	    BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	    xml = br.lines().collect(Collectors.joining());
	    
	    // Parse xml into String[][]
	    dadesUsuaris = Util_XML.getInfoUsuaris(xml);
	    
	    return dadesUsuaris;
	    
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
	return null;
    }
    
    /**
     * Obté la informació de l'usuari actual (quan ja ha fet login) en format 
     * XML i retorna un objecte Usuari
     * 
     * @param usuari = nomUsuari de l'usuari que ha fet login
     * @return Usuari que ha fet login amb els seus credencials
     */
    public static Usuari getCurrentUserInfo(String usuari) {

	try {

	    URL url = new URL(Data.URL_USUARI + usuari);
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("Accept", "application/xml");

	    BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	    String userxml = br.lines().collect(Collectors.joining());
	    
	    return Util_XML.getUsuariFromXMLString(userxml);
	    
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
	return null;
    }
    
    /**
     * Fa una sol·licitud de login amb un POST i retorna:
     *
     * 1 = Login correcta 
     * 2 = Credencials incorrectes
     *
     * @param user = nom d'usuari
     * @param pass = contrasenya d'usuari
     * @return retorna el codi de resposta del servidor
     */
    public static int requestLogin(String user, String pass) {

	try {

	    String input = "{\"username\":\"" + user + "\",\"password\":\"" + pass + "\"}";

	    URL url = new URL(Data.URL_LOGIN);
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("POST");
	    con.setRequestProperty("Content-Type", "application/json");
	    con.setDoOutput(true);
		
	    // Envia les dades al servidor
	    DataOutputStream writer = new DataOutputStream(con.getOutputStream());
	    writer.writeBytes(input);
	    writer.close();

	    // Llegeix la resposta del servidor (200 = correcte)
	    int code = con.getResponseCode();
	    
	    if (code == 200){
		return 1;
	    } else {
		return 2;
	    }

	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
	return 2;
    }
    
    /**
     * Envia una sol·licitud de registre amb un POST i retorna:
     *
     * 1 = Registre correcta 
     * 2 = Registre incorrecta
     *
     * @param cred = credencials de l'usuari
     * @return retorna el codi de resposta del servidor
     */
    public static int requestRegister(String[] cred) {

	try {

	    String credentials = Util_XML.userCredentialsToXML(cred);
	    
	    URL url = new URL(Data.URL_USUARIS);
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("POST");
	    con.setRequestProperty("Content-Type", "application/xml");
	    con.setDoOutput(true);
		
	    // Envia les dades al servidor
	    DataOutputStream writer = new DataOutputStream(con.getOutputStream());
	    writer.writeBytes(credentials);
	    writer.close();

	    // Llegeix la resposta del servidor (201 = correcte)
	    int code = con.getResponseCode();
	    
	    if (code == 201){
		return 1;
	    } else {
		return 2;
	    }

	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
	return 2;
    }
    
    /**
     * Elimina l'usuari seleccionat a la taula a partir de la seva ID
     * 
     * @param id = id de l'usuari
     * @return 
     */
    public static int deleteUser(int id) {
	
	try {

	    URL url = new URL(Data.URL_USUARIS + "/" + id);
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("DELETE");
	    con.setRequestProperty("Content-Type", "application/xml");
		
	    // Llegeix la resposta del servidor (200 = correcte)
	    int code = con.getResponseCode();
	    
	    if (code == 200){
		return 1;
	    } else {
		return 2;
	    }

	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
	return 2;
    }
    
     /**
     * Canvia la contrassenya de l'usuari segons la seva ID
     * 
     * @param user = usuari que vol canviar la contrasenya
     * @param contrasenya = contrasenya nova
     * @return 
     */
    public static int changePassword(Usuari user, String contrasenya) {
	
	try {

	    URL url = new URL(Data.URL_USUARIS + "/" + user.getId());
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("PUT");
	    con.setRequestProperty("Content-Type", "application/xml");
		
	    // Envia les dades al servidor
	    String xmlNewPass = Util_XML.passwordToXML(user, contrasenya);
	    
	    DataOutputStream writer = new DataOutputStream(con.getOutputStream());
	    writer.writeBytes(xmlNewPass);
	    writer.close();
	    
	    // Llegeix la resposta del servidor (201 = correcte)
	    int code = con.getResponseCode();
	    
	    if (code == 201){
		return 1;
	    } else {
		return 2;
	    }

	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
	return 2;
    }
}
