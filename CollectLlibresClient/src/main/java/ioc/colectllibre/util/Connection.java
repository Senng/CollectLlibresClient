package ioc.colectllibre.util;

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
     * a un String.
     */
    public static void getXMLUserInfo() {

	try {

	    URL url = new URL(Data.URL_USUARIS);
	    con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("Accept", "application/xml");

	    BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	    Data.setXML(br.lines().collect(Collectors.joining()));
	    
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    con.disconnect();
	}
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

	String response;

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

	    // Llegeix la resposta del servidor
	    BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));
	    response = reader.lines().collect(Collectors.joining());
	    reader.close();

	    if (response.equalsIgnoreCase("no validat")) {
		return 2;
	    } else {
		return 1;
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
     * Fa una sol·licitud de login amb un POST i retorna:
     *
     * 1 = Login correcta 
     * 2 = Credencials incorrectes
     *
     * @param credentials = credencials de l'usuari
     * @return retorna el codi de resposta del servidor
     */
    public static int requestRegister(String[] credentials) {

	String response;

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

	    // Llegeix la resposta del servidor
	    BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));
	    response = reader.lines().collect(Collectors.joining());
	    reader.close();

	    if (response.equalsIgnoreCase("no validat")) {
		return 2;
	    } else {
		return 1;
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
