package com.kadriev;

/**
 * Created by Aqru on 06.12.2016.
 * Unit class
 */
public class Unit {
    private String name; // unit name
    private UnitType type; // type of unit

    /**
     * @return unit name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name of unit
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return unit type
     */
    public UnitType getType() {
        return type;
    }

    /**
     * @param type unit type
     */
    public void setType(UnitType type) {
        this.type = type;
    }

    /**
     * @param name unit name
     * @param type unit type
     */
    public Unit(String name, UnitType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }
}
