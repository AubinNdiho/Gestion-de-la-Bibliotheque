
package bibliotheque;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FenetreReservation extends javax.swing.JFrame {
    private Connection con = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Map<String,Integer> aubin = new HashMap<>();
    private Map<String,Integer> aubin2 = new HashMap<>();

    private DatabaseMapper dbm;        //declaraton de l'objet  DatabaseMapper
    private DefaultTableModel df;
    
    public FenetreReservation() {
          initComponents();
         dbm = new DatabaseMapper();
        displayReservations();
        displayReservationsCombo();
        displayReservationsCombo2();
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("animated-book-image-0016.gif")));
    }

     private void displayReservations()
    {
        List<Reservation> Reservations = dbm.getReservations();
        DefaultTableModel df = (DefaultTableModel) tblReservation.getModel();
        df.setRowCount (0);
        for(Reservation r: Reservations)
        {
        df.addRow(new Object[]{r.getIdRes(),r.getNoml(),r.getDateRes(),r.getNomE()+" "+r.getPrenomE()});
    }
    }
    private void displayReservationsCombo()
    {
        List<Etudiant> Etudiants = dbm.getEtudiants();
        System.out.println(Etudiants);
        combo.removeAllItems();
        for(Etudiant e: Etudiants)
        {
        String np = e.getNomE()+" "+e.getPrenomE();
        aubin.put(np, e.getIdE());
        combo.addItem(np);
    }
    }
    public int getIntCombo()
    {
        String element = (String) combo.getSelectedItem();
        if(element != null){
            return aubin.get(element);
        }
        return -1;
    }
    
    private void displayReservationsCombo2()
    {
        List<Livre> Livres = dbm.getLivres();
        System.out.println(Livres);
        combo2.removeAllItems();
        for(Livre l: Livres)
        {
        String np = l.getNoml();
        aubin2.put(np, l.getIdl());
        combo2.addItem(np);
    }
    }
    public int getIntCombo2()
    {
        String element = (String) combo2.getSelectedItem();
        if(element != null){
            return aubin2.get(element);
        }
        return -1;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidRes = new javax.swing.JTextField();
        txtdateRes = new javax.swing.JTextField();
        btnEnregistrer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservation = new javax.swing.JTable();
        btnRetour = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("idRes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("livre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("dateRes");

        txtdateRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateResActionPerformed(evt);
            }
        });

        btnEnregistrer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnregistrer.setForeground(new java.awt.Color(204, 204, 255));
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModifier.setForeground(new java.awt.Color(204, 204, 255));
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSupprimer.setForeground(new java.awt.Color(204, 204, 255));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnActualiser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualiser.setText("Actualiser");
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        tblReservation.setBackground(new java.awt.Color(51, 255, 51));
        tblReservation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblReservation.setForeground(new java.awt.Color(255, 255, 255));
        tblReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idRes", "livre", "dateRes", "Etudiants"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservation);

        btnRetour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Etudiants");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>()
        );
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotheque/animated-book-image-0016.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnEnregistrer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModifier))
                            .addComponent(txtidRes)
                            .addComponent(txtdateRes)
                            .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnActualiser)
                                .addComponent(btnRetour))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSupprimer)
                                .addGap(21, 21, 21)))
                        .addContainerGap())
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnActualiser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtidRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdateRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnRetour))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
         int idRes =Integer.valueOf(txtidRes.getText());
        if(dbm.SSupprimer(idRes) > 0)
        {
        JOptionPane.showMessageDialog(rootPane,"Suppression reussie");
        displayReservations();
        clearFields();
        }
        else{

            JOptionPane.showMessageDialog(rootPane, "Suppression non reussie");
            clearFields();
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
     // TODO add your handling code here:
     
      int idE =getIntCombo();
      int idl =getIntCombo2();
    
        Reservation r = new Reservation(idE, idl);
        if (idl > 0 && idE >0) 
        {
            if (dbm.addReservation(r) > 0) 
            {
                JOptionPane.showMessageDialog(rootPane, "Operation reussie");
                displayReservations();
                clearFields();
            } else {

                JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
                displayReservations();
                clearFields();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
            clearFields();
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
         int idRes =Integer.valueOf(txtidRes.getText());
       
        String dateRes = txtdateRes.getText();
        int idE = getIntCombo();
        int idl =getIntCombo2();
//        int volume = Integer.valueOf(txtvolume.getText());
//        String maison = txtmaison.getText();
//        String Isbn = txtIsbn.getText();
        Reservation r = new Reservation(idRes, idl, dateRes,idE);
        if(dbm.Modifier(r)>0)
       {
       JOptionPane.showMessageDialog(rootPane,"Modification reussie");
         displayReservations();
         clearFields();
       }else{
            JOptionPane.showMessageDialog(rootPane, "Modifiacation non reussie");
            clearFields();
      }
       
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        // TODO add your handling code here:
         clearFields();
          btnEnregistrer.setEnabled(true);
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void tblReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationMouseClicked
        // TODO add your handling code here:
          {                                         
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblReservation.getModel();
        int d = tblReservation.getSelectedRow();
        txtidRes.setText(df.getValueAt(d, 0).toString());
//        
        txtdateRes.setText(df.getValueAt(d, 2).toString());
//        txtvolume.setText(df.getValueAt(d, 3).toString());
//        txtmaison.setText(df.getValueAt(d, 4).toString());
//        txtIsbn.setText(df.getValueAt(d, 5).toString());
    }                                        

        
    }//GEN-LAST:event_tblReservationMouseClicked

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        // TODO add your handling code here:
          Accueil2 a= new Accueil2();
          a.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
            int idE = getIntCombo();
    }//GEN-LAST:event_comboActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemStateChanged

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
        int idl = getIntCombo2();
    }//GEN-LAST:event_combo2ActionPerformed

    private void txtdateResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateResActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReservation;
    private javax.swing.JTextField txtdateRes;
    private javax.swing.JTextField txtidRes;
    // End of variables declaration//GEN-END:variables

private void clearFields()
{
        txtidRes.setText("");
//        txtlivre.setText("");
        txtdateRes.setText("");
//        txtvolume.setText("");
//        txtmaison.setText("");
//        txtIsbn.setText("");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
