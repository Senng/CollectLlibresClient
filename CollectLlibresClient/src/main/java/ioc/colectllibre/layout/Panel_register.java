package ioc.colectllibre.layout;

import ioc.colectllibre.util.Connection;
import ioc.colectllibre.util.Data;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Rubén
 * 
 * Classe per registrar usuaris a la base de dades
 */
public class Panel_register extends JPanel {
    
    private JFrame frame;
    private Panel_login loginPanel;
    
    public Panel_register(JFrame frame) {
	initComponents();
	this.frame = frame;
	frame.setSize(500, 600);
	
	// Disseny camps de text
	text_nom.setBorder(Data.BORDER);
	text_cognoms.setBorder(Data.BORDER);
	text_dni.setBorder(Data.BORDER);
	text_telefon.setBorder(Data.BORDER);
	text_nomUsuari.setBorder(Data.BORDER);
	text_contrassenya.setBorder(Data.BORDER);
	text_repContrassenya.setBorder(Data.BORDER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_nom = new javax.swing.JTextField();
        text_telefon = new javax.swing.JTextField();
        text_nomUsuari = new javax.swing.JTextField();
        text_cognoms = new javax.swing.JTextField();
        jButton_register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        text_dni = new javax.swing.JTextField();
        jButton_return = new javax.swing.JButton();
        label_info = new javax.swing.JLabel();
        text_contrassenya = new javax.swing.JPasswordField();
        text_repContrassenya = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 40, 37));
        jLabel1.setText("Nom:");

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 40, 37));
        jLabel2.setText("Cognoms:");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 40, 37));
        jLabel3.setText("Telèfon:");

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(39, 40, 37));
        jLabel4.setText("Nom d'usuari:");

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(39, 40, 37));
        jLabel5.setText("Contrasenya:");

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(39, 40, 37));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_registration_30px_1.png"))); // NOI18N
        jLabel6.setText(" Omple els camps següents per registrar-te:");

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(39, 40, 37));
        jLabel7.setText("Repetir contrasenya:");

        text_nom.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_nom.setForeground(new java.awt.Color(39, 40, 37));
        text_nom.setPreferredSize(new java.awt.Dimension(184, 30));

        text_telefon.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_telefon.setForeground(new java.awt.Color(39, 40, 37));
        text_telefon.setPreferredSize(new java.awt.Dimension(184, 30));

        text_nomUsuari.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_nomUsuari.setForeground(new java.awt.Color(39, 40, 37));
        text_nomUsuari.setPreferredSize(new java.awt.Dimension(184, 30));

        text_cognoms.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_cognoms.setForeground(new java.awt.Color(39, 40, 37));
        text_cognoms.setPreferredSize(new java.awt.Dimension(184, 30));

        jButton_register.setBackground(new java.awt.Color(51, 51, 51));
        jButton_register.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jButton_register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_register.setText("Registrar-se");
        jButton_register.setBorder(null);
        jButton_register.setMaximumSize(new java.awt.Dimension(95, 30));
        jButton_register.setMinimumSize(new java.awt.Dimension(95, 30));
        jButton_register.setPreferredSize(new java.awt.Dimension(95, 30));
        jButton_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_registerMouseExited(evt);
            }
        });
        jButton_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(39, 40, 37));
        jLabel8.setText("DNI:");

        text_dni.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_dni.setForeground(new java.awt.Color(39, 40, 37));
        text_dni.setPreferredSize(new java.awt.Dimension(184, 30));

        jButton_return.setBackground(new java.awt.Color(51, 51, 51));
        jButton_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_30px.png"))); // NOI18N
        jButton_return.setToolTipText("Torna enrere");
        jButton_return.setBorder(null);
        jButton_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_returnMouseExited(evt);
            }
        });
        jButton_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_returnActionPerformed(evt);
            }
        });

        label_info.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        label_info.setForeground(new java.awt.Color(255, 51, 51));
        label_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        text_contrassenya.setForeground(new java.awt.Color(39, 40, 37));
        text_contrassenya.setPreferredSize(new java.awt.Dimension(184, 30));

        text_repContrassenya.setForeground(new java.awt.Color(39, 40, 37));
        text_repContrassenya.setPreferredSize(new java.awt.Dimension(184, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nomUsuari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_contrassenya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_repContrassenya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_return, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(118, 118, 118)
                        .addComponent(text_cognoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144)
                        .addComponent(text_nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_telefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_cognoms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nomUsuari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_contrassenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(text_repContrassenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(label_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Botó registrar-se
    private void jButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registerActionPerformed
	
	// No poder haver-hi camps buits
	if (text_nom.getText().isEmpty() || text_cognoms.getText().isEmpty() || text_telefon.getText().isEmpty() ||
	    text_dni.getText().isEmpty() || text_nomUsuari.getText().isEmpty() || 
	    String.valueOf(text_contrassenya.getPassword()).isEmpty() || String.valueOf(text_repContrassenya.getPassword()).isEmpty())
	{
	    label_info.setText("Els camps no poden estar buits.");
	    return;
	}
	
	// Les contrasenyes han de coincidir
	if (!String.valueOf(text_contrassenya.getPassword()).equals(String.valueOf(text_repContrassenya.getPassword()))) {
	    label_info.setText("Les contrasenyes no coincideixen.");
	    return;
	}
	
	// Fer petició amb les dades
	String[] credencials = new String[6];
	
	credencials[0] = text_nom.getText();
	credencials[1] = text_cognoms.getText();
	credencials[2] = text_telefon.getText();
	credencials[3] = text_dni.getText();
	credencials[4] = text_nomUsuari.getText();
	credencials[5] = String.valueOf(text_contrassenya.getPassword());
	
	int codi = Connection.requestRegister(credencials);
	
	// Codi 1 == registre correcte
	if (codi == 1) {
	    label_info.setVisible(false);
	    JOptionPane.showMessageDialog(loginPanel, "T'has registrat correctament!");
	    backToLogin();
	}
	// Codi 2 == registre incorrecte (nom d'usuari existeix)
	else if (codi == 2) {
	    label_info.setText("El nom d'usuari ja existeix.");
	}
    }//GEN-LAST:event_jButton_registerActionPerformed

    // Botó retornar (<) - retorna a la pantalla de login
    private void jButton_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_returnActionPerformed
	backToLogin();
    }//GEN-LAST:event_jButton_returnActionPerformed
    
    // mostrar la pantalla de login
    private void backToLogin() {
	loginPanel = new Panel_login(frame);
	JPanel parent = (JPanel) this.getParent();
	parent.removeAll();
	parent.add(loginPanel);
	parent.revalidate();
	parent.repaint();
    }
    
    private void jButton_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registerMouseEntered
        jButton_register.setBackground(Data.DARK_LIGHT);
    }//GEN-LAST:event_jButton_registerMouseEntered

    private void jButton_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registerMouseExited
        jButton_register.setBackground(Data.DARK);
    }//GEN-LAST:event_jButton_registerMouseExited

    private void jButton_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_returnMouseEntered
        jButton_return.setBackground(Data.DARK_LIGHT);
    }//GEN-LAST:event_jButton_returnMouseEntered

    private void jButton_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_returnMouseExited
        jButton_return.setBackground(Data.DARK);
    }//GEN-LAST:event_jButton_returnMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_register;
    private javax.swing.JButton jButton_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_info;
    private javax.swing.JTextField text_cognoms;
    private javax.swing.JPasswordField text_contrassenya;
    private javax.swing.JTextField text_dni;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextField text_nomUsuari;
    private javax.swing.JPasswordField text_repContrassenya;
    private javax.swing.JTextField text_telefon;
    // End of variables declaration//GEN-END:variables
}