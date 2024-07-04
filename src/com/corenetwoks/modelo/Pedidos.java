package com.corenetwoks.modelo;

import java.util.HashMap;
import java.util.Map;

public class Pedidos {

    private Map<Integer, Pedido> pedidos;

    public boolean altaPedido(Pedido p){
        Pedido p1;
        p1 = pedidos.put(p.getPedidoId(),p);
        if (p1 == null ){
            return false;
        }else{
            return true;
        }
       // return pedidos.put(p.getPedidoId(),p)==null?false:true;
    }

    public boolean bajaPedido(int id){
        Pedido p1 = pedidos.remove(id);
        if(p1 == null){
            return  false;
        }else{
            return true;
        }
    }

    public Pedido consultarUnPedido(int id){
        Pedido p1 =  pedidos.get(id);
        return p1;
    }

    public Map<Integer,Pedido> consultarTodosPedidos(){
        return pedidos;
    }

    public boolean modificarPedido(Pedido p){
        Pedido p1 = pedidos.put(p.getPedidoId(),p);
        if(p1==null){
            return false;
        }else {
            return true;
        }
    }



    @Override
    public String toString() {
        return "Pedidos{" +
                "pedidos=" + pedidos +
                '}';
    }

    public Pedidos() {
        pedidos = new HashMap<>();
    }


}
