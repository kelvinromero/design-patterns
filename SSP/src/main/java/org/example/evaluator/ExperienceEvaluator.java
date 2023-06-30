package org.example.evaluator;

import org.example.entities.CurriculumInterface;
import org.example.entities.ExperienceType;

import java.util.List;
import java.util.stream.Collectors;

public class ExperienceEvaluator extends BaseHandler {

    @Override
    public void evaluate(CurriculumInterface curriculum) {
        this.calculateExperiencePoints(curriculum);
        super.evaluate(curriculum);
    }

    private void calculateExperiencePoints(CurriculumInterface curriculum) {
        List<ExperienceType> experienceTypes = curriculum.getExperiences().stream()
                .map(exp -> exp.getExperienceType())
                .distinct()
                .collect(Collectors.toList());


        for (ExperienceType experienceType : experienceTypes) {
            int totalPoints = curriculum.getExperiences().stream()
                    .filter(exp -> exp.getExperienceType() == experienceType)
                    .mapToInt(exp -> exp.getSemestersOfExperience() * experienceType.getPoints())
                    .reduce(0, Integer::sum);

            int maxPoints = experienceType.getMaxPoints();
            int pointsToAdd = Math.min(totalPoints, maxPoints);

            curriculum.getResult().incrementPoints(pointsToAdd);
        }

    }

}
