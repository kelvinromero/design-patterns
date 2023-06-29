package org.example.entities;

public class Experience implements ExperienceInterface{

    private String description;
    private final int semestersOfExperience;
    private final ExperienceType experienceType;

    public Experience(ExperienceType experienceType, String description, int semestersOfExperience) {
        this.experienceType = experienceType;
        this.description = description;
        this.semestersOfExperience = semestersOfExperience;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public ExperienceType getExperienceType() {
        return this.experienceType;
    }

    @Override
    public int getSemestersOfExperience() {
        return this.semestersOfExperience;
    }

    public String toString() {
        return this.semestersOfExperience + " semesters of " + this.experienceType + " as: " + this.description;
    }
}
