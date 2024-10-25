package com.concesionario.taller_1.domain.vehiculo.abstract_factory;

import com.concesionario.taller_1.domain.chasis.Chasis;
import com.concesionario.taller_1.domain.cojineria.Cojineria;
import com.concesionario.taller_1.domain.motor.Motor;

public interface VehiculoFactory {
    Chasis crearChasis(Chasis chasis);
    Motor crearMotor(Motor motor);
    Cojineria crearCojineria(Cojineria cojineria);
}