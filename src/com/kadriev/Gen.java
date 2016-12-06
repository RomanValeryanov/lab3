package com.kadriev;

import java.util.Random;

/**
 * Data generator
 * Created by Aqru on 06.12.2016.
 */
public class Gen {

    private static int unitsCount = 6; // Count of Units
    private static int roomTypeCount = RoomType.values().length; // Count of RoomTypes.
    private static int maxRoomArea = 150; // Max value of Rooms area.
    private static int maxNumOfSeats = 100; // Max number of seats in room.
    private static Unit[] units; // Out Units, used for room generation.
    private int nameCount = 0; // Used for name generation for rooms.
    private Random r = new Random(System.currentTimeMillis());

    /**
     * @param maxRoomArea max rooms area.
     */
    public static void setMaxRoomArea(int maxRoomArea) {
        Gen.maxRoomArea = maxRoomArea;
    }

    /**
     * @param maxNumOfSeats max number of seats in room.
     */
    public static void setMaxNumOfSeats(int maxNumOfSeats) {
        Gen.maxNumOfSeats = maxNumOfSeats;
    }

    /**
     * @return Units[] for further use in rooms generation.
     */
    public Unit[] getUnits(){
        units = new Unit[unitsCount];
        units[0] = new Unit("1 housing", UnitType.EDUCATION);
        units[1] = new Unit("2 housing", UnitType.EDUCATION);
        units[2] = new Unit("3 housing", UnitType.EDUCATION);
        units[3] = new Unit("university administration", UnitType.ADMINISTRATION);
        units[4] = new Unit("staff library", UnitType.STUFF);
        units[5] = new Unit("laboratory", UnitType.LAB);
        return units;
    }

    /**
     * @return random RoomType
     */
    private RoomType getRoomType(){
        int roomTypeNumber = r.nextInt(roomTypeCount);
        return RoomType.values()[roomTypeNumber];
    }

    /**
     * @return return random area.
     */
    private float getArea(){
        return r.nextInt(maxRoomArea);
    }

    /**
     * @return random number of seats.
     */
    private int getNumOfSeats(){
        return r.nextInt(maxNumOfSeats);
    }

    /**
     * @return random unit.
     */
    private Unit getUnit(){
        return units[r.nextInt(unitsCount)];
    }

    /**
     * @return return new random room.
     */
    public Room getRoom(){
        String name = String.valueOf("room "+nameCount++);
        RoomType type = getRoomType();
        float area = getArea();
        int numOfSeats = getNumOfSeats();
        Unit unit = getUnit();
        return new Room(name, type, area, unit, numOfSeats);
    }
}
