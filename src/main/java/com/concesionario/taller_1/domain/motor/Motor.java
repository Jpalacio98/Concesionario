package com.concesionario.taller_1.domain.motor;

public abstract class Motor {
    private int potenciaMaxima;
    private String numeroPieza;
    private String tecnologia;
    public Motor() {
    }
    public Motor(int potenciaMaxima, String numeroPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.numeroPieza = numeroPieza;
        this.tecnologia = tecnologia;
    }
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }
    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
    public String getNumeroPieza() {
        return numeroPieza;
    }
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    public String getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    
}
