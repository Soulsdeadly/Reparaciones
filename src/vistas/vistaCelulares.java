/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

/**
 *
 * @author Rain
 */
public class vistaCelulares extends javax.swing.JFrame {

    /**
     * Creates new form vistaCelulares
     */
    public vistaCelulares() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        reparacionpbtn = new JButton();
        modelctxt = new JTextField();
        reparacioncbtn = new JButton();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        marcactxt = new JTextField();
        ramctxt = new JTextField();
        discoctxt = new JTextField();
        procesadorctxt = new JTextField();
        camaraftxt = new JTextField();
        camaraptxt = new JTextField();
        jLabel8 = new JLabel();
        totaltxt = new JTextField();
        regresarbtn = new JButton();
        cerrarbtn = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setText("Modelo");

        //---- jLabel2 ----
        jLabel2.setText("RAM");

        //---- jLabel3 ----
        jLabel3.setText("Procesador");

        //---- jLabel4 ----
        jLabel4.setText("Marca");

        //---- jLabel5 ----
        jLabel5.setText("Disco");

        //---- reparacionpbtn ----
        reparacionpbtn.setText("Reparacion Preventiva");
        reparacionpbtn.addActionListener(e -> reparacionpbtnActionPerformed(e));

        //---- modelctxt ----
        modelctxt.addActionListener(e -> modelctxtActionPerformed(e));

        //---- reparacioncbtn ----
        reparacioncbtn.setText("Reparacion Correctiva");

        //---- jLabel6 ----
        jLabel6.setText("MPx Camara Principal");

        //---- jLabel7 ----
        jLabel7.setText("MPx Camara Frontal");

        //---- marcactxt ----
        marcactxt.addActionListener(e -> marcactxtActionPerformed(e));

        //---- ramctxt ----
        ramctxt.addActionListener(e -> ramctxtActionPerformed(e));

        //---- discoctxt ----
        discoctxt.addActionListener(e -> discoctxtActionPerformed(e));

        //---- procesadorctxt ----
        procesadorctxt.addActionListener(e -> procesadorctxtActionPerformed(e));

        //---- camaraftxt ----
        camaraftxt.addActionListener(e -> camaraftxtActionPerformed(e));

        //---- camaraptxt ----
        camaraptxt.addActionListener(e -> camaraptxtActionPerformed(e));

        //---- jLabel8 ----
        jLabel8.setText("Total");

        //---- totaltxt ----
        totaltxt.addActionListener(e -> totaltxtActionPerformed(e));

        //---- regresarbtn ----
        regresarbtn.setText("Regresar");

        //---- cerrarbtn ----
        cerrarbtn.setText("Cerrar");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addGap(38, 38, 38)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(marcactxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modelctxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(procesadorctxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(camaraptxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ramctxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(discoctxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(camaraftxt, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(64, 64, 64))
                                        .addComponent(totaltxt, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(regresarbtn)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cerrarbtn))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(reparacioncbtn)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reparacionpbtn)))
                    .addGap(30, 30, 30))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel4))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(marcactxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(modelctxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ramctxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(discoctxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(procesadorctxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(camaraptxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(camaraftxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(10, 10, 10)
                            .addComponent(totaltxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(reparacionpbtn)
                        .addComponent(reparacioncbtn))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(regresarbtn)
                        .addComponent(cerrarbtn))
                    .addContainerGap(45, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void modelctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelctxtActionPerformed

    private void reparacionpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reparacionpbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reparacionpbtnActionPerformed

    private void marcactxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcactxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcactxtActionPerformed

    private void ramctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ramctxtActionPerformed

    private void discoctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discoctxtActionPerformed

    private void procesadorctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesadorctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesadorctxtActionPerformed

    private void camaraftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camaraftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camaraftxtActionPerformed

    private void camaraptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camaraptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camaraptxtActionPerformed

    private void totaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaltxtActionPerformed

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
            java.util.logging.Logger.getLogger(vistaCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCelulares().setVisible(true);
            }
        });

    }

    public vistaCelulares(JTextField camaraftxt, JTextField camaraptxt, JButton cerrarbtn, JTextField discoctxt, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JTextField marcactxt, JTextField modelctxt, JTextField procesadorctxt, JTextField ramctxt, JButton regresarbtn, JButton reparacioncbtn, JButton reparacionpbtn, JTextField totaltxt) {
        this.camaraftxt = camaraftxt;
        this.camaraptxt = camaraptxt;
        this.cerrarbtn = cerrarbtn;
        this.discoctxt = discoctxt;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.marcactxt = marcactxt;
        this.modelctxt = modelctxt;
        this.procesadorctxt = procesadorctxt;
        this.ramctxt = ramctxt;
        this.regresarbtn = regresarbtn;
        this.reparacioncbtn = reparacioncbtn;
        this.reparacionpbtn = reparacionpbtn;
        this.totaltxt = totaltxt;
    }

    public JTextField getCamaraftxt() {
        return camaraftxt;
    }

    public void setCamaraftxt(JTextField camaraftxt) {
        this.camaraftxt = camaraftxt;
    }

    public JTextField getCamaraptxt() {
        return camaraptxt;
    }

    public void setCamaraptxt(JTextField camaraptxt) {
        this.camaraptxt = camaraptxt;
    }

    public JButton getCerrarbtn() {
        return cerrarbtn;
    }

    public void setCerrarbtn(JButton cerrarbtn) {
        this.cerrarbtn = cerrarbtn;
    }

    public JTextField getDiscoctxt() {
        return discoctxt;
    }

    public void setDiscoctxt(JTextField discoctxt) {
        this.discoctxt = discoctxt;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JTextField getMarcactxt() {
        return marcactxt;
    }

    public void setMarcactxt(JTextField marcactxt) {
        this.marcactxt = marcactxt;
    }

    public JTextField getModelctxt() {
        return modelctxt;
    }

    public void setModelctxt(JTextField modelctxt) {
        this.modelctxt = modelctxt;
    }

    public JTextField getProcesadorctxt() {
        return procesadorctxt;
    }

    public void setProcesadorctxt(JTextField procesadorctxt) {
        this.procesadorctxt = procesadorctxt;
    }

    public JTextField getRamctxt() {
        return ramctxt;
    }

    public void setRamctxt(JTextField ramctxt) {
        this.ramctxt = ramctxt;
    }

    public JButton getRegresarbtn() {
        return regresarbtn;
    }

    public void setRegresarbtn(JButton regresarbtn) {
        this.regresarbtn = regresarbtn;
    }

    public JButton getReparacioncbtn() {
        return reparacioncbtn;
    }

    public void setReparacioncbtn(JButton reparacioncbtn) {
        this.reparacioncbtn = reparacioncbtn;
    }

    public JButton getReparacionpbtn() {
        return reparacionpbtn;
    }

    public void setReparacionpbtn(JButton reparacionpbtn) {
        this.reparacionpbtn = reparacionpbtn;
    }

    public JTextField getTotaltxt() {
        return totaltxt;
    }

    public void setTotaltxt(JTextField totaltxt) {
        this.totaltxt = totaltxt;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JButton reparacionpbtn;
    private JTextField modelctxt;
    private JButton reparacioncbtn;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JTextField marcactxt;
    private JTextField ramctxt;
    private JTextField discoctxt;
    private JTextField procesadorctxt;
    private JTextField camaraftxt;
    private JTextField camaraptxt;
    private JLabel jLabel8;
    private JTextField totaltxt;
    private JButton regresarbtn;
    private JButton cerrarbtn;
    // End of variables declaration//GEN-END:variables
}
