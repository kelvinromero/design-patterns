package org.example.entities;

import java.util.ArrayList;

public class Curriculum implements CurriculumInterface {

    private final String name;
    private final String document;
    private final Title title;
    private final ArrayList<ExperienceInterface> experiences;
    private Result result;

    private final int didacticPoints;

    public Curriculum(String name, String document, Title title, int didacticPoints) {
        this.name = name;
        this.document = document;
        this.title = title;
        this.experiences = new ArrayList<>();
        this.didacticPoints = didacticPoints;
        this.result = new Result();
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
        return this.experiences;
    }

    public void addExperience(ExperienceInterface experience) {
        this.experiences.add(experience);
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", title='" + title + '\'' +
                ", experience=" + experiences +
                '}';
    }
}
