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
public class Loggin extends javax.swing.JFrame {
    
    Controlador controlador;
    /**
     * Creates new form Loggin
     */
    public Loggin( Controlador controlador) {
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

        jPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelMarca = new javax.swing.JLabel();
        jLabelMarca2 = new javax.swing.JLabel();
        btnAdministrador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEmpleado = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        jPassword.setBackground(new java.awt.Color(153, 153, 255));
        jPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(3);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDOS AL SISTEMA INTEGRADO DE:");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/imagenes/Logo Hosteria.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 2));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 280, 100));

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Hosteria Laguacoto y todos sus derivados son marcas y nombres registrados por NblCompany.    ");
        getContentPane().add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, 30));

        jLabelMarca2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelMarca2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca2.setText("Todos los derechos reservados. Cayambe 2022.    ");
        getContentPane().add(jLabelMarca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, 30));

        btnAdministrador.setBackground(new java.awt.Color(0, 51, 0));
        btnAdministrador.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 120, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESAR COMO:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, 40));

        btnEmpleado.setBackground(new java.awt.Color(0, 51, 0));
        btnEmpleado.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setText("EMPLEADO");
        btnEmpleado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, 30));

        btnInvitado.setBackground(new java.awt.Color(0, 51, 0));
        btnInvitado.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitado.setText("INVITADO");
        btnInvitado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 120, 30));

        btnSalir.setBackground(new java.awt.Color(0, 51, 0));
        btnSalir.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 130, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/imagenes/Cayambe Gif.gif"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
      controlador.showAdministrador();
      controlador.closeLoggin();
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
      controlador.showEmpleado();  
      controlador.closeLoggin();
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
      controlador.showInvitado(); 
      controlador.closeLoggin();
    }//GEN-LAST:event_btnInvitadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      controlador.closeLoggin(); 
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMarca2;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
