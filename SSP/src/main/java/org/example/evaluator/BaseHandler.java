package org.example.evaluator;

import org.example.entities.CurriculumInterface;

public abstract class BaseHandler implements CurriculumHandlerInterface {

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
