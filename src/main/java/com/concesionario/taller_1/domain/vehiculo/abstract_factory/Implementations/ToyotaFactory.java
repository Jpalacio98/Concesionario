package com.concesionario.taller_1.domain.vehiculo.abstract_factory.Implementations;

import com.concesionario.taller_1.domain.chasis.Chasis;
import com.concesionario.taller_1.domain.chasis.ToyotaChasis;
import com.concesionario.taller_1.domain.cojineria.Cojineria;
import com.concesionario.taller_1.domain.cojineria.ToyotaCojineria;
import com.concesionario.taller_1.domain.motor.Motor;
import com.concesionario.taller_1.domain.motor.ToyotaMotor;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.VehiculoFactory;

public class ToyotaFactory implements VehiculoFactory {
    public Chasis crearChasis(Chasis c) { return new ToyotaChasis(c.getNumEjes(),c.getNumPieza(),c.getTipoTransmision()); }
    public Motor crearMotor(Motor m) { return new ToyotaMotor(m.getPotenciaMaxima(),m.getNumeroPieza(),m.getTecnologia()); }
    public Cojineria crearCojineria(Cojineria cj) { return new ToyotaCojineria(cj.getNumPieza(),cj.getMaterialBase()); }
    
}

