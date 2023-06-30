package org.example;

import org.example.entities.*;
import org.example.evaluator.DidacticsEvaluator;
import org.example.evaluator.ExperienceEvaluator;
import org.example.evaluator.TitleEvaluator;
import org.example.ssp.Ssp;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 70);
        curriculum.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of London", 10));
        curriculum.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of Cambridge", 5));
        curriculum.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_COORDINATOR, "Coordinator", 5));
        curriculum.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_COORDINATOR, "Coordinator", 10));

        Curriculum curriculum2 = new Curriculum("Maria Doe", "223456789", Title.MASTER, 80);
        curriculum2.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of London", 10));
        curriculum2.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_COORDINATOR, "Coordinator", 5));

        Curriculum curriculum3 = new Curriculum("Pedro Doe", "323456789", Title.MASTER, 80);
        curriculum3.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of London", 10));
        curriculum3.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_COORDINATOR, "Coordinator", 5));
        curriculum3.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_DIRECTOR, "Director", 16));

        Curriculum curriculum4 = new Curriculum("Julyana Doe", "323456789", Title.SPECIALIST, 50);
        curriculum4.addExperience(new Experience(ExperienceType.TEACHING_FEDERAL_INSTITUTE, "Teaching at University of London", 10));
        curriculum4.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_COORDINATOR, "Director", 5));
        curriculum4.addExperience(new Experience(ExperienceType.ACADEMIC_MANAGEMENT_DIRECTOR, "Director", 10));

        List<CurriculumInterface> curriculums = Arrays.asList(curriculum, curriculum2, curriculum3, curriculum4);

        DidacticsEvaluator didacticsEvaluator = new DidacticsEvaluator();
        TitleEvaluator titleEvaluator = new TitleEvaluator();
        ExperienceEvaluator experienceEvaluator = new ExperienceEvaluator();

        didacticsEvaluator.setNext(titleEvaluator);
        titleEvaluator.setNext(experienceEvaluator);

        Ssp ssp = new Ssp(didacticsEvaluator, 2);

        curriculums = ssp.getPssResult(curriculums);

        System.out.println("Resultado final");
        for(CurriculumInterface cv : curriculums) {
            System.out.println(cv);
        }
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("Classificados");
        for(CurriculumInterface cv : ssp.getClassifieds(curriculums)) {
            System.out.println(cv);
        }
    }
}