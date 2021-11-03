package ioc.colectllibre.layout;

/**
 * @author Rubén
 * 
 * Finestra principal del login de l'aplicació
 */
public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
	initComponents();
	
	this.setLocationRelativeTo(null);
	
	// Crea el panel de login i el mostra
	jPanel_login = new Login_panel(this);
	
	//this.setSize(jPanel_login.getWidth(), jPanel_login.getHeight());
	
	jPanel_base.removeAll();
	jPanel_base.add(jPanel_login);
	jPanel_base.revalidate();
	jPanel_base.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_base = new javax.swing.JPanel();
        jPanel_login = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_base.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel_loginLayout = new javax.swing.GroupLayout(jPanel_login);
        jPanel_login.setLayout(jPanel_loginLayout);
        jPanel_loginLayout.setHorizontalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        jPanel_loginLayout.setVerticalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jPanel_base.add(jPanel_login, "card2");

        getContentPane().add(jPanel_base, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_base;
    private javax.swing.JPanel jPanel_login;
    // End of variables declaration//GEN-END:variables
}
