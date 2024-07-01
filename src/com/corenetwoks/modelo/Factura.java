package com.corenetwoks.modelo;

public class Factura {
    private int idFactura;
    private int idCliente;

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", idCliente=" + idCliente +
                '}';
    }

    public void comprobarFactura() throws Exception {
        if(idFactura==0){
            throw new Exception("Factura sin id.. error !!!");
        }
    }

    public Factura() {
    }

    public Factura(int idFactura, int idCliente) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
