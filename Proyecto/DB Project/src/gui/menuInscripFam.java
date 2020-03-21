/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.DetalleInscripcionDAO;
import datos.InscripcionDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.DetalleInscripcion;
import negocio.GestorInscripcion;
import negocio.Inscripcion;
import util.CaException;
/**
 *
 * @author Mateo
 */
public class menuInscripFam extends javax.swing.JFrame {

    Inscripcion insReal;
    DetalleInscripcion detalleReal;
    /**
     * Creates new form menuInscripFam
     */
    public menuInscripFam() {
        super("Inscribir familiar");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idEvento = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        inscribirse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inscrip = new javax.swing.JTextField();
        tipoID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        idIns = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel1.setText("Identificacion del evento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 20));

        jLabel2.setText("Cédula del familiar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 20));
        getContentPane().add(idEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, -1));
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, -1));

        inscribirse.setText("Inscribir");
        inscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirseActionPerformed(evt);
            }
        });
        getContentPane().add(inscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 20));

        jLabel5.setText("N° de la inscripcion del asociado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));
        getContentPane().add(inscrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 190, -1));

        tipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "PA", "CA" }));
        getContentPane().add(tipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel6.setText("Identificador de detalle");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));
        getContentPane().add(idIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        menuInscrip m = new menuInscrip();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void inscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirseActionPerformed

        GestorInscripcion gestor = new GestorInscripcion();
        InscripcionDAO inscripcionDAO = gestor.getInscripcionDAO();

        insReal = inscripcionDAO.getIns();

        insReal.setK_ins(Integer.parseInt(inscrip.getText()));
        insReal.setK_code(Integer.parseInt(idEvento.getText()));
        insReal.setI_estadoi("CA");
        insReal.setV_ins(100000);
        insReal.setO_asiste(true);
        insReal.setK_tipo(tipoID.getItemAt(tipoID.getSelectedIndex()));
        insReal.setK_num(Integer.parseInt(cedula.getText()));

        inscripcionDAO.setIns(insReal);
        gestor.setInscripcionDAO(inscripcionDAO);
        
        DetalleInscripcionDAO detalleDao = new DetalleInscripcionDAO();
        detalleReal = detalleDao.getDet();
        detalleReal.setK_iddi(Integer.parseInt(idIns.getText()));
        detalleReal.setK_ins(Integer.parseInt(inscrip.getText()));
        detalleReal.setK_numidf(Integer.parseInt(cedula.getText()));
        detalleReal.setK_tipoidf(tipoID.getItemAt(tipoID.getSelectedIndex()));
        
        try {
            detalleDao.incluirDetalleInscripcion();
            JOptionPane.showMessageDialog(null, "Se ha hecho la inscripcion");
        } catch (CaException ex) {
           // Logger.getLogger(menuInscripFam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_inscribirseActionPerformed

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
            java.util.logging.Logger.getLogger(menuInscripFam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuInscripFam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuInscripFam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuInscripFam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuInscripFam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField idEvento;
    private javax.swing.JTextField idIns;
    private javax.swing.JButton inscribirse;
    private javax.swing.JTextField inscrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> tipoID;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
