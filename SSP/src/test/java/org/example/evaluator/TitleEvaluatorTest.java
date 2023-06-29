package org.example.evaluator;

import org.example.entities.Curriculum;
import org.example.entities.Result;
import org.example.entities.Title;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleEvaluatorTest {

    @Test
    void evaluate() {
        TitleEvaluator titleEvaluator = new TitleEvaluator();
        Curriculum curriculum = new Curriculum("John Doe", "123", Title.DOCTORATE, 100);
        Result result = new Result();
        titleEvaluator.evaluate(curriculum, result);
        assertEquals(25, result.getPoints());
    }
}