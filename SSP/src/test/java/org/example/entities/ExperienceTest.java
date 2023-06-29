package org.example.entities;

import org.example.entities.Experience;
import org.example.entities.ExperienceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExperienceTest {

    @Test
    void getDescription() {
        Experience experience = new Experience(ExperienceType.ACADEMIC_MANAGEMENT, "description", 1);
        assertEquals("description", experience.getDescription());
    }

    @Test
    void getExperienceType() {
        Experience experience = new Experience(ExperienceType.ACADEMIC_MANAGEMENT, "description", 1);
        assertEquals(ExperienceType.ACADEMIC_MANAGEMENT, experience.getExperienceType());
    }

    @Test
    void getSemestersOfExperience() {
        Experience experience = new Experience(ExperienceType.ACADEMIC_MANAGEMENT, "description", 1);
        assertEquals(1, experience.getSemestersOfExperience());
    }
}