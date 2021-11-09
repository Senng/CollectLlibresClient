package ioc.colectllibre.layout;

import ioc.colectllibre.model.Usuari;
import ioc.colectllibre.util.Connection;
import ioc.colectllibre.util.Data;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Rubén
 * 
 * Classe que hereta de JPanel i conté tots els elements de la pantalla de 
 * login.
 */
public class Panel_login extends javax.swing.JPanel {

    private JFrame frame;
    private JPanel registerPanel;
    
    public Panel_login(JFrame frame) {
	this.frame = frame;
	initComponents();
	frame.setSize(500, 500);
	
	// Disseny camps de text
	text_Username.setBorder(Data.BORDER);
	text_Password.setBorder(Data.BORDER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_Username = new javax.swing.JTextField();
        text_Password = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        label_info = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_register = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        text_Username.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_Username.setToolTipText("Nom d'usuari");
        text_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_UsernameKeyPressed(evt);
            }
        });

        text_Password.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        text_Password.setToolTipText("Contrassenya");
        text_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_PasswordKeyPressed(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(51, 51, 51));
        jButton_login.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Entrar");
        jButton_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_loginMouseExited(evt);
            }
        });
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        label_info.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        label_info.setForeground(new java.awt.Color(255, 51, 51));
        label_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_30px_2.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_30px_2.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colectllibres_black.png"))); // NOI18N

        jButton_register.setBackground(new java.awt.Color(255, 255, 255));
        jButton_register.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton_register.setForeground(new java.awt.Color(0, 171, 214));
        jButton_register.setText("No estàs registrat? Fes clic aquí!");
        jButton_register.setBorder(null);
        jButton_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_Password)
                            .addComponent(text_Username)))
                    .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_Username))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_register)
                .addGap(18, 18, 18)
                .addComponent(label_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Esdeveniment en fer clic al botó de login, envía els credencials al servidor
     * i si la resposta és correcta, entra a l'aplicació, sino es mostra un text
     * segons l'error.
     * 
     * @param evt 
     */
    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed

	// Els camps no poden ser buits
	if (text_Username.getText().isEmpty() || text_Password.getText().isEmpty()) {
	    label_info.setVisible(true);
	    label_info.setText("Els camps no poden estar buits.");
	    return;
	}

	// Comprovar credencials
	int codi = Connection.requestLogin(text_Username.getText(), String.valueOf(text_Password.getPassword()));

	switch (codi) {
	    case 1: // Login correcte
		Usuari user = Connection.getCurrentUserInfo(text_Username.getText());
		frame.dispose();
		new Frame_menu(user).setVisible(true);
		break;
	    case 2: // Credencials incorrectes
		label_info.setText("Credencials incorrectes.");
		break;
	    default:
		break;
	}
    }//GEN-LAST:event_jButton_loginActionPerformed

    // Pitjar "Enter" serà com pitjar el botó de Login
    private void text_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_PasswordKeyPressed
	if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
	    jButton_login.doClick();
	}
    }//GEN-LAST:event_text_PasswordKeyPressed
    private void text_UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_UsernameKeyPressed
	if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
	    jButton_login.doClick();
	}
    }//GEN-LAST:event_text_UsernameKeyPressed
    
    // Botó per registrar-se
    private void jButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registerActionPerformed
        registerPanel = new Panel_register(frame);
	
	JPanel parent = (JPanel) this.getParent();
	
	parent.removeAll();
	parent.add(registerPanel);
	parent.revalidate();
	parent.repaint();
    }//GEN-LAST:event_jButton_registerActionPerformed
    
    // Efecte de hover als botons
    private void jButton_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registerMouseEntered
	jButton_register.setForeground(Data.URL_HOVER);
    }//GEN-LAST:event_jButton_registerMouseEntered

    private void jButton_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registerMouseExited
	jButton_register.setForeground(Data.URL);
    }//GEN-LAST:event_jButton_registerMouseExited

    private void jButton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseEntered
        jButton_login.setBackground(Data.DARK_LIGHT);
    }//GEN-LAST:event_jButton_loginMouseEntered

    private void jButton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseExited
        jButton_login.setBackground(Data.DARK);
    }//GEN-LAST:event_jButton_loginMouseExited
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_info;
    private javax.swing.JPasswordField text_Password;
    private javax.swing.JTextField text_Username;
    // End of variables declaration//GEN-END:variables
}