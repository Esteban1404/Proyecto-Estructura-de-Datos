package Gestion;

import Datos_Login.*; //ASI SE IMPORTA UN PAQUETE
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class MetodoUsuarios {

    private NodoUsuario inicio;  //Vamos a usar una COLA 
    private NodoUsuario fin;
    
 

    private String ruta;
    private String nombreArchivo;

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


    
    
    

    public MetodoUsuarios() {

        this.inicio = null;
        this.fin = null;

        this.ruta = "";
        this.nombreArchivo = "Usuarios.txt";
        

    }

    public boolean esVacia() {

        if (inicio == null) {        //Metodo para saber si la estructura esta vacia o no
            return true;
        } else {
            return false;
        }

    }
    
    

    
    //Agregamos los usuarios a la cola
    public void agregarUsuarios(String nombre, String apellidos, String usuario, String contra) {
        
        Usuario d = new Usuario();
        
       

        d.setNombre(nombre);
        d.setApellidos(apellidos);
        d.setUsuario(usuario);
        d.setContraseña(contra);
        
      
        

        
        
        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setElemento(d);

        if (esVacia()) {

            inicio = nuevo;
            fin = nuevo;
            JOptionPane.showMessageDialog(null, "AGREGADO");

        } else {

            fin.setSiguiente(nuevo);
            fin = nuevo;
            JOptionPane.showMessageDialog(null, " AGREGADO");

        }
        
        

    }

    
   //Recorremos la cola y guardamos en archivo TXT
    public void guardarTxt() {
        
        if(!esVacia()){
            
            NodoUsuario aux = inicio;

       
            try {

            File archivo = new File(this.ruta + this.nombreArchivo);

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
            //lo agregamos al final del archivo sin borrar los datos
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            while(aux != null){
            
                bw.write(aux.getElemento().getNombre()+","+aux.getElemento().getApellidos()+","+aux.getElemento().getUsuario()+","+aux.getElemento().getContraseña());
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
        
        }else{
            JOptionPane.showMessageDialog(null,"Vacia");
        
        }

    }


    //Recorremos el txt y validamos si existe el usuario y la contra
    public boolean validarUsuario(String usuario, String contraseña) {
        
        boolean validado = false;

        try {

            String registro;

        
            File file = new File(this.ruta + this.nombreArchivo);

            if (!file.exists()) {
                file.createNewFile();
                return false;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Usuario d = new Usuario();
               
                StringTokenizer st = new StringTokenizer(registro, ",");

                
                d.setNombre(st.nextToken());
                d.setApellidos(st.nextToken());
                d.setUsuario(st.nextToken());
                d.setContraseña(st.nextToken());
                

                if (d.getUsuario().equals(usuario) && d.getContraseña().equals(contraseña)) {
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
    
    
    
    /*
public void inactivar(String nombre, String estado) {

        if (!esVacia()) {

            NodoUsuario aux = inicio;

            while (aux != null) {

                if (aux.getElemento().getNombre().equals(nombre)) {

                    Usuario d = new Usuario();

                    d.setNombre(d.getNombre());
                    d.setApellidos(d.getApellidos());
                    d.setUsuario(d.getUsuario());
                    d.setContraseña(d.getContraseña());
                    d.setEstado(estado);

                    aux.setElemento(d);

                }

                aux = aux.getSiguiente();
            }

        }

    }
    
    public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoUsuario aux = inicio;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + aux.getElemento().getApellidos() + aux.getElemento().getUsuario()
                        + aux.getElemento().getContraseña() + aux.getElemento().getEstado();
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar, cola vacía!");
        }
    }*/

      

}
