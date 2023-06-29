package org.example.entities;

public enum ExperienceType {
    TEACHING("Teaching"),
    ACADEMIC_MANAGEMENT("Academic Management"),
    RESEARCH("Research"),
    INDUSTRY("Industry");

    private final String displayName;

    ExperienceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
