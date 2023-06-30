package org.example.ssp;

import org.example.entities.CurriculumInterface;
import org.example.evaluator.CurriculumHandlerInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ssp {

    private CurriculumHandlerInterface chain;

    public Ssp(CurriculumHandlerInterface chain) {
        this.chain = chain;
    }

    public List<CurriculumInterface> getPssResult(List<CurriculumInterface> curriculums) {
        for(CurriculumInterface curriculum : curriculums) {
            chain.evaluate(curriculum);
        }

        Collections.sort(curriculums, new Comparator<CurriculumInterface>() {
            @Override
            public int compare(CurriculumInterface c1, CurriculumInterface c2) {
                return Integer.compare(c2.getResult().getPoints(), c1.getResult().getPoints());
            }
        });

        return curriculums;
    }

}
