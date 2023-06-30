package org.example.evaluator;

import org.example.entities.CurriculumInterface;

public class TitleEvaluator extends BaseHandler {


    @Override
    public void evaluate(CurriculumInterface curriculum){
        curriculum.getResult().incrementPoints(curriculum.getTitle().getPoints());

        super.evaluate(curriculum);
    }
}
