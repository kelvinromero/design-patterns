package org.example;

import org.example.entities.*;
import org.example.evaluator.DidaticsEvaluator;
import org.example.evaluator.TitleEvaluator;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 10);
        curriculum.addExperience(new Experience(ExperienceType.TEACHING, "Teaching at University of London", 10));

        Result result = new Result();

        DidaticsEvaluator didaticsEvaluator = new DidaticsEvaluator();
        TitleEvaluator titleEvaluator = new TitleEvaluator();

        didaticsEvaluator.setNext(titleEvaluator);

        didaticsEvaluator.evaluate(curriculum, result);

        System.out.println(curriculum);
        System.out.println(result);
    }
}