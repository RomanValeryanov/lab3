package com.kadriev;
/**
 * Implementation methods and data generation.
 * Created by Aqru on 06.12.2016.
 */
public class MainClass {
    private static Room[] rooms;
    private static Unit[] units;

    /**
     * Generate some random rooms.
     * @param numberOfRooms number of rooms to generate.
     */
    public static void generateData(int numberOfRooms) {
        Gen generator = new Gen();
        units = generator.getUnits();
        rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++)
            rooms[i] = generator.getRoom();
    }

    /**
     * Printing rooms of specific unit.
     *
     * @param unit which unit rooms print.
     */
    public static void getRoomNamesByUnit(Unit unit) {
        System.out.println(unit);
        for (Room room : rooms) {
            Unit u = room.getUnit();
            if (u == unit)
                System.out.print(room + " | ");
        }
        System.out.println("");
    }

    /**
     * Get area of some room type rooms.
     * @param type type of room.
     * @return area of some room type rooms.
     */
    public static float getAreaByRoomType(RoomType type){
        float result = 0;
        for (Room room : rooms) {
            RoomType t = room.getType();
            if (t == type)
                result += room.getArea();
        }
        System.out.println(type + " area is - " + result);
        return result;
    }

    /**
     * Get sum of seats numbers in all units rooms.
     * @param unit unit.
     * @return number of seats in that unit.
     */
    public static int getNumOfSeatsByUnit(Unit unit){
        int result = 0;
        for (Room room : rooms) {
            Unit u = room.getUnit();
            if (u == unit)
                result += room.getNumberOfSeats();
        }
        return result;
    }

    /**
     * Main method
     * @param args []
     */
    public static void main(String[] args){
        generateData(100); // generate 100 random rooms
        for (Unit unit : units) // get all room names in every units
            getRoomNamesByUnit(unit);
        float sumArea = 0;
        for (RoomType type : RoomType.values()) // get area by room types
            sumArea += getAreaByRoomType(type);
        System.out.println("All area is - " + sumArea);
        for (Unit unit : units) // get seats num by unit
            System.out.println(getNumOfSeatsByUnit(unit) + " seats in " + unit);
    }
}