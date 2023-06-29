package org.example.entities;

public enum ExperienceType {

    TEACHING_FEDERAL_INSTITUTE(1, 12),
    TEACHING_UNDERGRAD(1, 7),
    TEACHING_HIGH_SCHOOL(1, 6),
    ACADEMIC_MANAGEMENT_DIRECTOR(1, 15),
    ACADEMIC_MANAGEMENT_COORDINATOR(1, 10);

    private final int points;
    private final int maxPoints;

    ExperienceType(int points, int maxPoints) {
        this.points = points;
        this.maxPoints = maxPoints;
    }

    public int getPoints() {
        return points;
    }

    public int getMaxPoints() {
        return maxPoints;
    }
}
