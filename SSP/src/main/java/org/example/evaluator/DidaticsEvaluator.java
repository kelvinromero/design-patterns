package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ResultInterface;

public class DidaticsEvaluator extends BaseHandlers {

    @Override
    public void evaluate(Curriculum curriculum, ResultInterface result){
        if(curriculum.getDidacticPoints() < 70) {
            return;
        }

        result.incrementPoints(curriculum.getDidacticPoints());

        super.evaluate(curriculum, result);
    }
}
