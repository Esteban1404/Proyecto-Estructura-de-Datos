/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.ListaSC_Eventos;

/**
 *
 * @author usuario
 */
public class frm_AgregarEvento extends javax.swing.JFrame {
    
    private frm_Principal frameprincipal;

    
    public frm_AgregarEvento() {
        initComponents();
    }
    public frm_Principal getFrameprincipal() {
        return frameprincipal;
    }

    public void setFrameprincipal(frm_Principal frameprincipal) {
        this.frameprincipal = frameprincipal;
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
        lblnombreEvent = new javax.swing.JLabel();
        lblLugarEvent = new javax.swing.JLabel();
        lblFechaEvent = new javax.swing.JLabel();
        lblCiudadEvent = new javax.swing.JLabel();
        lblEstadoEvent = new javax.swing.JLabel();
        txfnombreEvent = new javax.swing.JTextField();
        txfFechaEvent = new javax.swing.JTextField();
        txfLugarEvent = new javax.swing.JTextField();
        txfCiudadEvent = new javax.swing.JTextField();
        txfEstadoEvent = new javax.swing.JTextField();
        bttAgregarEvent = new javax.swing.JButton();
        lblDireccionEvent = new javax.swing.JLabel();
        txfDireccionEvent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Agregar Evento");

        lblnombreEvent.setText("Nombre del Evento:");

        lblLugarEvent.setText("Lugar(Estadio,Teatro,Salon...)");

        lblFechaEvent.setText("Fecha:");

        lblCiudadEvent.setText("Ciudad");

        lblEstadoEvent.setText("Estado(Activo o Inactivo)");

        txfLugarEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLugarEventActionPerformed(evt);
            }
        });

        txfCiudadEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCiudadEventActionPerformed(evt);
            }
        });

        txfEstadoEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEstadoEventActionPerformed(evt);
            }
        });

        bttAgregarEvent.setText("Agregar");
        bttAgregarEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEventActionPerformed(evt);
            }
        });

        lblDireccionEvent.setText("Direccion");

        txfDireccionEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDireccionEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLugarEvent)
                    .addComponent(txfnombreEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bttAgregarEvent)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblnombreEvent)
                                .addComponent(txfLugarEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDireccionEvent)
                                .addComponent(txfDireccionEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfCiudadEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfFechaEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaEvent)
                                .addComponent(lblCiudadEvent)
                                .addComponent(lblEstadoEvent)
                                .addComponent(txfEstadoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEvent)
                    .addComponent(lblFechaEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfnombreEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFechaEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLugarEvent)
                    .addComponent(lblCiudadEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCiudadEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfLugarEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfEstadoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfDireccionEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(bttAgregarEvent)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfLugarEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLugarEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLugarEventActionPerformed

    private void txfCiudadEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCiudadEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCiudadEventActionPerformed

    private void txfEstadoEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEstadoEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEstadoEventActionPerformed

    private void bttAgregarEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarEventActionPerformed
       Evento evento1 = new Evento();
       ListaSC_Eventos l = new ListaSC_Eventos();
       evento1.setNomEvento(txfnombreEvent.getText());
       evento1.setFechaEvento(txfFechaEvent.getText());
       evento1.setLugarEvento(txfLugarEvent.getText());
       evento1.setCiudadEvento(txfCiudadEvent.getText());
       evento1.setDireccionEvento(txfDireccionEvent.getText());
       evento1.setEstadoEvento(txfEstadoEvent.getText());
       l.agregar(evento1);
       this.setVisible(false);
       frameprincipal.setVisible(true);
       
    }//GEN-LAST:event_bttAgregarEventActionPerformed

    private void txfDireccionEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDireccionEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDireccionEventActionPerformed

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
            java.util.logging.Logger.getLogger(frm_AgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_AgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_AgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_AgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_AgregarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCiudadEvent;
    private javax.swing.JLabel lblDireccionEvent;
    private javax.swing.JLabel lblEstadoEvent;
    private javax.swing.JLabel lblFechaEvent;
    private javax.swing.JLabel lblLugarEvent;
    private javax.swing.JLabel lblnombreEvent;
    private javax.swing.JTextField txfCiudadEvent;
    private javax.swing.JTextField txfDireccionEvent;
    private javax.swing.JTextField txfEstadoEvent;
    private javax.swing.JTextField txfFechaEvent;
    private javax.swing.JTextField txfLugarEvent;
    private javax.swing.JTextField txfnombreEvent;
    // End of variables declaration//GEN-END:variables
}
