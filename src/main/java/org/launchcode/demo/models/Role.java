package org.launchcode.demo.models;

public enum Role {
    STANDARD("Standard"),
    TECHNICIAN("Technician"),
    ADMIN("Administrator");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
