package com.corenetwoks.modelo;

public class Pedido {

    private int pedidoId;
    private int clienteId;
    private double total;
    private double iva;

    @Override
    public String toString() {
        return "Pedido{" +
                "pedidoId=" + pedidoId +
                ", clienteId=" + clienteId +
                ", total=" + total +
                ", iva=" + iva +
                '}';
    }

    public Pedido() {
    }

    public Pedido(int pedidoId, int clienteId, double total, double iva) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.total = total;
        this.iva = iva;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
