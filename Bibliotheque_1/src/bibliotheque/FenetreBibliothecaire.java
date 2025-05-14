
package bibliotheque;

import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FenetreBibliothecaire extends javax.swing.JFrame 
{

    
    private DatabaseMapper dbm;        //declaraton de l'objet  DatabaseMapper
    private DefaultTableModel df;
    
    public FenetreBibliothecaire() {
        
        initComponents();
         dbm = new DatabaseMapper();
        displayBibliothecaires();
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("animated-book-image-0016.gif")));
        count();
    }
    
     public void count(){
    int i = dbm.conterbibliothecaire();
    txtcount.setText(String.valueOf(i));
    }
    
    private void displayBibliothecaires()
   {
        List<Bibliothecaire> Bibliothecaires = dbm.getBibliothecaires();
       DefaultTableModel df = (DefaultTableModel) tblBibliothecaire.getModel();
        df.setRowCount (0);
        for(Bibliothecaire b: Bibliothecaires)
         {
         df.addRow(new Object[]{b.getIdB(),b.getNomB(),b.getPrenomB(),b.getAdresseB(),b.getTelB(),b.getMot_de_passe()});
          }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdB = new javax.swing.JTextField();
        txtnomB = new javax.swing.JTextField();
        txtprenomB = new javax.swing.JTextField();
        txtadresseB = new javax.swing.JTextField();
        txttelB = new javax.swing.JTextField();
        btnActualiser = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMot_de_passe = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBibliothecaire = new javax.swing.JTable();
        Retour = new javax.swing.JButton();
        txtcount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("IdB");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("nomB");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("prenomB");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("adresseB");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("telB");

        txtnomB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomBActionPerformed(evt);
            }
        });

        btnActualiser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualiser.setText("Actualiser");
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mot de passe");

        tblBibliothecaire.setBackground(new java.awt.Color(153, 255, 153));
        tblBibliothecaire.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblBibliothecaire.setForeground(new java.awt.Color(255, 255, 255));
        tblBibliothecaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idB", "nomB", "prenomB", "adresseB", "telB", "Mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBibliothecaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBibliothecaireMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBibliothecaire);

        Retour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Retour.setText("Retour");
        Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetourMouseClicked(evt);
            }
        });

        txtcount.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtcount.setForeground(new java.awt.Color(255, 255, 255));
        txtcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnregistrer)
                .addGap(18, 18, 18)
                .addComponent(btnModifier)
                .addGap(31, 31, 31)
                .addComponent(btnSupprimer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMot_de_passe, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(txtIdB)
                    .addComponent(txtnomB)
                    .addComponent(txtprenomB)
                    .addComponent(txtadresseB, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(txttelB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualiser)
                    .addComponent(Retour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnActualiser)
                        .addGap(45, 45, 45)
                        .addComponent(Retour)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtprenomB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtadresseB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtcount, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMot_de_passe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotheque/animated-book-image-0016.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomBActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        int idB =Integer.valueOf(txtIdB.getText());
         String nomB = txtprenomB.getText();
         String prenomB = txtprenomB.getText();
//        int volume = Integer.valueOf(txtvolume.getText());
        String adresseB = txtadresseB.getText();
//        String  = txttelB.getText();
         String telB = txttelB.getText();
         String Mot_de_passe =txtMot_de_passe.getText();
        Bibliothecaire b = new Bibliothecaire(idB,nomB,prenomB,adresseB,telB,Mot_de_passe);
        if(dbm.Modifier(b)>0)
       {
       JOptionPane.showMessageDialog(rootPane,"Modification reussie");
        displayBibliothecaires();
         clearFields();
       }else{
            JOptionPane.showMessageDialog(rootPane, "Modifiacation non reussie");
            clearFields();
      }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
        String nomB = txtnomB.getText();  
        String prenomB = txtprenomB.getText();
        String adresseB = txtadresseB.getText();
//        int volume = Integer.valueOf(txtvolume.getText());
//        String maison = txtmaison.getText();
        String telB = txttelB.getText();
        String Mot_de_passe = txtMot_de_passe.getText();
           
        Bibliothecaire b = new Bibliothecaire(nomB,prenomB, adresseB,telB,Mot_de_passe);
        if (nomB.length() > 0 && prenomB.length() > 0 && adresseB.length() >0 && telB.length() > 0 && Mot_de_passe.length()>0)
        {
            if (dbm.addBibliothecaire(b) > 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Operation reussie");
                displayBibliothecaires();
                clearFields();
                count();
            } else {

                JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
                displayBibliothecaires();
                clearFields();
                count();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
            clearFields();
            count();
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
         int idB =Integer.valueOf(txtIdB.getText());
        if(dbm.SSSSupprimer(idB) > 0)
        {
        JOptionPane.showMessageDialog(rootPane,"Suppression reussie");
        displayBibliothecaires();
        clearFields();
        count();
        }
        else{

            JOptionPane.showMessageDialog(rootPane, "Suppression non reussie");
            clearFields();
            count();
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        // TODO add your handling code here:
        clearFields();
          btnEnregistrer.setEnabled(true);
          count();
          
        
        
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void tblBibliothecaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBibliothecaireMouseClicked
        // TODO add your handling code here:
          {                                         
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblBibliothecaire.getModel();
        int d = tblBibliothecaire.getSelectedRow();
        txtIdB.setText(df.getValueAt(d, 0).toString());
        txtnomB.setText(df.getValueAt(d, 1).toString());
        txtprenomB.setText(df.getValueAt(d, 2).toString());
        txtadresseB.setText(df.getValueAt(d, 3).toString());
        txttelB.setText(df.getValueAt(d, 4).toString());
        txtMot_de_passe.setText(df.getValueAt(d, 5).toString());
    }
    }//GEN-LAST:event_tblBibliothecaireMouseClicked

    private void RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetourMouseClicked
        // TODO add your handling code here:
        Accueil2 b= new Accueil2();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetourMouseClicked

    
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
            java.util.logging.Logger.getLogger(FenetreBibliothecaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreBibliothecaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreBibliothecaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreBibliothecaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreBibliothecaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBibliothecaire;
    private javax.swing.JTextField txtIdB;
    private javax.swing.JPasswordField txtMot_de_passe;
    private javax.swing.JTextField txtadresseB;
    private javax.swing.JLabel txtcount;
    private javax.swing.JTextField txtnomB;
    private javax.swing.JTextField txtprenomB;
    private javax.swing.JTextField txttelB;
    // End of variables declaration//GEN-END:variables
  
     private void clearFields() {
        txtIdB.setText("");
        txtnomB.setText("");
        txtprenomB.setText("");
        txtadresseB.setText("");
        txttelB.setText("");
        txtMot_de_passe.setText("");
//        txtIsbn.setText("");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
