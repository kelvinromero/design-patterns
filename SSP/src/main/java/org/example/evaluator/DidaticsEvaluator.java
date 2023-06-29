package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ResultInterface;

public class DidaticsEvaluator extends BaseHandlers {

    @Override
    public void evaluate(Curriculum curriculum){
        if(curriculum.getDidacticPoints() < 70) {
            return;
        }

        curriculum.getResult().incrementPoints(curriculum.getDidacticPoints());

        super.evaluate(curriculum);
    }
}
