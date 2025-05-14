
package bibliotheque;

import java.awt.Toolkit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FenetreEmprunt extends javax.swing.JFrame {

    
   private DatabaseMapper dbm;        //declaraton de l'objet  DatabaseMapper
    private DefaultTableModel df;
    private Map<String,Integer> aubin = new HashMap<>();
    private Map<String,Integer> aubin2 = new HashMap<>();
    
    public FenetreEmprunt() {
        initComponents();
         dbm = new DatabaseMapper();
        displayEmprunts();
        displayEmpruntsCombo2();
        displayEmpruntsCombo();
        
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("animated-book-image-0016.gif")));
    }
    
     private void displayEmprunts()
    {
        List<Emprunt> Emprunts = dbm.getEmprunts();
        DefaultTableModel df = (DefaultTableModel) tblEmprunt.getModel();
        df.setRowCount (0);
        for(Emprunt em: Emprunts)
            {
               df.addRow(new Object[]{em.getIdEmp(),em.getDateEmp(),em.getDateRem(),em.getNoml(),em.getNomE()+" "+em.getPrenomE()});
            }
    }
      
      private void displayEmpruntsCombo2()
    {
        List<Etudiant> Etudiants = dbm.getEtudiants();
        System.out.println(Etudiants);
        Combo2.removeAllItems();
        for(Etudiant e: Etudiants)
        {
        String np = e.getNomE()+" "+e.getPrenomE();
        aubin.put(np, e.getIdE());
        Combo2.addItem(np);
    }
    }
      public int getIntCombo2()
    {
        String element = (String) Combo2.getSelectedItem();
        if(element != null){
            return aubin.get(element);
        }
        return -1;
    }
      
       private void displayEmpruntsCombo()
    {
        List<Livre> Livres = dbm.getLivres();
        System.out.println(Livres);
        Combo.removeAllItems();
        for(Livre l: Livres)
        {
        String np = l.getNoml();
        aubin2.put(np, l.getIdl());
        Combo.addItem(np);
    }
    }
      public int getIntCombo()
    {
        String element = (String) Combo.getSelectedItem();
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
        jLabel4 = new javax.swing.JLabel();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        txtdateEmp = new javax.swing.JTextField();
        txtidEmp = new javax.swing.JTextField();
        txtdateRem = new javax.swing.JTextField();
        btnActualiser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmprunt = new javax.swing.JTable();
        btnRetour = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("idEmp");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("dateEmp");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("dateRem");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("livre");

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

        txtdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateEmpActionPerformed(evt);
            }
        });

        txtdateRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateRemActionPerformed(evt);
            }
        });

        btnActualiser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualiser.setText("Actualiser");
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        tblEmprunt.setBackground(new java.awt.Color(51, 255, 51));
        tblEmprunt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblEmprunt.setForeground(new java.awt.Color(255, 255, 255));
        tblEmprunt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idEmp", "dateEmp", "dateRem", "livre", "Etudiants"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEmprunt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpruntMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmprunt);

        btnRetour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
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

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotheque/animated-book-image-0016.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Etudiants");

        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnEnregistrer)
                        .addGap(30, 30, 30)
                        .addComponent(btnModifier)
                        .addGap(29, 29, 29)
                        .addComponent(btnSupprimer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdateEmp)
                            .addComponent(txtdateRem)
                            .addComponent(txtidEmp)
                            .addComponent(Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualiser)
                            .addComponent(btnRetour))
                        .addGap(33, 33, 33))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualiser))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdateRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnRetour)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer)
                    .addComponent(btnEnregistrer))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateEmpActionPerformed

    private void txtdateRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateRemActionPerformed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        // TODO add your handling code here:
         clearFields();
          btnEnregistrer.setEnabled(true);
        
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        
         int idEmp =Integer.parseInt(txtidEmp.getText());
         String dateEmp = txtdateEmp.getText();
         String dateRem = txtdateRem.getText();
          int idl = getIntCombo();
           int idE = getIntCombo2();
//        int volume = Integer.valueOf(txtvolume.getText());
//        String maison = txtmaison.getText();
        Emprunt em = new Emprunt(idEmp,dateEmp, dateRem,idl,idE);
        if(dbm.Modifier(em)>0)
       {
       JOptionPane.showMessageDialog(rootPane,"Modification reussie");
         displayEmprunts();
         clearFields();
       }else{
            JOptionPane.showMessageDialog(rootPane, "Modifiacation non reussie");
            clearFields();
      }
       
        
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
         int idEmp =Integer.valueOf(txtidEmp.getText());
        if(dbm.SSSupprimer(idEmp) > 0)
        {
        JOptionPane.showMessageDialog(rootPane,"Suppression reussie");
        displayEmprunts();
        clearFields();
        }
        else{

            JOptionPane.showMessageDialog(rootPane, "Suppression non reussie");
            clearFields();
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void tblEmpruntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpruntMouseClicked
        // TODO add your handling code here:
        
         {                                         
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblEmprunt.getModel();
        int d = tblEmprunt.getSelectedRow();
        txtidEmp.setText(df.getValueAt(d, 0).toString());
        txtdateEmp.setText(df.getValueAt(d, 1).toString());
        txtdateRem.setText(df.getValueAt(d, 2).toString());
//        txtlivre.setText(df.getValueAt(d, 3).toString());
//        txtmaison.setText(df.getValueAt(d, 4).toString());
//        txtIsbn.setText(df.getValueAt(d, 5).toString());
    }        
        
    }//GEN-LAST:event_tblEmpruntMouseClicked

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        // TODO add your handling code here:
        Accueil2 a= new Accueil2();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
//             String dateEmp = txtdateEmp.getText();
        String dateRem = txtdateRem.getText();
//        int volume = Integer.valueOf(txtvolume.getText());
//        String maison = txtmaison.getText();
        int idl =getIntCombo();
        int idE =getIntCombo2();
           
        Emprunt em = new Emprunt( dateRem,idl, idE);
        if (dateRem.length() > 0 ) {
            if (dbm.addEmprunt(em) > 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Operation reussie");
                displayEmprunts();
                clearFields();
            } else {

                JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
                displayEmprunts();
                clearFields();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operation non reussie");
            clearFields();
        }
        
    
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void Combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2ActionPerformed
        // TODO add your handling code here:
        int idE = getIntCombo2();
    }//GEN-LAST:event_Combo2ActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
        int idl = getIntCombo();
    }//GEN-LAST:event_ComboActionPerformed

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
            java.util.logging.Logger.getLogger(FenetreEmprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreEmprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreEmprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreEmprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreEmprunt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmprunt;
    private javax.swing.JTextField txtdateEmp;
    private javax.swing.JTextField txtdateRem;
    private javax.swing.JTextField txtidEmp;
    // End of variables declaration//GEN-END:variables

     private void clearFields() {
        txtidEmp.setText("");
        txtdateEmp.setText("");
        txtdateRem.setText("");
        
//        txtmaison.setText("");
//        txtIsbn.setText("");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
