package Venta;

import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.NodoEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class MetodoVenta {
    private NodoVenta raiz;
    private String ruta;
    private String nombreArchivo;

    public MetodoVenta() {
        this.raiz=null;
        this.ruta = "";
        this.nombreArchivo = "Eventos.txt";
    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public boolean esVacio() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertarRaiz(Venta v){
      NodoVenta nuevo=new NodoVenta();
      nuevo.setElemento(v);
      if(esVacio()){
         raiz=nuevo;
      }else{
         insertarNuevo(raiz,nuevo);
      }
   }
   public void insertarNuevo(NodoVenta raiz,NodoVenta nuevo){
      if(nuevo.getElemento().getPago()<=
              raiz.getElemento().getPago()){
         if(raiz.getEnlaceIzq()==null){
            raiz.setEnlaceIzq(nuevo);
         }else{
            insertarNuevo(raiz.getEnlaceIzq(),nuevo);
         }
      }else{
         if(raiz.getEnlaceDer()==null){
            raiz.setEnlaceDer(nuevo);
         }else{
            insertarNuevo(raiz.getEnlaceDer(),nuevo);
         }
      }
   }
    public void inOrden() {
        if (!esVacio()) {
            inOrdenR(raiz);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se puede mostrar, árbol vacío!");
        }
    }

    public void inOrdenR(NodoVenta r) {
        if (r != null) {
            inOrdenR(r.getEnlaceIzq());
            System.out.print(r.getElemento().
                    getPago()+ "..");
            inOrdenR(r.getEnlaceDer());
        }
    }
    public void guardarTxt() {

        if (!esVacio()) {

            try {
                File archivo = new File(this.ruta + this.nombreArchivo);

                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                NodoVenta aux = raiz;

                bw.write(aux.getElemento().getUsuario() + "," + aux.getElemento().getFechaVenta() + "," + aux.getElemento().getHoraVenta()+ ","
                        + aux.getElemento().getvEvento()+ "," + aux.getElemento().getvAsiento()+ "," + aux.getElemento().getPago());

                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
                //lo agregamos al final del archivo sin borrar los datos
                while (aux != raiz) {

                    bw.write(aux.getElemento().getUsuario() + "," + aux.getElemento().getFechaVenta() + "," + aux.getElemento().getHoraVenta()+ ","
                        + aux.getElemento().getvEvento()+ "," + aux.getElemento().getvAsiento()+ "," + aux.getElemento().getPago());
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
    
    public ArrayList listarEventos() {

        try {

            String registro;

            //Declaro una estructura de información de personas
            ArrayList<Venta> listaVenta = new ArrayList<Venta>();

            File file = new File(this.ruta + this.nombreArchivo);

            if (!file.exists()) {
                file.createNewFile();
                return null;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Venta v = new Venta();
                StringTokenizer st = new StringTokenizer(registro, ",");

                v.setUsuario(st.nextToken());
                v.setFechaVenta(st.nextToken());
                v.setHoraVenta(st.nextToken());
                v.setvEvento(st.nextToken());
                v.setvAsiento(st.nextToken());
                v.setPago(Double.parseDouble(st.nextToken()));

                listaVenta.add(v);

            }

            br.close();

            return listaVenta;

        } catch (Exception error) {

            error.printStackTrace();
            return null;
        }

    }
    
    
}

