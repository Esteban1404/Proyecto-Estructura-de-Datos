package Catalogo_De_Asientos;

public class NodoAsiento {

    private Asiento dato;
    private NodoAsiento siguiente;
    

    public NodoAsiento() {
        this.siguiente = null;
    }

    public Asiento getDato() {
        return dato;
    }

    public void setDato(Asiento dato) {
        this.dato = dato;
    }

    public NodoAsiento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAsiento siguiente) {
        this.siguiente = siguiente;
    }
}
