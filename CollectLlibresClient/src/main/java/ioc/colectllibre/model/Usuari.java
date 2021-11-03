package ioc.colectllibre.model;

/**
 * @author Rubén
 */
public class Usuari {
    
    private int id;
    private String nom;
    private String cognoms;
    private String dni;
    private String telefon;
    private String nomUsuari;
    private String contrasenya;
    
    public Usuari(){}
    
    public Usuari(int id, String nom, String cognoms, String dni, String telefon, String nomUsuari, String contrasenya) {
	this.id = id;
	this.nom = nom;
	this.cognoms = cognoms;
	this.dni = dni;
	this.telefon = telefon;
	this.nomUsuari = nomUsuari;
	this.contrasenya = contrasenya;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getCognoms() {
	return cognoms;
    }

    public void setCognoms(String cognoms) {
	this.cognoms = cognoms;
    }

    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	this.dni = dni;
    }

    public String getTelefon() {
	return telefon;
    }

    public void setTelefon(String telefon) {
	this.telefon = telefon;
    }

    public String getNomUsuari() {
	return nomUsuari;
    }

    public void setNomUsuari(String nomUsuari) {
	this.nomUsuari = nomUsuari;
    }

    public String getContrasenya() {
	return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
	this.contrasenya = contrasenya;
    }
}