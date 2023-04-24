package Catalogo_de_Eventos;

import Datos_Login.NodoUsuario;
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

public class MetodosEventos {

    private NodoEvent inicio;
    private NodoEvent fin;

    private String ruta;
    private String nombreArchivo;

    public MetodosEventos() {
        this.inicio = null;
        this.fin = null;

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

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

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

                if (  d.getFechaEvento().equals(Fecha) && d.getLugarEvento().equals(Lugar)) {
                    
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

    public boolean validarId(int id) {

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

                if ( d.getId()==id) {
                    
                    validado = true;
                    eventoActual(d.getNombreEvento());

                }
            }
            br.close();

            return validado;

        } catch (IOException error) {

            error.printStackTrace();
            return false;
        }

    }

    public void agregar(int Id, String Ciudad, String Fecha, String Lugar, String Nombre, String Estado) {

        Evento d = new Evento();

        d.setId(Id);
        d.setCiudadEvento(Ciudad);
        d.setFechaEvento(Fecha);
        d.setLugarEvento(Lugar);
        d.setNombreEvento(Nombre);
        d.setEstadoEvento(Estado);

        NodoEvent nuevo = new NodoEvent();

        nuevo.setDato(d);

        if (!verificarDisponibilidad(d.getLugarEvento(), d.getFechaEvento())) {

            if(!validarId(d.getId())){
            if (esVacia()) {

                inicio = nuevo;
                fin = nuevo;
                fin.setSiguiente(inicio);

            } else if (d.getId() <= inicio.getDato().getId()) {

                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                fin.setSiguiente(inicio);

            } else if (d.getId() >= fin.getDato().getId()) {

                fin.setSiguiente(nuevo);
                fin = nuevo; //fin=fin.getSiguiente();
                fin.setSiguiente(inicio);
            } else {

                NodoEvent aux = inicio;
                while (aux.getSiguiente().getDato().getId() < d.getId()) {
                    aux = aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);

            }
            char respuesta = JOptionPane.showInputDialog(null, "Desea Agregar otroa(s/n)? :").toLowerCase().charAt(0);
            if (respuesta == 's') {

                agregar(Id, Ciudad, Fecha, Lugar, Nombre, Estado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe un Evento con ese iD");
        }
        }else{
        
                        JOptionPane.showMessageDialog(null, "Ya existe un evento");

        }
    }

    public void guardarTxt() {

        if (!esVacia()) {

            try {
                File archivo = new File(this.ruta + this.nombreArchivo);

                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                NodoEvent aux = inicio;

                bw.write(aux.getDato().getId() + "," + aux.getDato().getNombreEvento() + "," + aux.getDato().getCiudadEvento() + ","
                        + aux.getDato().getLugarEvento() + "," + aux.getDato().getFechaEvento() + "," + aux.getDato().getEstadoEvento());

                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
                //lo agregamos al final del archivo sin borrar los datos
                while (aux != inicio) {

                    bw.write(aux.getDato().getId() + "," + aux.getDato().getNombreEvento() + "," + aux.getDato().getCiudadEvento() + ","
                            + aux.getDato().getLugarEvento() + "," + aux.getDato().getFechaEvento() + "," + aux.getDato().getEstadoEvento());
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

    /*public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoEvent aux = inicio;
            s = s + aux.getDato().getNombreEvento() + "--" + aux.getDato().getFechaEvento() + "--" + aux.getDato().getLugarEvento()
                    + aux.getDato().getCiudadEvento() + "--" + aux.getDato().getDireccionEvento() + "--" + aux.getDato().getEstadoEvento() + "-->";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s + aux.getDato().getNombreEvento() + "--" + aux.getDato().getFechaEvento() + "--" + aux.getDato().getLugarEvento()
                        + aux.getDato().getCiudadEvento() + "--" + aux.getDato().getDireccionEvento() + "--" + aux.getDato().getEstadoEvento() + "-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista simple circular contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se pueden mostrar elementos, lista vacía");
        }
    }*/
    public void editarEvento(String nuevoId, String nuevoNombre, String nuevoCiudad, String nuevoLugar, String nuevoFecha, String nuevoEstado) {

        try {
            String registro, registro2;
            String id, nombre, ciudad, lugar, fecha, estado;

            File db = new File(this.ruta + this.nombreArchivo);
            File tempDB = new File(this.ruta + "EventosTemporal.txt");

            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            String informacion = "";

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");

                id = (st.nextToken());
                nombre = st.nextToken();
                ciudad = st.nextToken();
                lugar = st.nextToken();
                fecha = st.nextToken();
                estado = st.nextToken();

                if (id.contains(nuevoId)) {
                    informacion = "A continuación se muestran los datos del usuario a modificar:\n"
                            + "(Id, Nombre, Ciudad, Lugar, Fecha, Estado)\n\n"
                            + id + " " + nombre + " " + ciudad + " " + fecha + " " + lugar + " " + estado;
                    JOptionPane.showMessageDialog(null, informacion);
                }

            }

            br.close();

            if (informacion.length() != 0) {

                BufferedReader br2 = new BufferedReader(new FileReader(db));

                while ((registro2 = br2.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(registro2, ",");
                    id = st.nextToken();
                    nombre = st.nextToken();
                    ciudad = st.nextToken();
                    lugar = st.nextToken();
                    fecha = st.nextToken();
                    estado = st.nextToken();

                    if (id.contains(nuevoId)) {
                        bw.write(id + "," + nuevoNombre + "," + nuevoCiudad + "," + nuevoLugar + "," + nuevoFecha + "," + nuevoEstado
                        );
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

            editarEvento(nuevoId, nuevoNombre, nuevoCiudad, nuevoLugar, nuevoFecha, nuevoEstado);
        }
    }

    public ArrayList listarEventos() {

        try {

            String registro;

            //Declaro una estructura de información de personas
            ArrayList<Evento> listaUsuarios = new ArrayList<Evento>();

            File file = new File(this.ruta + this.nombreArchivo);

            if (!file.exists()) {
                file.createNewFile();
                return null;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {

                Evento d = new Evento();
                StringTokenizer st = new StringTokenizer(registro, ",");

                d.setId(Integer.parseInt(st.nextToken()));
                d.setCiudadEvento(st.nextToken());

                d.setFechaEvento(st.nextToken());
                d.setLugarEvento(st.nextToken());
                d.setNombreEvento(st.nextToken());
                d.setEstadoEvento(st.nextToken());

                listaUsuarios.add(d);

            }

            br.close();

            return listaUsuarios;

        } catch (Exception error) {

            error.printStackTrace();
            return null;
        }

    }
    
    public void eventoActual(String evento) {

        try {

            File archivo = new File(this.ruta + "EventoActual.txt");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
            //lo agregamos al final del archivo sin borrar los datos
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(evento + ",");

            //Agrega la información de la persona en una línea nueva al final del archivo
            bw.flush();
            bw.newLine();
            bw.close();

            //JOptionPane.showMessageDialog(null,"Persona ingresada correctamente en la base de datos!!!!");
        } catch (Exception error) {
            error.printStackTrace();

        }

    }

}
