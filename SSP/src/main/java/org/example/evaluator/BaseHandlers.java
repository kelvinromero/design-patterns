package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.CurriculumInterface;
import org.example.entities.ResultInterface;

public abstract class BaseHandlers implements CurriculumHandlerInterface {

    private CurriculumHandlerInterface next;

    public void setNext(CurriculumHandlerInterface next) {
        this.next = next;
    }

    public void evaluate(CurriculumInterface curriculum) {
        if (this.next == null) {
            return;
        }

        next.evaluate(curriculum);
    }
}
