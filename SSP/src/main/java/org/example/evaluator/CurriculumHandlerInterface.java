package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.ResultInterface;

public interface CurriculumHandlerInterface {

    public void evaluate(Curriculum curriculum, ResultInterface result);

    public void setNext(CurriculumHandlerInterface next);
}
