
package Venta;

public class NodoVenta {
    private Venta elemento;
    private NodoVenta enlaceIzq;
    private NodoVenta enlaceDer;

    public NodoVenta() {
        this.enlaceDer = null;
        this.enlaceIzq = null;
    }

    public Venta getElemento() {
        return elemento;
    }

    public void setElemento(Venta elemento) {
        this.elemento = elemento;
    }

    public NodoVenta getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(NodoVenta enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public NodoVenta getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(NodoVenta enlaceDer) {
        this.enlaceDer = enlaceDer;
    }
    
    
}
