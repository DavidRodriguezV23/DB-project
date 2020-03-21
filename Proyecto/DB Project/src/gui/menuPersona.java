/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.AsociadoDAO;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.Asociado;
import util.CaException;

/**
 *
 * @author PC-Lirol
 */
public class menuPersona extends javax.swing.JFrame {

    Asociado asociReal;

    /**
     * Creates new form menuInscrip
     */
    public menuPersona() {
        super("Crear Asociado");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        inscribir = new javax.swing.JButton();
        segundoNombre = new javax.swing.JTextField();
        primerNombre = new javax.swing.JTextField();
        primerApellido = new javax.swing.JTextField();
        lugarExp = new javax.swing.JTextField();
        sueldo = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        segundoApellido = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        genero = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        barrio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        fNaci = new com.toedter.calendar.JDateChooser();
        tipoID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Crear Asociado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        jLabel2.setText("Genero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, 20));

        jLabel3.setText("Lugar de expedición");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel4.setText("N°ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 20));

        jLabel5.setText("Primer Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        jLabel6.setText("Sueldo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 50, 20));

        jLabel7.setText("Calle");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 20));

        jLabel8.setText("Fecha de nacimiento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        jLabel9.setText("Ciudad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, 20));

        jLabel10.setText("Segundo Apellido");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        jLabel11.setText("Segundo Nombre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 20));

        jLabel12.setText("Primer Nombre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        jButton1.setText("Volver");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        inscribir.setText("Inscribir");
        inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirActionPerformed(evt);
            }
        });
        getContentPane().add(inscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));
        getContentPane().add(segundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 130, -1));
        getContentPane().add(primerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, -1));
        getContentPane().add(primerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));
        getContentPane().add(lugarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, -1));
        getContentPane().add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, -1));
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, -1));
        getContentPane().add(calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 70, -1));
        getContentPane().add(segundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 130, -1));
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 150, -1));

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 90, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 20));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 40, 10));

        jLabel17.setText("Barrio");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));
        getContentPane().add(barrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 60, -1));

        jLabel16.setText("Teléfono");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 20));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, -1));

        jLabel18.setText("Mail");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 50, 20));
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 150, -1));
        getContentPane().add(fNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 130, -1));

        tipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "PA", "CA" }));
        getContentPane().add(tipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirActionPerformed

        AsociadoDAO asociadoDao = new AsociadoDAO();
        //JOptionPane.showMessageDialog(null, fNaci.getDateFormatString());
        asociReal = asociadoDao.getAs();

        asociReal.setN_nombre1(primerNombre.getText());
        asociReal.setN_nombre2(segundoNombre.getText());
        asociReal.setN_ap1(primerApellido.getText());
        asociReal.setN_ap2(segundoApellido.getText());
        asociReal.setK_num((int) Double.parseDouble(cedula.getText()));
        asociReal.setO_num(calle.getText());
        asociReal.setO_tel((int) Double.parseDouble(telefono.getText()));
        asociReal.setO_ciudad(ciudad.getText());
        asociReal.setK_tipo(tipoID.getItemAt(tipoID.getSelectedIndex()));
        asociReal.setO_complemento("Casa");
        if (genero.getSelectedIndex() == 0) {
            asociReal.setI_genero("m");
        } else {
            asociReal.setI_genero("f");
        }
        asociReal.setO_barrio(barrio.getText());
        asociReal.setO_calle(calle.getText());
        asociReal.setV_sueldo(Integer.parseInt(sueldo.getText()));
        asociReal.setO_email(mail.getText());
        asociReal.setF_nto(fNaci.getCalendar().get(Calendar.YEAR)+"-"+fNaci.getCalendar().get(Calendar.MONTH)+"-"+fNaci.getCalendar().get(Calendar.DAY_OF_MONTH));
        //JOptionPane.showMessageDialog(null, fNaci.getCalendar().get(Calendar.YEAR)+"-"+fNaci.getCalendar().get(Calendar.MONTH)+"/"+fNaci.getCalendar().get(Calendar.DAY_OF_MONTH));  //da,fjasdñofiasopifds
        asociadoDao.setAs(asociReal);
        try {
            asociadoDao.incluirAsociado();
            JOptionPane.showMessageDialog(null, "Se ha realizado la inscripcion");
        } catch (CaException ex) {
            JOptionPane.showMessageDialog(null, "Inscripcion invalida, verifique los datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
  
    }//GEN-LAST:event_inscribirActionPerformed

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
            java.util.logging.Logger.getLogger(menuPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barrio;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField ciudad;
    private com.toedter.calendar.JDateChooser fNaci;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton inscribir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lugarExp;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JTextField primerNombre;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JTextField segundoNombre;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipoID;
    // End of variables declaration//GEN-END:variables
}
