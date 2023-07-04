package org.example.entities;

public class Appliance {

    private String name;
    private Boolean isOn;

    public Appliance(String name) {
        this.name = name;
        this.isOn = false;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getIsOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
}
