public class Staff {
    String staffName;
    int staffId;
    Horse assignedHorse;
    Stable workplace;

    Staff(String staffName, int staffId, Horse assignedHorse, Stable workplace) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.assignedHorse = assignedHorse;
        this.workplace = workplace;
    }

    

    @Override
    public String toString() {
        return "Staff [staffName=" + staffName + ", staffId=" + staffId + ", assignedHorse=" + assignedHorse
                + ", workplace=" + workplace + "]";
    }



    void printStaff() {
        System.out.println(staffName + " cares for " + assignedHorse.name +
                " at " + workplace.stableName);
    }
}
