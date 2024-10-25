package com.concesionario.taller_1.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concesionario.taller_1.controller.request.EnsamblajeRequest;
import com.concesionario.taller_1.domain.chasis.Chasis;
import com.concesionario.taller_1.domain.chasis.FordChasis;
import com.concesionario.taller_1.domain.chasis.MazdaChasis;
import com.concesionario.taller_1.domain.chasis.ToyotaChasis;
import com.concesionario.taller_1.domain.cojineria.Cojineria;
import com.concesionario.taller_1.domain.cojineria.FordCojineria;
import com.concesionario.taller_1.domain.cojineria.MazdaCojineria;
import com.concesionario.taller_1.domain.cojineria.ToyotaCojineria;
import com.concesionario.taller_1.domain.motor.FordMotor;
import com.concesionario.taller_1.domain.motor.MazdaMotor;
import com.concesionario.taller_1.domain.motor.Motor;
import com.concesionario.taller_1.domain.motor.ToyotaMotor;
import com.concesionario.taller_1.domain.vehiculo.Vehiculo;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.VehiculoFactory;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.Implementations.FordFactory;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.Implementations.MazdaFactory;
import com.concesionario.taller_1.domain.vehiculo.abstract_factory.Implementations.ToyotaFactory;

@RestController
@RequestMapping("/api/ensamblaje")
public class VehiculoController {

    @PostMapping("/ensamblar")
    public Vehiculo ensamblarVehiculo(@RequestBody EnsamblajeRequest request) {
        VehiculoFactory factory;
        Chasis c;
        Motor m;
        Cojineria cj;
        switch (request.getMarca().toLowerCase()) {
            case "toyota":
                factory = new ToyotaFactory();
                c = new ToyotaChasis(request.getChasis().getNumEjes(), request.getChasis().getNumPieza(),request.getChasis().getTipoTransmision());
                m = new ToyotaMotor(request.getMotor().getPotenciaMaxima(), request.getMotor().getNumPieza(), request.getMotor().getTecnologia());
                cj = new ToyotaCojineria(request.getCojineria().getNumPieza(), request.getCojineria().getMaterialBase());
                break;
            case "ford":
                factory = new FordFactory();
                c = new FordChasis(request.getChasis().getNumEjes(), request.getChasis().getNumPieza(),request.getChasis().getTipoTransmision());
                m = new FordMotor(request.getMotor().getPotenciaMaxima(), request.getMotor().getNumPieza(), request.getMotor().getTecnologia());
                cj = new FordCojineria(request.getCojineria().getNumPieza(), request.getCojineria().getMaterialBase());
                break;
            case "mazda":
                factory = new MazdaFactory();
                c = new MazdaChasis(request.getChasis().getNumEjes(), request.getChasis().getNumPieza(),request.getChasis().getTipoTransmision());
                m = new MazdaMotor(request.getMotor().getPotenciaMaxima(), request.getMotor().getNumPieza(), request.getMotor().getTecnologia());
                cj = new MazdaCojineria(request.getCojineria().getNumPieza(), request.getCojineria().getMaterialBase());
                break;
            default:
                c = new ToyotaChasis(0,null,null);
                m = new  ToyotaMotor(0, null, null);
                cj = new ToyotaCojineria(null, null);
                throw new IllegalArgumentException("Marca desconocida: " + request.getMarca());
        }


        Vehiculo builder = new Vehiculo.VehiculoBuilder()
                .withChasis(factory.crearChasis(c))
                .withMotor(factory.crearMotor(m))
                .withCojineria(factory.crearCojineria(cj))
                .withColor(request.getColor())
                .withFechaEnsamblaje(new Date())
                .withNumeroEnsamblaje((int) (Math.random() * 1000))
                .build();

        return builder;
    }
}
