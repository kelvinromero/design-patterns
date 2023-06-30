package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.CurriculumInterface;
import org.example.entities.ResultInterface;

public interface CurriculumHandlerInterface {

    public void evaluate(CurriculumInterface curriculum);

    public void setNext(CurriculumHandlerInterface next);
}
