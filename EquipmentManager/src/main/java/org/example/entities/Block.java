package org.example.entities;

import java.util.ArrayList;

public class Block {

    private ArrayList<Appliance> appliances;
    private String name;

    public Block(String name) {
        this.name = name;
        this.appliances = new ArrayList<Appliance>();
    }
}
