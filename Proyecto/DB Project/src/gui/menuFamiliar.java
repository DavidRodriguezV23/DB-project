/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.FamiliarDAO;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.Familiar;
import util.CaException;

/**
 *
 * @author Mateo
 */
public class menuFamiliar extends javax.swing.JFrame {

    Familiar famReal;

    /**
     * Creates new form menuFamiliar
     */
    public menuFamiliar() {
        super("Crear Familiar");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        segundoNombre = new javax.swing.JTextField();
        primerNombre = new javax.swing.JTextField();
        primerApellido = new javax.swing.JTextField();
        lugarExp = new javax.swing.JTextField();
        parentesco = new javax.swing.JTextField();
        segundoApellido = new javax.swing.JTextField();
        fNaci = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tipoID = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        idaso = new javax.swing.JTextField();
        tipoID1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Crear Familiar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jLabel3.setText("Lugar de expedición");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel4.setText("N°id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, 20));

        jLabel5.setText("Primer Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 20));

        jLabel8.setText("Fecha de nacimiento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 20));

        jLabel10.setText("Segundo Apellido");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 20));

        jLabel11.setText("Segundo Nombre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        jLabel12.setText("Primer Nombre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 20));
        getContentPane().add(segundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 130, -1));
        getContentPane().add(primerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, -1));
        getContentPane().add(primerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));
        getContentPane().add(lugarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 90, -1));
        getContentPane().add(parentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 130, -1));
        getContentPane().add(segundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 130, -1));
        getContentPane().add(fNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 130, -1));

        jLabel6.setText("Parentesco");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, 20));
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, -1));

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 30, 20));

        tipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "PA", "CA" }));
        getContentPane().add(tipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel9.setText("Identificacion del Asociado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));
        getContentPane().add(idaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, -1));

        tipoID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "PA", "CA" }));
        getContentPane().add(tipoID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        FamiliarDAO famDao = new FamiliarDAO();
        famReal = famDao.getF();

        famReal.setN_nombre1f(primerNombre.getText());
        famReal.setN_nombre2f(segundoNombre.getText());
        famReal.setN_ap1f(primerApellido.getText());
        famReal.setN_ap2f(segundoApellido.getText());
        famReal.setK_numidf(Integer.parseInt(cedula.getText()));
        famReal.setK_num(Integer.parseInt(idaso.getText()));
        famReal.setO_parentesco(parentesco.getText());
        famReal.setF_ntof(fNaci.getCalendar().get(Calendar.YEAR) + "-" + fNaci.getCalendar().get(Calendar.MONTH) + "-" + fNaci.getCalendar().get(Calendar.DAY_OF_MONTH));
        famReal.setK_tipoidf(tipoID.getItemAt(tipoID.getSelectedIndex()));
        famReal.setK_tipo(tipoID1.getItemAt(tipoID1.getSelectedIndex()));

        famDao.setF(famReal);
        try {
            famDao.incluirFamiliar();
            JOptionPane.showMessageDialog(null, "Se ha creado el familiar");
        } catch (CaException ex) {
            Logger.getLogger(menuFamiliar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Inscripcion invalida, verifique los datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(menuFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuFamiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private com.toedter.calendar.JDateChooser fNaci;
    private javax.swing.JTextField idaso;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lugarExp;
    private javax.swing.JTextField parentesco;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JTextField primerNombre;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JTextField segundoNombre;
    private javax.swing.JComboBox<String> tipoID;
    private javax.swing.JComboBox<String> tipoID1;
    // End of variables declaration//GEN-END:variables
}
