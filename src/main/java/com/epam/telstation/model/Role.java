package com.epam.telstation.model;

public enum Role {
    ADMINISTRATOR("ADMIN"),USER("USER");

    private final String name;

     Role(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
