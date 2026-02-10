package model;

public class Staff {
    private int id;
    private String name;
    private String role;

    private static int staffCounter=0;

    public Staff(String name, String role) {
        staffCounter++;
        this.id = staffCounter;
        this.name = name;
        this.role = role;
    }

    public int getStaffCounter() {
        return staffCounter;
    }

    public String getName() {
        return name;
    }
}