package com.concesionario.taller_1.domain.cojineria;

public abstract class Cojineria {
    private String numPieza;
    private String materialBase;
    public Cojineria() {
    }
    public Cojineria(String numPieza, String materialBase) {
        this.numPieza = numPieza;
        this.materialBase = materialBase;
    }
    public String getNumPieza() {
        return numPieza;
    }
    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }
    public String getMaterialBase() {
        return materialBase;
    }
    public void setMaterialBase(String materialBase) {
        this.materialBase = materialBase;
    }


}
