package org.example.entities;

public enum Title {
    DOCTORATE(25),
    MASTER(18),
    SPECIALIST(10);

    private final int points;

    Title(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
