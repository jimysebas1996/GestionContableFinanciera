package Objetos;


public class objFactCabecera {
    
    String factFecha = "";
    int factIdCliente = 0;
    int factIdDetalle = 0;
    Double factSubtotal = 0.00;
    Double factDescuento = 0.00;
    Double factIva  = 0.00;
    Double factTotal = 0.00;

    public void setFactFecha(String factFecha) {
        this.factFecha = factFecha;
    }

    public void setFactIdCliente(int factIdCliente) {
        this.factIdCliente = factIdCliente;
    }

    public void setFactIdDetalle(int factIdDetalle) {
        this.factIdDetalle = factIdDetalle;
    }

    public void setFactSubtotal(Double factSubtotal) {
        this.factSubtotal = factSubtotal;
    }

    public void setFactDescuento(Double factDescuento) {
        this.factDescuento = factDescuento;
    }

    public void setFactIva(Double factIva) {
        this.factIva = factIva;
    }

    public void setFactTotal(Double factTotal) {
        this.factTotal = factTotal;
    }

    public String getFactFecha() {
        return factFecha;
    }

    public int getFactIdCliente() {
        return factIdCliente;
    }

    public int getFactIdDetalle() {
        return factIdDetalle;
    }

    public Double getFactSubtotal() {
        return factSubtotal;
    }

    public Double getFactDescuento() {
        return factDescuento;
    }

    public Double getFactIva() {
        return factIva;
    }

    public Double getFactTotal() {
        return factTotal;
    }
    
}//Fin de la clase obJFactCabecera
