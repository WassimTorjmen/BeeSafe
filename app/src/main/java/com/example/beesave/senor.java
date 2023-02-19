package com.example.beesave;

public class senor
{
    private String idSensor;
    private String nameSensor;
    private Boolean etatSensor;

    public senor(String idSensor, String nameSensor, Boolean etatSensor) {
        this.idSensor = idSensor;
        this.nameSensor = nameSensor;
        this.etatSensor = etatSensor;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public String getNameSensor() {
        return nameSensor;
    }

    public void setNameSensor(String nameSensor) {
        this.nameSensor = nameSensor;
    }

    public Boolean getEtatSensor() {
        return etatSensor;
    }

    public void setEtatSensor(Boolean etatSensor) {
        this.etatSensor = etatSensor;
    }
}
