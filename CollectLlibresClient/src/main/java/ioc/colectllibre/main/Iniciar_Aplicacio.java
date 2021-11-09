package ioc.colectllibre.main;

import ioc.colectllibre.layout.Frame_login;

/**
 * @author Rubén
 * 
 * Classe que inicia l'aplicació
 */
public class Iniciar_Aplicacio {
    public static void main(String[] args) {
	
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Frame_login().setVisible(true);
	    }
	});
    }
}