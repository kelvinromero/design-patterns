package org.example.entities;

import java.util.ArrayList;

public interface CurriculumInterface {

    public ArrayList<ExperienceInterface> getExperiences();

    public Result getResult();

    public int getDidacticPoints();

    public Title getTitle();
    public String getName();
    public String getDocument();
    public void addExperience(ExperienceInterface experience);

}
