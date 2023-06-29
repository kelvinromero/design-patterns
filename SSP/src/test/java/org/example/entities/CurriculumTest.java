package org.example.entities;

import org.example.entities.*;

import static org.junit.jupiter.api.Assertions.*;

class CurriculumTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 100);
        assertEquals("John Doe", curriculum.getName());
    }

    @org.junit.jupiter.api.Test
    void getDocument() {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 100);
        assertEquals("123456789", curriculum.getDocument());
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 100);
        assertEquals(Title.DOCTORATE, curriculum.getTitle());
    }

    @org.junit.jupiter.api.Test
    void getExperiences() {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 100);
        assertEquals(0, curriculum.getExperiences().size());
    }

    @org.junit.jupiter.api.Test
    void addExperience() {
        Curriculum curriculum = new Curriculum("John Doe", "123456789", Title.DOCTORATE, 100);
        ExperienceInterface experience = new Experience(ExperienceType.TEACHING, "Phisics Teacher", 12);
        curriculum.addExperience(experience);
        assertEquals(1, curriculum.getExperiences().size());
        assertEquals(ExperienceType.TEACHING, curriculum.getExperiences().get(0).getExperienceType());
    }
}