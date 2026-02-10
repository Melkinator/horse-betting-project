package model;

public class Stable {
    private String name;
    private Staff manager;
    private Horse[] horses;

    private int horseCount;

    public Stable(String name, int capacity, Staff manager) {
        this.name = name;
        this.manager = manager;
        this.horses = new Horse[capacity];
        this.horseCount = 0;
    }

    public void addHorse(Horse horse) {
        if (horse != null && horseCount < horses.length) {
            horses[horseCount] = horse;
            horseCount++;
        }
    }

    public Horse getHorse(int i) {
        if (i>=0&&i<horseCount) {
            return horse[index];
        }
        return null;
    }
}