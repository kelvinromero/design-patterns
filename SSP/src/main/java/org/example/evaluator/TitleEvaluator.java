package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ResultInterface;
import org.example.entities.Title;

public class TitleEvaluator extends BaseHandlers implements CurriculumHandlerInterface {


    public void evaluate(Curriculum curriculum, ResultInterface result){
        result.incrementPoints(curriculum.getTitle().getPoints());

        super.evaluate(curriculum, result);
    }
}
