/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Catalogo_de_Eventos.MetodosEventos;
import Datos_Login.NodoUsuario;
import Gestion.MetodoUsuarios;
import Venta.MetodoVenta;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class InicioSesion extends javax.swing.JFrame {
    private MetodosEventos l;
    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        
    }

    public InicioSesion(MetodosEventos l) {
        this.l = l;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        txt_usuario = new java.awt.TextField();
        label2 = new java.awt.Label();
        btn_Ingresar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        txt_contra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 255, 255));
        label1.setText("Usuario");

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        label2.setBackground(new java.awt.Color(0, 0, 0));
        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 255, 255));
        label2.setText("Contraseña");

        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });

        btn_Registrar.setText("Registrarse");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txt_contra))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btn_Registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Ingresar)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

        frm_AgregarUsuarios agregar = new frm_AgregarUsuarios();
        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);


    }//GEN-LAST:event_btn_RegistrarActionPerformed

     
    
    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed

        String usuario = txt_usuario.getText();
//        String contra = txt_contra.getText();
        char[] arrayC = txt_contra.getPassword();
        String contra = new String(arrayC);
       
        MetodoUsuarios validar =new MetodoUsuarios();
        MetodoVenta v = new MetodoVenta();
        
        
        if(validar.validarUsuario(usuario, contra)){
        
            
            frm_Principal mostrar = new frm_Principal();
            mostrar.setVisible(true);
            mostrar.setLocationRelativeTo(null);
            
        
        
        }else{
        
            JOptionPane.showMessageDialog(null,"No encontrado");
        
        }

    }//GEN-LAST:event_btn_IngresarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Registrar;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPasswordField txt_contra;
    private java.awt.TextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
