package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ResultInterface;

public class DidaticsEvaluator extends BaseHandlers implements CurriculumHandlerInterface{
    public void evaluate(Curriculum curriculum, ResultInterface result){
        result.incrementPoints(curriculum.getDidacticPoints());

        super.evaluate(curriculum, result);
    }
}
