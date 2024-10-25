package com.concesionario.taller_1.domain.vehiculo;

import java.util.Date;

import com.concesionario.taller_1.domain.chasis.Chasis;
import com.concesionario.taller_1.domain.cojineria.Cojineria;
import com.concesionario.taller_1.domain.motor.Motor;


public class Vehiculo {
    private String color;
    private Date fechaEnsamblaje;
    private int numeroEnsamblaje;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    public Vehiculo() {
    }

    public Vehiculo(String color, Date fechaEnsamblaje, int numeroEnsamblaje, Chasis chasis, Motor motor,
            Cojineria cojineria) {
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
    }

    public Vehiculo(VehiculoBuilder bilder) {
        this.color = bilder.vehiculo.getColor();
        this.fechaEnsamblaje = bilder.vehiculo.getFechaEnsamblaje();
        this.numeroEnsamblaje = bilder.vehiculo.getNumeroEnsamblaje();
        this.chasis = bilder.vehiculo.getChasis();
        this.motor = bilder.vehiculo.getMotor();
        this.cojineria = bilder.vehiculo.getCojineria();
    }

    public static class VehiculoBuilder {
        Vehiculo vehiculo;

        public VehiculoBuilder() {
            vehiculo = new Vehiculo();
        }

        public VehiculoBuilder withChasis(Chasis chasis) {
            vehiculo.setChasis(chasis);
            return this;
        }

        public VehiculoBuilder withMotor(Motor motor) {
            vehiculo.setMotor(motor);
            return this;
        }

        public VehiculoBuilder withCojineria(Cojineria cojineria) {
            vehiculo.setCojineria(cojineria);
            return this;
        }

        public VehiculoBuilder withColor(String color) {
            vehiculo.setColor(color);
            return this;
        }

        public VehiculoBuilder withFechaEnsamblaje(Date fecha) {
            vehiculo.setFechaEnsamblaje(fecha);
            return this;
        }

        public VehiculoBuilder withNumeroEnsamblaje(int numero) {
            vehiculo.setNumeroEnsamblaje(numero);
            return this;
        }

        public Vehiculo build() {
            return vehiculo;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(Date fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public int getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(int numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }

}
