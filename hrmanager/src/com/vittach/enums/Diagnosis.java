package com.vittach.enums;

/**
 * Created by VITTACH on 22.10.2016.
 */
public enum Diagnosis {
    GRIPP("вирус гриппа"),
    ANGINA("ангина"),
    APPENDICITIS("воспаление аппендикса");

    private final String name;

    @Override
    public String toString() {
        return name;
    }

    Diagnosis(String n) {
        this.name=n;
    }
}
