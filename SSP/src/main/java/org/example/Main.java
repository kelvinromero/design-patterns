package org.example;

import org.example.entities.*;
import org.example.evaluator.DidaticsEvaluator;
import org.example.evaluator.ExperienceEvaluator;
import org.example.evaluator.TitleEvaluator;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 70);
        curriculum.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of London", 10));
        curriculum.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of London", 3));
        curriculum.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_COORDINATOR, "Director", 5));

        Result result = new Result();

        DidaticsEvaluator didaticsEvaluator = new DidaticsEvaluator();
        TitleEvaluator titleEvaluator = new TitleEvaluator();
        ExperienceEvaluator experienceEvaluator = new ExperienceEvaluator();

        didaticsEvaluator.setNext(titleEvaluator);
        titleEvaluator.setNext(experienceEvaluator);

        didaticsEvaluator.evaluate(curriculum, result);

        System.out.println(curriculum);
        System.out.println(result);
    }
}