package com.concesionario.taller_1.domain.vehiculo.abstract_factory.Implementations;

import com.concesionario.taller_1.domain.chasis.Chasis;
import com.concesionario.taller_1.domain.chasis.FordChasis;
import com.concesionario.taller_1.domain.cojineria.Cojineria;
import com.concesionario.taller_1.domain.cojineria.FordCojineria;
import com.concesionario.taller_1.domain.motor.FordMotor;
import com.concesionario.taller_1.domain.motor.Motor;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.VehiculoFactory;

public class FordFactory implements VehiculoFactory {
    public Chasis crearChasis(Chasis c) {
        return new FordChasis(c.getNumEjes(), c.getNumPieza(), c.getTipoTransmision());
    }

    public Motor crearMotor(Motor m) {
        return new FordMotor(m.getPotenciaMaxima(), m.getNumeroPieza(), m.getTecnologia());
    }

    public Cojineria crearCojineria(Cojineria cj) {
        return new FordCojineria(cj.getNumPieza(), cj.getMaterialBase());
    }
}