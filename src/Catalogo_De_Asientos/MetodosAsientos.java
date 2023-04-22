package Catalogo_De_Asientos;

import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.NodoEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class MetodosAsientos {

    private NodoAsiento cima;

    private String ruta;
    private String nombreArchivo;

    public MetodosAsientos() {
        this.cima = null;

        this.ruta = "";
        this.nombreArchivo = "Asientos.txt";

    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(String codArea, String numAsiento, int costo, String estado) {

        
        Asiento a = new Asiento();
        
        a.setCodigoArea(codArea);
        a.setNumeroAsiento(numAsiento);
        a.setCostoVenta(costo);
        a.setEstado(estado);

        NodoAsiento nuevo = new NodoAsiento();
        nuevo.setDato(a);

        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public ArrayList mostrarAsientos() {

        try {

            String registro;

            //Declaro una estructura de información de personas
            ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();

            File file = new File(this.ruta + this.nombreArchivo);

            if (!file.exists()) {
                file.createNewFile();
                return null;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Asiento d = new Asiento();
                StringTokenizer st = new StringTokenizer(registro, ",");

                d.setCodigoArea(st.nextToken());
                d.setNumeroAsiento(st.nextToken());
                d.setCostoVenta(Integer.parseInt(st.nextToken()));
                d.setEstado(st.nextToken());

                listaAsientos.add(d);

            }

            br.close();

            return listaAsientos;

        } catch (Exception error) {

            error.printStackTrace();
            return null;
        }

    }

    public boolean validarAsiento(String numAsiento) {

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

                Asiento d = new Asiento();
                StringTokenizer st = new StringTokenizer(registro, ",");

                d.setCodigoArea(st.nextToken());
                d.setNumeroAsiento(st.nextToken());
                d.setCostoVenta(Integer.parseInt(st.nextToken()));
                d.setEstado(ruta);

                if (d.getNumeroAsiento().equals(numAsiento) && d.getEstado().equals("OCU")) {
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

    public void editarAsiento(String nuevoCodigo, String nuevoAsiento, int nuevoPrecio, String nuevoEstado) {

        try {
            String registro, registro2;
            String codigoArea, numAsiento, estado;
            int precio;

            File db = new File(this.ruta + this.nombreArchivo);
            File tempDB = new File(this.ruta + "AsientosTemporal.txt");

            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            String informacion = "";

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");

                codigoArea = (st.nextToken());
                numAsiento = st.nextToken();
                precio = Integer.parseInt(st.nextToken());
                estado = st.nextToken();

                if (numAsiento.contains(nuevoAsiento)) {
                    informacion = "A continuación se muestran los datos del Asiento a modificar:\n"
                            + "(Codigo de Area, Numero de Asiento, Precio, Estado)\n\n"
                            + codigoArea + " " + numAsiento + " " + precio + " " + estado;
                    JOptionPane.showMessageDialog(null, informacion);
                }else{
                
                    JOptionPane.showMessageDialog(null,"No existe numero de Asiento");
                    
                
                }

            }

            br.close();

            if (informacion.length() != 0) {

                BufferedReader br2 = new BufferedReader(new FileReader(db));

                while ((registro2 = br2.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(registro2, ",");
                    codigoArea = (st.nextToken());
                    numAsiento = st.nextToken();
                    precio = Integer.parseInt(st.nextToken());
                    estado = st.nextToken();

                    if (numAsiento.contains(nuevoAsiento)) {
                        bw.write(nuevoCodigo + "," + nuevoAsiento + "," + nuevoPrecio + "," + nuevoEstado                    );
                        System.out.println("modifico usuario");
                    } else {
                        bw.write(registro2);
                    }
                    bw.flush();
                    bw.newLine();

                }
                bw.close();
                br2.close();
                db.delete();
                tempDB.renameTo(db);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        char respuesta = JOptionPane.showInputDialog(null, "Desea Agregar otro(s/n)? :").toLowerCase().charAt(0);

        if (respuesta == 's') {

            editarAsiento(nuevoCodigo, nuevoAsiento, nuevoPrecio, nuevoEstado);
        }
    }

    public void guardarTxt() {

        if (!esVacia()) {

            try {
                File archivo = new File(this.ruta + this.nombreArchivo);

                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                NodoAsiento aux = cima;

                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
                //lo agregamos al final del archivo sin borrar los datos
                while (aux != null) {

                    bw.write(aux.getDato().getCodigoArea() + "," + aux.getDato().getNumeroAsiento() + "," + aux.getDato().getCostoVenta()+","+aux.getDato().getEstado());
                    aux=aux.getSiguiente();
                }

                //Agrega la información de la persona en una línea nueva al final del archivo
                bw.flush();
                bw.newLine();
                bw.close();

                //JOptionPane.showMessageDialog(null,"Persona ingresada correctamente en la base de datos!!!!");
            } catch (Exception error) {
                error.printStackTrace();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Vacia");

        }

    }

}
