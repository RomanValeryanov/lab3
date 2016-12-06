package com.kadriev;
/**
 * Created by Aqru on 06.12.2016.
 * Room class
 */
public class Room {
    private String name; // name or number of room
    private RoomType type; // type of room
    private float area; // area of room
    private Unit unit; // unit of room
    private int numberOfSeats; // number of seats in room

    /**
     * @return name of room
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name of room
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return type of room
     */
    public RoomType getType(){
        return type;
    }

    /**
     * @param type type of room
     */
    public void setType(RoomType type) {
        this.type = type;
    }

    /**
     * @return room area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area room area
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return room unit
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * @param unit unit of room
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    /**
     * @return number of seats in room
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * @param numberOfSeats numbers of seats in room
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * @param name name of room
     * @param type type of room
     * @param area room area
     * @param unit room unit
     * @param numberOfSeats numbers of seats in room
     */
    public Room(String name, RoomType type, float area, Unit unit, int numberOfSeats) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.unit = unit;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return name;
    }
}