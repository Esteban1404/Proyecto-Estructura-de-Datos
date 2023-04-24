package Presentacion;

import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.MetodosEventos;
import Catalogo_de_Eventos.NodoEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Bossaik
 */
public class frm_EditarEvento extends javax.swing.JFrame {

    private MetodosEventos lE;
    private frm_Principal frameprincipal;

    public frm_Principal getFrameprincipal() {
        return frameprincipal;
    }

    public void setFrameprincipal(frm_Principal frameprincipal) {
        this.frameprincipal = frameprincipal;
    }

    public frm_EditarEvento() {
        initComponents();
        this.ruta = "";
        this.nombreArchivo = "Eventos.Txt";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        lblnombreEvent = new javax.swing.JLabel();
        lblLugarEvent = new javax.swing.JLabel();
        lblFechaEvent = new javax.swing.JLabel();
        lblCiudadEvent = new javax.swing.JLabel();
        lblEstadoEvent = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        fecha_txt = new javax.swing.JTextField();
        lugar_txt = new javax.swing.JTextField();
        ciudad_txt = new javax.swing.JTextField();
        bttAgregarEvent = new javax.swing.JButton();
        estado_txt = new javax.swing.JComboBox<>();
        nombre_txt = new javax.swing.JTextField();
        lblnombreEvent1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblnombreEvent2 = new javax.swing.JLabel();
        id_txt1 = new javax.swing.JTextField();
        lblnombreEvent3 = new javax.swing.JLabel();
        nombre_txt1 = new javax.swing.JTextField();
        lblLugarEvent1 = new javax.swing.JLabel();
        lugar_txt1 = new javax.swing.JTextField();
        lblFechaEvent1 = new javax.swing.JLabel();
        lblCiudadEvent1 = new javax.swing.JLabel();
        ciudad_txt1 = new javax.swing.JTextField();
        lblEstadoEvent1 = new javax.swing.JLabel();
        estado_txt1 = new javax.swing.JComboBox<>();
        bttAgregarEvent1 = new javax.swing.JButton();
        fecha_txt2 = new javax.swing.JTextField();
        bttAgregarEvent2 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Agregar Evento");

        lblnombreEvent.setText("Nombre del Evento:");

        lblLugarEvent.setText("Lugar(Estadio,Teatro,Salon...)");

        lblFechaEvent.setText("Fecha:");

        lblCiudadEvent.setText("Ciudad");

        lblEstadoEvent.setText("Estado(Activo o Inactivo)");

        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        lugar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_txtActionPerformed(evt);
            }
        });

        ciudad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudad_txtActionPerformed(evt);
            }
        });

        bttAgregarEvent.setText("Agregar");
        bttAgregarEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEventActionPerformed(evt);
            }
        });

        estado_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        nombre_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_txtActionPerformed(evt);
            }
        });

        lblnombreEvent1.setText("Id del Evento");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addComponent(lugar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addComponent(lblLugarEvent)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEstadoEvent))
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bttAgregarEvent)
                                        .addGroup(jFrame1Layout.createSequentialGroup()
                                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jFrame1Layout.createSequentialGroup()
                                                    .addComponent(lblnombreEvent)
                                                    .addGap(86, 86, 86))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(nombre_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblnombreEvent1, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ciudad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fecha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblFechaEvent)
                                                .addComponent(lblCiudadEvent)))))))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(lblFechaEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombreEvent1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudadEvent)
                    .addComponent(lblnombreEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLugarEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lugar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(bttAgregarEvent)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Editar Evento");

        lblnombreEvent2.setText("Id del Evento");

        id_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txt1ActionPerformed(evt);
            }
        });

        lblnombreEvent3.setText("Nombre del Evento:");

        nombre_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_txt1ActionPerformed(evt);
            }
        });

        lblLugarEvent1.setText("Lugar(Estadio,Teatro,Salon...)");

        lugar_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_txt1ActionPerformed(evt);
            }
        });

        lblFechaEvent1.setText("Fecha:");

        lblCiudadEvent1.setText("Ciudad");

        ciudad_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudad_txt1ActionPerformed(evt);
            }
        });

        lblEstadoEvent1.setText("Estado(Activo o Inactivo)");

        estado_txt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        bttAgregarEvent1.setText("Editar Evento");
        bttAgregarEvent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEvent1ActionPerformed(evt);
            }
        });

        bttAgregarEvent2.setText("Salir");
        bttAgregarEvent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEvent2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(48, 344, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombreEvent2)
                    .addComponent(lblnombreEvent3)
                    .addComponent(id_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLugarEvent1)
                    .addComponent(lugar_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaEvent1)
                    .addComponent(lblCiudadEvent1)
                    .addComponent(ciudad_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoEvent1)
                    .addComponent(estado_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(bttAgregarEvent2)
                .addGap(124, 124, 124)
                .addComponent(bttAgregarEvent1)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEvent1)
                    .addComponent(lblnombreEvent2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEvent3)
                    .addComponent(lblCiudadEvent1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEvent1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLugarEvent1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lugar_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregarEvent1)
                    .addComponent(bttAgregarEvent2))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void lugar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_txtActionPerformed

    private void ciudad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudad_txtActionPerformed

    private void bttAgregarEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarEventActionPerformed


    }//GEN-LAST:event_bttAgregarEventActionPerformed

    private void nombre_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_txtActionPerformed

    private void id_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txt1ActionPerformed

    private void nombre_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_txt1ActionPerformed

    private void lugar_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_txt1ActionPerformed

    private void ciudad_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudad_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudad_txt1ActionPerformed

    private void bttAgregarEvent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarEvent1ActionPerformed

        if ((!nombre_txt.getText().isEmpty()) && (!lugar_txt.getText().isEmpty())
                && (!ciudad_txt.getText().isEmpty()) && (!fecha_txt.getText().isEmpty())) {

            String id = id_txt1.getText();
            String nombre = nombre_txt1.getText();
            String lugar = lugar_txt1.getText();
            String ciudad = ciudad_txt1.getText();
            String fecha = fecha_txt2.getText();
            String estado = (String) estado_txt1.getSelectedItem();

            MetodosEventos a = new MetodosEventos();

            a.editarEvento(id, ciudad, fecha, lugar, nombre, estado);

            limpiaCajasDeTexto();
        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar Todos los campos");

        }
    }//GEN-LAST:event_bttAgregarEvent1ActionPerformed

    private void bttAgregarEvent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarEvent2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttAgregarEvent2ActionPerformed

    public void limpiaCajasDeTexto() {

        this.id_txt.setText("");
        this.nombre_txt.setText("");
        this.lugar_txt.setText("");
        this.fecha_txt.setText("");

    }

    private String ruta;
    private String nombreArchivo;

    public boolean verificarDisponibilidad(String Lugar, String Fecha) {

        try {

            boolean validado = false;

            String registro;

            File file = new File(this.ruta + this.nombreArchivo);

            if (!file.exists()) {
                file.createNewFile();
                return false;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Evento d = new Evento();
                StringTokenizer st = new StringTokenizer(registro, ",");

                d.setId(Integer.parseInt(st.nextToken()));
                d.setNombreEvento(st.nextToken());
                d.setCiudadEvento(st.nextToken());
                d.setLugarEvento(st.nextToken());
                d.setFechaEvento(st.nextToken());

                d.setEstadoEvento(st.nextToken());

                if (d.getLugarEvento().equals(Lugar) && d.getFechaEvento().equals(Fecha)) {
                    validado = true;

                }
            }
            br.close();

            return validado;

        } catch (IOException error) {

            error.printStackTrace();
            return false;
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
            java.util.logging.Logger.getLogger(frm_EditarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_EditarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_EditarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_EditarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_EditarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarEvent;
    private javax.swing.JButton bttAgregarEvent1;
    private javax.swing.JButton bttAgregarEvent2;
    private javax.swing.JTextField ciudad_txt;
    private javax.swing.JTextField ciudad_txt1;
    private javax.swing.JComboBox<String> estado_txt;
    private javax.swing.JComboBox<String> estado_txt1;
    private javax.swing.JTextField fecha_txt;
    private javax.swing.JTextField fecha_txt2;
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField id_txt1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCiudadEvent;
    private javax.swing.JLabel lblCiudadEvent1;
    private javax.swing.JLabel lblEstadoEvent;
    private javax.swing.JLabel lblEstadoEvent1;
    private javax.swing.JLabel lblFechaEvent;
    private javax.swing.JLabel lblFechaEvent1;
    private javax.swing.JLabel lblLugarEvent;
    private javax.swing.JLabel lblLugarEvent1;
    private javax.swing.JLabel lblnombreEvent;
    private javax.swing.JLabel lblnombreEvent1;
    private javax.swing.JLabel lblnombreEvent2;
    private javax.swing.JLabel lblnombreEvent3;
    private javax.swing.JTextField lugar_txt;
    private javax.swing.JTextField lugar_txt1;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JTextField nombre_txt1;
    // End of variables declaration//GEN-END:variables

}
