package com.concesionario.taller_1.domain.vehiculo.abstract_factory.Implementations;

import com.concesionario.taller_1.domain.chasis.Chasis;
import com.concesionario.taller_1.domain.chasis.MazdaChasis;
import com.concesionario.taller_1.domain.cojineria.Cojineria;
import com.concesionario.taller_1.domain.cojineria.MazdaCojineria;
import com.concesionario.taller_1.domain.motor.MazdaMotor;
import com.concesionario.taller_1.domain.motor.Motor;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.VehiculoFactory;

public class MazdaFactory implements VehiculoFactory {
    public Chasis crearChasis(Chasis c) {
        return new MazdaChasis(c.getNumEjes(), c.getNumPieza(), c.getTipoTransmision());
    }

    public Motor crearMotor(Motor m) {
        return new MazdaMotor(m.getPotenciaMaxima(), m.getNumeroPieza(), m.getTecnologia());
    }

    public Cojineria crearCojineria(Cojineria cj) {
        return new MazdaCojineria(cj.getNumPieza(), cj.getMaterialBase());
    }
}