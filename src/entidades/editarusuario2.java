/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import clases.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class editarusuario2 extends javax.swing.JFrame {

    /**
     * Creates new form editarusuario2
     */
    private String nombre, apellido;
    private int dni;
    public void setDatos(String nombre, String apellido, int dni){
        this.nombre = nombre;
        lblNombre.setText(nombre);    
        this.apellido = apellido;
        lblApellido.setText(apellido); 
        this.dni = dni;
        lblDni.setText(dni+""); 
    }
    public editarusuario2() {
        initComponents();
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
        txtCorreoElectronico2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContraeña2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmarContraeña = new javax.swing.JTextField();
        btnRegresar3 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NUEVO USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 27, -1, -1));
        getContentPane().add(txtCorreoElectronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 94, 204, -1));

        jLabel2.setText("Correo Electronico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 74, -1, -1));

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 130, -1, -1));
        getContentPane().add(txtContraeña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 150, 204, -1));

        jLabel4.setText("Confirmar Contraeña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 188, -1, -1));
        getContentPane().add(txtConfirmarContraeña, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 220, 204, -1));

        btnRegresar3.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar3.setText("Regresar");
        btnRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 309, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 309, -1, -1));

        lblNombre.setForeground(new java.awt.Color(91, 35, 172));
        lblNombre.setText("jLabel5");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 267, -1, 24));

        lblApellido.setForeground(new java.awt.Color(104, 37, 189));
        lblApellido.setText("jLabel6");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 272, -1, -1));

        lblDni.setBackground(new java.awt.Color(102, 51, 255));
        lblDni.setForeground(new java.awt.Color(103, 19, 187));
        lblDni.setText("jLabel7");
        getContentPane().add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 272, -1, -1));

        jPanel1.setBackground(new java.awt.Color(101, 21, 187));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = lblNombre.getText();
        String apellido = lblApellido.getText();
        int dni = Integer.parseInt(lblDni.getText());
        String correo = txtCorreoElectronico2.getText();
        String contra = txtContraeña2.getText();
        String confirmContra = txtConfirmarContraeña.getText();
        
        List<Usuario> listatxt = new ArrayList<>();
        Usuario u = new Usuario(nombre, correo, contra, apellido, dni);
        listatxt.add(u);
        
        
        try {
            FileWriter writer = new FileWriter("C:\\Users\\mende\\Desktop\\GH UPN\\TRABAJOUPN\\lista.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
for (Usuario elemento : listatxt) {
   bufferedWriter.write(elemento.getNombre()+"\n");
   bufferedWriter.write(elemento.getApellido()+"\n");
   bufferedWriter.write(elemento.getDni()+"\n");
   bufferedWriter.write(elemento.getCorreoelectronico()+"\n");
   bufferedWriter.write(elemento.getContraseña()+"\n");
    bufferedWriter.write("-----------------------");
   bufferedWriter.newLine();
}
bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(editarusuario2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar3ActionPerformed
        editarusuario1 usuario1 = new editarusuario1();
        usuario1.setVisible(true);
    }//GEN-LAST:event_btnRegresar3ActionPerformed

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
            java.util.logging.Logger.getLogger(editarusuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarusuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarusuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarusuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarusuario2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtConfirmarContraeña;
    private javax.swing.JTextField txtContraeña2;
    private javax.swing.JTextField txtCorreoElectronico2;
    // End of variables declaration//GEN-END:variables
}
