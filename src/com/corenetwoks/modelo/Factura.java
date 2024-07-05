package com.corenetwoks.modelo;

import java.util.Objects;

public class Factura extends Object {
    private int idFactura;
    private int idCliente;

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", idCliente=" + idCliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return idFactura == factura.idFactura;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFactura);
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
