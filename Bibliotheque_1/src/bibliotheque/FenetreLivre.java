
package bibliotheque;

import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
//import java.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FenetreLivre extends javax.swing.JFrame {

    private DatabaseMapper dbm;        //declaraton de l'objet  DatabaseMapper
    private DefaultTableModel df;
 
    
    public FenetreLivre() {
        initComponents();
         dbm = new DatabaseMapper();
        displayLivres();
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("animated-book-image-0016.gif")));
        count();
    }
    
     public void count(){
    int i = dbm.conterlivre();
    txtcount.setText(String.valueOf(i));
    }
    
    private void displayLivres()
    {
        List<Livre> Livres = dbm.getLivres();
        DefaultTableModel df = (DefaultTableModel) tblLivre.getModel();
        df.setRowCount (0);
        for(Livre l: Livres)
        {
        df.addRow(new Object[]{l.getIdl(),l.getNoml(),l.getAuteur(),l.getVolume(),l.getMaison(),l.getIsbn()});
    }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idl = new javax.swing.JLabel();
        noml = new javax.swing.JLabel();
        auteur = new javax.swing.JLabel();
        volume = new javax.swing.JLabel();
        maison = new javax.swing.JLabel();
        Isbn = new javax.swing.JLabel();
        txtidl = new javax.swing.JTextField();
        txtnoml = new javax.swing.JTextField();
        txtauteur = new javax.swing.JTextField();
        txtvolume = new javax.swing.JTextField();
        txtmaison = new javax.swing.JTextField();
        txtIsbn = new javax.swing.JTextField();
        btnEnregistrer = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();
        btnRetour = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLivre = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        idl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idl.setText("idl");

        noml.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noml.setText("noml");

        auteur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        auteur.setText("auteur");

        volume.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volume.setText("volume");

        maison.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maison.setText("maison");

        Isbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Isbn.setText("Isbn");

        txtnoml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomlActionPerformed(evt);
            }
        });

        txtauteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauteurActionPerformed(evt);
            }
        });

        txtvolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvolumeActionPerformed(evt);
            }
        });

        txtmaison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaisonActionPerformed(evt);
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

        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSupprimer.setForeground(new java.awt.Color(204, 204, 255));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
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

        btnActualiser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualiser.setText("Actualiser");
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        btnRetour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        tblLivre.setBackground(new java.awt.Color(51, 255, 51));
        tblLivre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblLivre.setForeground(new java.awt.Color(255, 255, 255));
        tblLivre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idlivre", "Nomlivre", "Auteur", "Volume", "Maison", "Isbn"
            }
        ));
        tblLivre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLivreMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLivre);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotheque/animated-book-image-0016.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtcount.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtcount.setForeground(new java.awt.Color(255, 255, 255));
        txtcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnregistrer)
                        .addGap(42, 42, 42)
                        .addComponent(btnModifier)
                        .addGap(45, 45, 45)
                        .addComponent(btnSupprimer)
                        .addGap(85, 85, 85))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtvolume, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(maison, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtmaison, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtidl, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noml, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(auteur, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnoml, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtauteur, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRetour)
                                    .addComponent(btnActualiser))))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idl)
                                    .addComponent(txtidl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(noml)
                                    .addComponent(txtnoml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnActualiser)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetour))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtauteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(auteur))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtvolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volume))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtmaison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maison))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Isbn))))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupprimer)
                    .addComponent(btnModifier)
                    .addComponent(btnEnregistrer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomlActionPerformed

    private void txtmaisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaisonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaisonActionPerformed

    private void txtvolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvolumeActionPerformed

    private void txtauteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtauteurActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
        String noml = txtnoml.getText();
        String auteur = txtauteur.getText();
        int volume = Integer.valueOf(txtvolume.getText());
        String maison = txtmaison.getText();
        String Isbn = txtIsbn.getText();
           
        Livre l = new Livre(noml,auteur, maison,volume, Isbn);
        if (noml.length() > 0 && auteur.length() > 0) {
            if (dbm.addLivre(l) > 0) {
                JOptionPane.showMessageDialog(rootPane, "Operation reussie");
                displayLivres();
                clearFields();
                count();
            } else {

                JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
                displayLivres();
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
        int idl =Integer.valueOf(txtidl.getText());
        if(dbm.Supprimer(idl) > 0)
        {
        JOptionPane.showMessageDialog(rootPane,"Suppression reussie");
        displayLivres();
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
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void tblLivreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivreMouseClicked
        // TODO add your handling code here:
         {                                         
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblLivre.getModel();
        int d = tblLivre.getSelectedRow();
        txtidl.setText(df.getValueAt(d, 0).toString());
        txtnoml.setText(df.getValueAt(d, 1).toString());
        txtauteur.setText(df.getValueAt(d, 2).toString());
        txtvolume.setText(df.getValueAt(d, 3).toString());
        txtmaison.setText(df.getValueAt(d, 4).toString());
        txtIsbn.setText(df.getValueAt(d, 5).toString());
    }                                        

        
        
    }//GEN-LAST:event_tblLivreMouseClicked

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        
         int idl =Integer.valueOf(txtidl.getText());
        String noml = txtnoml.getText();
        String auteur = txtauteur.getText();
        int volume = Integer.valueOf(txtvolume.getText());
        String maison = txtmaison.getText();
        String Isbn = txtIsbn.getText();
        Livre l = new Livre(idl, noml, auteur, volume, maison, Isbn);
        if(dbm.Modifier(l)>0)
       {
       JOptionPane.showMessageDialog(rootPane,"Modification reussie");
         displayLivres();
         clearFields();
       }else{
            JOptionPane.showMessageDialog(rootPane, "Modifiacation non reussie");
            clearFields();
      }
       
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        // TODO add your handling code here:
          Accueil2 a = new Accueil2();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

    private void txtcountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcountMouseClicked
        // TODO add your handling code here:
        count();
    }//GEN-LAST:event_txtcountMouseClicked

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
            java.util.logging.Logger.getLogger(FenetreLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreLivre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Isbn;
    private javax.swing.JLabel auteur;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel idl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel maison;
    private javax.swing.JLabel noml;
    private javax.swing.JTable tblLivre;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtauteur;
    private javax.swing.JLabel txtcount;
    private javax.swing.JTextField txtidl;
    private javax.swing.JTextField txtmaison;
    private javax.swing.JTextField txtnoml;
    private javax.swing.JTextField txtvolume;
    private javax.swing.JLabel volume;
    // End of variables declaration//GEN-END:variables


 private void clearFields() {
        txtidl.setText("");
        txtnoml.setText("");
        txtauteur.setText("");
        txtvolume.setText("");
        txtmaison.setText("");
        txtIsbn.setText("");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
