package Catalogo_De_Asientos;

public class Asiento {

    private String codigoArea;
    private String numeroAsiento;
    private int costoVenta;
    private String estado;

    public Asiento() {
        this.codigoArea = " ";
        this.numeroAsiento = "";
        this.costoVenta = 3000;
        this.estado = "LIB";
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(int costoVenta) {
        this.costoVenta = costoVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
}
