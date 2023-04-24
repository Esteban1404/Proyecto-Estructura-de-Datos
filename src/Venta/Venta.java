package Venta;

import Catalogo_De_Asientos.Asiento;
import Catalogo_de_Eventos.Evento;

public class Venta {
    private String vEvento;
    private String vAsiento;
    private String Usuario;
    private String FechaVenta;
    private String HoraVenta;
    private double Pago;

    public Venta() {
        this.vEvento = " ";
        this.vAsiento = " ";
        this.Usuario = " ";
        this.FechaVenta = " ";
        this.HoraVenta = " ";
        this.Pago = 0;
    }

    public String getvEvento() {
        return vEvento;
    }

    public void setvEvento(String vEvento) {
        this.vEvento = vEvento;
    }

    public String getvAsiento() {
        return vAsiento;
    }

    public void setvAsiento(String vAsiento) {
        this.vAsiento = vAsiento;
    }

   

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getHoraVenta() {
        return HoraVenta;
    }

    public void setHoraVenta(String HoraVenta) {
        this.HoraVenta = HoraVenta;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }

    
    
}
