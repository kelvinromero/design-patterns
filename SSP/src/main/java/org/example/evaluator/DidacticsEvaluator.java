package org.example.evaluator;

import org.example.entities.CurriculumInterface;

public class DidacticsEvaluator extends BaseHandler {

    @Override
    public void evaluate(CurriculumInterface curriculum){
        if(curriculum.getDidacticPoints() < 70) {
            return;
        }

        curriculum.getResult().incrementPoints(curriculum.getDidacticPoints());

        super.evaluate(curriculum);
    }
}
