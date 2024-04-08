package org.fco.strategy;

public class Robo {

    private Comportamento comportamento; // nossa strategry

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
