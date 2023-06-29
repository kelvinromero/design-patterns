package org.example.entities;

import java.util.ArrayList;

public class Curriculum implements CurriculumInterface {

    private final String name;
    private final String document;
    private final Title title;
    private final ArrayList<ExperienceInterface> experience;

    private final int didacticPoints;

    public Curriculum(String name, String document, Title title, int didacticPoints) {
        this.name = name;
        this.document = document;
        this.title = title;
        this.experience = new ArrayList<>();
        this.didacticPoints = didacticPoints;
    }

    public String getName() {
        return this.name;
    }

    public String getDocument() {
        return this.document;
    }

    public Title getTitle() {
        return this.title;
    }

    public int getDidacticPoints() {
        return this.didacticPoints;
    }

    @Override
    public ArrayList<ExperienceInterface> getExperiences() {
        return this.experience;
    }

    public void addExperience(ExperienceInterface experience) {
        this.experience.add(experience);
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}
