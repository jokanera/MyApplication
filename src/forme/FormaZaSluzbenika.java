/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.awt.Toolkit;

/**
 *
 * @author PC
 */
public class FormaZaSluzbenika extends javax.swing.JFrame {

    /**
     * Creates new form FormaZaSluzbenika
     */
    public FormaZaSluzbenika() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        setSize(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miUnosKomisije = new javax.swing.JMenuItem();
        miIzmenaKomisije = new javax.swing.JMenuItem();
        miUnosKandidata = new javax.swing.JMenuItem();
        miUnosTesta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiIzlogujteSe = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jMenu1.setText("Glavni meni");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        miUnosKomisije.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK));
        miUnosKomisije.setText("Unos komisije");
        miUnosKomisije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnosKomisijeActionPerformed(evt);
            }
        });
        jMenu1.add(miUnosKomisije);

        miIzmenaKomisije.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK));
        miIzmenaKomisije.setText("Izmena komisije");
        miIzmenaKomisije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIzmenaKomisijeActionPerformed(evt);
            }
        });
        jMenu1.add(miIzmenaKomisije);

        miUnosKandidata.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        miUnosKandidata.setText("Unos kandidata");
        miUnosKandidata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnosKandidataActionPerformed(evt);
            }
        });
        jMenu1.add(miUnosKandidata);

        miUnosTesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        miUnosTesta.setText("Unos grupe zadataka");
        miUnosTesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnosTestaActionPerformed(evt);
            }
        });
        jMenu1.add(miUnosTesta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sluzbenik");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmiIzlogujteSe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        jmiIzlogujteSe.setSelected(true);
        jmiIzlogujteSe.setText("Izlogujte se");
        jmiIzlogujteSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzlogujteSeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiIzlogujteSe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
//        FormaUnosKomisije fuk = new FormaUnosKomisije();
//        fuk.setVisible(true);
//        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void miUnosKomisijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnosKomisijeActionPerformed
        // TODO add your handling code here:
        FormaUnosKomisije fuk = new FormaUnosKomisije();
        fuk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miUnosKomisijeActionPerformed

    private void miUnosKandidataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnosKandidataActionPerformed
        // TODO add your handling code here:
        FormaUnosKandidata fukan = new FormaUnosKandidata();
        fukan.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_miUnosKandidataActionPerformed

    private void miIzmenaKomisijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIzmenaKomisijeActionPerformed
       FormaZaIzmenuKomisije fzik = new FormaZaIzmenuKomisije();
       fzik.setVisible(true);
       this.setVisible(false);
               
    }//GEN-LAST:event_miIzmenaKomisijeActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmiIzlogujteSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzlogujteSeActionPerformed
       FormaPrijaviSe fps = new FormaPrijaviSe();
        fps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiIzlogujteSeActionPerformed

    private void miUnosTestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnosTestaActionPerformed
        UnosGrupeZadataka ugz = new  UnosGrupeZadataka();
        ugz.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miUnosTestaActionPerformed

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
            java.util.logging.Logger.getLogger(FormaZaSluzbenika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaZaSluzbenika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaZaSluzbenika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaZaSluzbenika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaZaSluzbenika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBoxMenuItem jmiIzlogujteSe;
    private javax.swing.JMenuItem miIzmenaKomisije;
    private javax.swing.JMenuItem miUnosKandidata;
    private javax.swing.JMenuItem miUnosKomisije;
    private javax.swing.JMenuItem miUnosTesta;
    // End of variables declaration//GEN-END:variables
}
