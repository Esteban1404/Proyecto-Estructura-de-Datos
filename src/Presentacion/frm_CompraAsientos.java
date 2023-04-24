
package Presentacion;

import Catalogo_De_Asientos.Asiento;
import Catalogo_De_Asientos.MetodosAsientos;
import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.MetodosEventos;
import Venta.MetodoVenta;
import Venta.Venta;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frm_CompraAsientos extends javax.swing.JFrame {
    static int precio;
    public frm_CompraAsientos() {
        initComponents();
        lblPrecio.setVisible(false);
        llenarCbxAsientos();
        llenarCbxEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txfNombreCliente = new javax.swing.JTextField();
        txfFecha = new javax.swing.JTextField();
        txfHora = new javax.swing.JTextField();
        lblEvento = new javax.swing.JLabel();
        cbxEventos = new javax.swing.JComboBox<>();
        lblEvento1 = new javax.swing.JLabel();
        cbxAsientos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Compra de Asientos");

        jLabel2.setText("Nombre Cliente:");

        lblFecha.setText("Fecha");

        lblHora.setText("Hora");

        txfNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreClienteActionPerformed(evt);
            }
        });

        txfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFechaActionPerformed(evt);
            }
        });

        txfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHoraActionPerformed(evt);
            }
        });

        lblEvento.setText("Evento");

        lblEvento1.setText("Asiento");

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPrecio.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(txfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHora))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEvento1)
                    .addComponent(cbxAsientos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEvento)
                    .addComponent(cbxEventos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEvento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecha)
                            .addComponent(lblHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClienteActionPerformed

    private void txfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFechaActionPerformed

    private void txfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHoraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Venta v= new Venta();
        String nomEvent = (String) cbxEventos.getSelectedItem();
        String Asiento = (String) cbxAsientos.getSelectedItem();
        v.setvEvento(nomEvent);
        v.setvAsiento(Asiento);
        v.setUsuario(txfNombreCliente.getText());
        v.setFechaVenta(txfFecha.getText());
        v.setHoraVenta(txfHora.getText());
        RetornarPrecio();
        v.setPago(precio);
        MetodoVenta mv = new MetodoVenta();
        if (!(txfNombreCliente.getText().isEmpty() && txfFecha.getText().isEmpty()&&txfHora.getText().isEmpty())) {
            mv.insertarRaiz(v);
            mv.guardarTxt();
            limpiaCajasDeTexto();
            JOptionPane.showMessageDialog(null,"Se ha registrado la compra correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Digite los datos del evento correctamente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void llenarCbxEventos(){
        MetodosEventos d = new MetodosEventos();
        ArrayList<Evento> listaEventos = new ArrayList<Evento>();
        listaEventos = d.listarEventos(); 
       if (listaEventos!=null){
            for (int i=0;i<listaEventos.size();i++){
                cbxEventos.addItem(listaEventos.get(i).getCiudadEvento());
            }
       }else{
           JOptionPane.showMessageDialog(null,"No existen Eventos  en la base de datos");
       }
    }
    
    public void llenarCbxAsientos(){
        MetodosAsientos d = new MetodosAsientos();
        ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();
        listaAsientos = d.mostrarAsientos();
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd"); 
       if (listaAsientos!=null){
            for (int i=0;i<listaAsientos.size();i++){
                cbxAsientos.addItem(listaAsientos.get(i).getNumeroAsiento());
            }
       }else{
           JOptionPane.showMessageDialog(null,"No existen Eventos  en la base de datos");
       }
    }
    public void limpiaCajasDeTexto() {
        this.txfNombreCliente.setText("");
        this.txfFecha.setText("");
        this.txfHora.setText("");
    }
    public void RetornarPrecio(){
        MetodosAsientos d = new MetodosAsientos();
        ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();
        listaAsientos = d.mostrarAsientos();
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String Asiento = (String) cbxAsientos.getSelectedItem();
        if (listaAsientos != null) {
            for (int i = 0; i < listaAsientos.size(); i++) {
                if (Asiento.equals(listaAsientos.get(i).getNumeroAsiento())) {
                    if(listaAsientos.get(i).getCostoVenta() == 1500){
                        precio = 1500;
                        lblPrecio.setText("Precio" + precio);
                    }else if(listaAsientos.get(i).getCostoVenta() == 3000){
                        precio =  3000;
                        lblPrecio.setText("Precio" + precio);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen Eventos  en la base de datos");
        }
    }
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
            java.util.logging.Logger.getLogger(frm_CompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_CompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_CompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_CompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_CompraAsientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAsientos;
    private javax.swing.JComboBox<String> cbxEventos;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblEvento1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txfFecha;
    private javax.swing.JTextField txfHora;
    private javax.swing.JTextField txfNombreCliente;
    // End of variables declaration//GEN-END:variables
}
