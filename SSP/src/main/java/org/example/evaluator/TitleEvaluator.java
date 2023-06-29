package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ResultInterface;
import org.example.entities.Title;

public class TitleEvaluator extends BaseHandlers {


    @Override
    public void evaluate(Curriculum curriculum){
        curriculum.getResult().incrementPoints(curriculum.getTitle().getPoints());

        super.evaluate(curriculum);
    }
}
