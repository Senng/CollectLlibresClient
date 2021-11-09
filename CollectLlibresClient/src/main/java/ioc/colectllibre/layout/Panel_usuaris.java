package ioc.colectllibre.layout;

import ioc.colectllibre.util.Connection;
import ioc.colectllibre.util.Data;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Rubén
 */
public class Panel_usuaris extends javax.swing.JPanel {
    
    private String[][] info_Usuaris;
    private DefaultTableModel model;
    
    public Panel_usuaris() {
	initComponents();
	omplirTaulaUsuaris();
    }
    
    /**
     * Omple la taula a partir d'una petició al servidor que retorna un arxiu 
     * XML amb totes les dades dels usuaris a la base de dades.
     */
    public void omplirTaulaUsuaris() {

	info_Usuaris = Connection.getAllUserInfo();
	model = (DefaultTableModel) jTable_usuaris.getModel();

	model.setRowCount(0);

	for (int i = 0; i < info_Usuaris.length; i++) {
	    String[] row = new String[info_Usuaris[i].length];
	    for (int j = 0; j < info_Usuaris[i].length; j++) {
		row[j] = info_Usuaris[i][j];
	    }
	    model.addRow(row);
	}
    }
    
    /**
     * Métode que filtra les dades de la jTable a partir del text introduit per
     * l'usuari, s'actualitza de manera dinàmica.
     * 
     * @param query = text introduit per l'usuari
     */
    public void filter(String query) {
	TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
	jTable_usuaris.setRowSorter(sorter);
	sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_usuaris = new javax.swing.JTable();
        jTextField_filter = new javax.swing.JTextField();
        jLabel_search = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_info = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 40, 37));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAULA D'USUARIS REGISTRATS");

        jTable_usuaris.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTable_usuaris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOM", "COGNOMS", "TELEFON", "DNI", "USUARI", "CONTRASSENYA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_usuaris.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_usuaris);

        jTextField_filter.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_filter.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField_filter.setForeground(new java.awt.Color(39, 40, 37));
        jTextField_filter.setText("Cerca per id, nom, cognoms...");
        jTextField_filter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_filterMouseClicked(evt);
            }
        });
        jTextField_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_filterKeyReleased(evt);
            }
        });

        jLabel_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_30px.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar usuari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label_info.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        label_info.setForeground(new java.awt.Color(255, 51, 51));
        label_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_filter))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_filter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_filterMouseClicked
        jTextField_filter.selectAll();
    }//GEN-LAST:event_jTextField_filterMouseClicked

    private void jTextField_filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_filterKeyReleased
        filter(jTextField_filter.getText());
    }//GEN-LAST:event_jTextField_filterKeyReleased
    
    // Elimina l'usuari seleccionat a la taula 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int column = 0;
	
	// comprova que s'hagi seleccionat una fila
	if (jTable_usuaris.getSelectionModel().isSelectionEmpty()) {
	    label_info.setForeground(Data.ERROR);
	    label_info.setText("Primer has de seleccionar un usuari.");
	    return;
	}
	
	int row = jTable_usuaris.getSelectedRow();
	int id = Integer.valueOf(jTable_usuaris.getModel().getValueAt(row, column).toString());
	int resposta = Connection.deleteUser(id);
	
	if (resposta == 1) {
	    label_info.setForeground(Data.CORRECT);
	    label_info.setText("L'usuari s'ha eliminat correctament.");
	    omplirTaulaUsuaris();
	}
	else if (resposta == 2) {
	    label_info.setForeground(Data.ERROR);
	    label_info.setText("No s'ha pogut eliminar l'usuari.");
	}
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_usuaris;
    private javax.swing.JTextField jTextField_filter;
    private javax.swing.JLabel label_info;
    // End of variables declaration//GEN-END:variables
}
