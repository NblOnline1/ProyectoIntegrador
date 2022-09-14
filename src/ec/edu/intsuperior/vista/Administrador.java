/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;

/**
 *
 * @author Nbl
 */
public class Administrador extends javax.swing.JFrame {

    Controlador controlador;
    /**
     * Creates new form Administrador
     */
    public Administrador(Controlador controlador) {
        this.controlador=controlador;
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

        Usuario = new javax.swing.JLabel();
        ingresodato = new javax.swing.JTextField();
        ingreso = new javax.swing.JButton();
        Usuario1 = new javax.swing.JLabel();
        Usuario2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        ingreso1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("INICIAR SESION COMO ADMINISTRADOR");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));
        getContentPane().add(ingresodato, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, -1));

        ingreso.setBackground(new java.awt.Color(0, 0, 153));
        ingreso.setForeground(new java.awt.Color(255, 255, 255));
        ingreso.setText("REGRESAR");
        ingreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });
        getContentPane().add(ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 100, 30));

        Usuario1.setBackground(new java.awt.Color(0, 0, 51));
        Usuario1.setForeground(new java.awt.Color(255, 255, 255));
        Usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario1.setText("USUARIO:");
        Usuario1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario1.setOpaque(true);
        getContentPane().add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 90, 30));

        Usuario2.setBackground(new java.awt.Color(0, 0, 51));
        Usuario2.setForeground(new java.awt.Color(255, 255, 255));
        Usuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario2.setText("CONTRASEÑA:");
        Usuario2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario2.setOpaque(true);
        getContentPane().add(Usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, 30));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 190, -1));

        ingreso1.setBackground(new java.awt.Color(0, 0, 153));
        ingreso1.setForeground(new java.awt.Color(255, 255, 255));
        ingreso1.setText("INGRESO");
        ingreso1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso1ActionPerformed(evt);
            }
        });
        getContentPane().add(ingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 100, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/imagenes/fondo administrador.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
       
    }//GEN-LAST:event_ingresoActionPerformed

    private void ingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso1ActionPerformed
        InterfazAdministrador IA= new InterfazAdministrador();
        IA.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ingreso1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Administrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JLabel Usuario2;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingreso;
    private javax.swing.JButton ingreso1;
    private javax.swing.JTextField ingresodato;
    // End of variables declaration//GEN-END:variables
}
