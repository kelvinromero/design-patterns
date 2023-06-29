package org.example.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExperienceTypeTest {

    @Test
    void getDisplayName() {
        assertEquals("Teaching", ExperienceType.TEACHING.getDisplayName());
        assertEquals("Academic Management", ExperienceType.ACADEMIC_MANAGEMENT.getDisplayName());
        assertEquals("Research", ExperienceType.RESEARCH.getDisplayName());
        assertEquals("Industry", ExperienceType.INDUSTRY.getDisplayName());
    }

    @Test
    void values() {
        assertEquals(4, ExperienceType.values().length);

    }

    @Test
    void valueOf() {
        assertEquals(ExperienceType.TEACHING, ExperienceType.valueOf("TEACHING"));
        assertEquals(ExperienceType.ACADEMIC_MANAGEMENT, ExperienceType.valueOf("ACADEMIC_MANAGEMENT"));
        assertEquals(ExperienceType.RESEARCH, ExperienceType.valueOf("RESEARCH"));
        assertEquals(ExperienceType.INDUSTRY, ExperienceType.valueOf("INDUSTRY"));
    }
}