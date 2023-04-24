package Catalogo_de_Eventos;

import Catalogo_De_Asientos.Asiento;

public class Evento {
    private String nombreEvento;
    private String fechaEvento;
    private String lugarEvento;
    private String ciudadEvento;
    private String direccionEvento;
    private String estadoEvento;
    private int Id;
    private Asiento[] asientosE; 
    
    public Evento(){
        this.nombreEvento = " ";
        this.fechaEvento = " ";
        this.lugarEvento = " ";
        this.ciudadEvento = " ";
        this.estadoEvento = " ";
        this.Id=0;
        this.asientosE = null;
    }

    public String getDireccionEvento() {
        return direccionEvento;
    }

    public void setDireccionEvento(String direccionEvento) {
        this.direccionEvento = direccionEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nomEvento) {
        this.nombreEvento = nomEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String getCiudadEvento() {
        return ciudadEvento;
    }

    public void setCiudadEvento(String ciudadEvento) {
        this.ciudadEvento = ciudadEvento;
    }

    public String getEstadoEvento() {
        return estadoEvento;
    }

    public void setEstadoEvento(String estadoEvento) {
        this.estadoEvento = estadoEvento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Asiento[] getAsientosE() {
        return asientosE;
    }

    public void setAsientosE(Asiento[] asientosE) {
        this.asientosE = asientosE;
    }
    
    
}
