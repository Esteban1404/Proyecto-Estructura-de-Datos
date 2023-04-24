package Venta;

import Catalogo_De_Asientos.Asiento;
import Catalogo_de_Eventos.Evento;
import Catalogo_de_Eventos.NodoEvent;
import Datos_Login.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class MetodoVenta {

    private NodoVenta raiz;
    private String ruta;
    private String nombreArchivo;
    
    private  String evento;
    private String asiento;
    private int pago;
    private String Usuario;
    

    public MetodoVenta() {
        this.raiz = null;

        this.ruta = "";
        this.nombreArchivo = "Ventas.txt";
        
        this.evento="";
        this.asiento="";
        this.Usuario="";
        this.pago=0;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
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

    public void insertarRaiz(String fecha,String hora) {
        
        extraerUsuario();
        extraerEvento();
        
        Venta v = new Venta();       
        v.setUsuario(this.Usuario);
        v.setvEvento(this.evento);
        v.setPago(this.pago);
        v.setvAsiento(this.asiento);
        v.setFechaVenta(fecha);
        v.setHoraVenta(hora);
        
        NodoVenta nuevo = new NodoVenta();
        
        nuevo.setElemento(v);
        if (esVacio()) {
            raiz = nuevo;
        } else {
            insertarNuevo(raiz, nuevo);
        }
    }

    public void insertarNuevo(NodoVenta raiz, NodoVenta nuevo) {
        if (nuevo.getElemento().getPago()
                <= raiz.getElemento().getPago()) {
            if (raiz.getEnlaceIzq() == null) {
                raiz.setEnlaceIzq(nuevo);
            } else {
                insertarNuevo(raiz.getEnlaceIzq(), nuevo);
            }
        } else {
            if (raiz.getEnlaceDer() == null) {
                raiz.setEnlaceDer(nuevo);
            } else {
                insertarNuevo(raiz.getEnlaceDer(), nuevo);
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
                    getPago() + "..");
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

                bw.write(aux.getElemento().getUsuario() + "," + aux.getElemento().getFechaVenta() + "," + aux.getElemento().getHoraVenta() + ","
                        + aux.getElemento().getvEvento() + "," + aux.getElemento().getvAsiento() + "," + aux.getElemento().getPago());

                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
                //lo agregamos al final del archivo sin borrar los datos
                while (aux != raiz) {

                    bw.write(aux.getElemento().getUsuario() + "," + aux.getElemento().getFechaVenta() + "," + aux.getElemento().getHoraVenta() + ","
                            + aux.getElemento().getvEvento() + "," + aux.getElemento().getvAsiento() + "," + aux.getElemento().getPago());
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

   

    public void extraerAsiento(String numAsiento) {
        
         try {

           

            String registro;

            File file = new File(this.ruta + "Asientos.txt");

           

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Asiento d = new Asiento();
                StringTokenizer st = new StringTokenizer(registro, ",");

                d.setCodigoArea(st.nextToken());
                d.setNumeroAsiento(st.nextToken());
                d.setCostoVenta(Integer.parseInt(st.nextToken()));
                d.setEstado(st.nextToken());

                if (d.getNumeroAsiento().equals(numAsiento)) {
                    
                    this.asiento=d.getNumeroAsiento();
                    this.pago=d.getCostoVenta();
                    
                }
            }
            br.close();

           

        } catch (IOException error) {

            error.printStackTrace();
            
        }
        
        

    }

    public void extraerEvento() {

        try {

            

            String registro;

            File file = new File(this.ruta + "EventoActual.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Evento d = new Evento();
                StringTokenizer st = new StringTokenizer(registro, ",");

               String evento=st.nextToken();

                

                    this.evento=evento;

                
            }

            br.close();

        } catch (IOException error) {

            error.printStackTrace();

        }
    }
        
    
    public void extraerUsuario(){
    
     try {

            String registro;

        
            File file = new File(this.ruta + "UsuarioActual.txt");


            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                
               
                StringTokenizer st = new StringTokenizer(registro, ",");

                
                String nombre=st.nextToken();
                                                  
                    this.Usuario=nombre;
                    
                
            }
            br.close();


        } catch (IOException error) {

            error.printStackTrace();
          
        }
    
        
        
    }
        
    
   public ArrayList listarVentas() {

        try {

            String registro;

            //Declaro una estructura de información de personas
            ArrayList<Venta> listaVenta = new ArrayList<Venta>();

            File file = new File(this.ruta + "Ventas.txt");

            if (!file.exists()) {
                file.createNewFile();
                return null;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

               Venta d = new Venta();
                
               StringTokenizer st = new StringTokenizer(registro, ",");

                d.setUsuario(st.nextToken());               
                d.setFechaVenta(st.nextToken());
                d.setHoraVenta(st.nextToken());
                d.setvEvento(st.nextToken());
                d.setvAsiento(st.nextToken());
                d.setPago(Integer.parseInt(st.nextToken()));
                
                
                listaVenta.add(d);

            }

            br.close();

            return listaVenta;

        } catch (Exception error) {

            error.printStackTrace();
            return null;
        }

    
   }
}

