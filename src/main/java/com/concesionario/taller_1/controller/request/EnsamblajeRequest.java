package com.concesionario.taller_1.controller.request;


public class EnsamblajeRequest {
    private String marca;
    private String color;
    private ChasisData chasis;
    private MotorData motor;
    private CojineriaData cojineria;



    public EnsamblajeRequest() {
    }

    // Clase interna para la información del Chasis
    public static class ChasisData {
        private int numEjes;
        private String numPieza;
        private String tipoTransmision;
        public ChasisData() {
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

    // Clase interna para la información del Motor
    public static class MotorData {
        private int potenciaMaxima;
        private String numPieza;
        private String tecnologia;
        public MotorData() {
        }
        

        public int getPotenciaMaxima() {
            return potenciaMaxima;
        }
        public void setPotenciaMaxima(int potenciaMaxima) {
            this.potenciaMaxima = potenciaMaxima;
        }
        public String getNumPieza() {
            return numPieza;
        }
        public void setNumPieza(String numPieza) {
            this.numPieza = numPieza;
        }
        public String getTecnologia() {
            return tecnologia;
        }
        public void setTecnologia(String tecnologia) {
            this.tecnologia = tecnologia;
        }

        // Getters y Setters
    }

    // Clase interna para la información de la Cojineria
    public static class CojineriaData {
        private String numPieza;
        private String materialBase;
        public CojineriaData() {
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ChasisData getChasis() {
        return chasis;
    }

    public void setChasis(ChasisData chasis) {
        this.chasis = chasis;
    }

    public MotorData getMotor() {
        return motor;
    }

    public void setMotor(MotorData motor) {
        this.motor = motor;
    }

    public CojineriaData getCojineria() {
        return cojineria;
    }

    public void setCojineria(CojineriaData cojineria) {
        this.cojineria = cojineria;
    }
}
