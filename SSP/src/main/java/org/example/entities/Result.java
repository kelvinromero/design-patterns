package org.example.entities;

public class Result implements ResultInterface {

    private int points;

    public Result() {
        this.points = 0;
    }

    public int getPoints() {
        return this.points;
    }

    public void incrementPoints(int points) {
        this.points += points;
    }

    public String toString() {
        return "Result(points=" + this.getPoints() + ")";
    }
}
