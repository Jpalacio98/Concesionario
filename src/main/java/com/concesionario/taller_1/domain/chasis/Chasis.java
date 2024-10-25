package com.concesionario.taller_1.domain.chasis;

public abstract class Chasis {
    private int numEjes;
    private String numPieza;
    private String tipoTransmision;
    public Chasis() {
    }
    public Chasis(int numEjes, String numPieza, String tipoTransmision) {
        this.numEjes = numEjes;
        this.numPieza = numPieza;
        this.tipoTransmision = tipoTransmision;
    }
    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    public String getNumPieza() {
        return numPieza;
    }
    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }
    public String getTipoTransmision() {
        return tipoTransmision;
    }
    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    
}
