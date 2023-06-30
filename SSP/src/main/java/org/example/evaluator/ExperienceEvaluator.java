package org.example.evaluator;

import org.example.entities.CurriculumInterface;
import org.example.entities.ExperienceInterface;

public class ExperienceEvaluator extends BaseHandler {

    @Override
    public void evaluate(CurriculumInterface curriculum) {
        this.calculateTeachingExperience(curriculum);
        super.evaluate(curriculum);
    }

    private void calculateTeachingExperience(CurriculumInterface curriculum) {
        int temp;
        for (ExperienceInterface experience : curriculum.getExperiences()) {
            temp = experience.getSemestersOfExperience() * experience.getExperienceType().getPoints();
            curriculum.getResult().incrementPoints(
                    Math.min(temp, experience.getExperienceType().getMaxPoints())
            );
        }
    }

}
