package com.corenetwoks.modelo;

public class PuertaCoche extends ComponenteCoche
implements PuertaBloqueable, Alarma{

    private boolean estaBloqueada;
    private boolean alarmaActivada;


    public PuertaCoche(String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
    }
    public boolean isEstaBloqueada() {
        return estaBloqueada;
    }
    public void setEstaBloqueada(boolean estaBloqueada) {
        this.estaBloqueada = estaBloqueada;
    }
    @Override
    public void bloquea() {
        if(!isAlarmaActivada())
            activarAlarma();
    }
    @Override
    public void desbloquea() {
        if(isAlarmaActivada())
            desactivarAlarma();
    }
    @Override
    public void abrir() {
        if(estaBloqueada)
            desbloquea();
        estaBloqueada = false;
    }

    @Override
    public void cerrar() {
        bloquea();
        estaBloqueada = true;
    }
    @Override
    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
    @Override
    public void activarAlarma() {
        alarmaActivada = true;
    }
    @Override
    public void desactivarAlarma() {
        alarmaActivada = false;
    }
    @Override
    public String toString() {
        return super.toString() + "PuertaCoche{" +
                "estaBloqueada=" + estaBloqueada + ", alarmaActivada=" +
                alarmaActivada + '}';
    }



}
