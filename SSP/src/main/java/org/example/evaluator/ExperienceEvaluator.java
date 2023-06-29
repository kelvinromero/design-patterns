package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ExperienceInterface;
import org.example.entities.ResultInterface;

public class ExperienceEvaluator extends BaseHandlers {

    @Override
    public void evaluate(Curriculum curriculum, ResultInterface result) {
        this.calculateTeachingExperience(curriculum, result);
        super.evaluate(curriculum, result);
    }

    private void calculateTeachingExperience(Curriculum curriculum, ResultInterface result) {
        int temp;
        for (ExperienceInterface experience : curriculum.getExperiences()) {
            temp = experience.getSemestersOfExperience() * experience.getExperienceType().getPoints();
            result.incrementPoints(
                    Math.min(temp, experience.getExperienceType().getMaxPoints())
            );
        }
    }

}
