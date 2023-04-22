package Presentacion;

import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.MetodosEventos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class frm_VisualizarEvento extends javax.swing.JFrame {
    private frm_Principal frameprincipal;

    public frm_VisualizarEvento() {
        initComponents();
        tabla();
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

        btthechoVisualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_event = new javax.swing.JTable();
        btthechoVisualizar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        idEvento = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btthechoVisualizar.setText("Salir");
        btthechoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthechoVisualizarActionPerformed(evt);
            }
        });

        tbl_event.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Ciudad", "Lugar", "Fecha", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tbl_event);

        btthechoVisualizar1.setText("Reservar Asiento");
        btthechoVisualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthechoVisualizar1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(idEvento);

        jLabel1.setText("Evento a Reservar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btthechoVisualizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btthechoVisualizar)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthechoVisualizar)
                    .addComponent(btthechoVisualizar1))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btthechoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthechoVisualizarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btthechoVisualizarActionPerformed

    private void btthechoVisualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthechoVisualizar1ActionPerformed
       frm_VerAsientos d = new frm_VerAsientos();
       d.setVisible(true);
       d.setLocationRelativeTo(null);
    }//GEN-LAST:event_btthechoVisualizar1ActionPerformed

    private void tabla(){
        MetodosEventos d = new MetodosEventos();
        
        ArrayList<Evento> listaEventos = new ArrayList<Evento>();
        
        listaEventos = d.listarEventos();
        
         DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        //Para poblar o llenar una tabla con datos y manipularla por código siempre tendremos que crear un objeto de tipo  DefaultTableModel
        
       DefaultTableModel modelo = (DefaultTableModel) tbl_event.getModel();
       
       //Creo un vector que va a permitir ir sacando línea por línea del array list
       Object lineaDeInformacion[] = new Object [6];
       
       if (listaEventos!=null){
       
            for (int i=0;i<listaEventos.size();i++){
                
                

                lineaDeInformacion[0] = listaEventos.get(i).getId();
                lineaDeInformacion[1] = listaEventos.get(i).getCiudadEvento();
                lineaDeInformacion[2] = listaEventos.get(i).getFechaEvento();
                lineaDeInformacion[3] = listaEventos.get(i).getLugarEvento();
                lineaDeInformacion[4] = listaEventos.get(i).getNombreEvento();
                lineaDeInformacion[5] = listaEventos.get(i).getEstadoEvento();

                modelo.addRow(lineaDeInformacion);

            }
       }else{
           
           JOptionPane.showMessageDialog(null,"No existen Eventos  en la base de datos");
           
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
            java.util.logging.Logger.getLogger(frm_VisualizarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_VisualizarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_VisualizarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_VisualizarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_VisualizarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btthechoVisualizar;
    private javax.swing.JButton btthechoVisualizar1;
    private javax.swing.JTextPane idEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_event;
    // End of variables declaration//GEN-END:variables
}
