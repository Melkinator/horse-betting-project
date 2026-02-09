public class Stable {
    String stableName;
    Horse[] horses;
    int horseCount;
    int capacity;

    Stable(String stableName, int capacity) {
        this.stableName = stableName;
        this.capacity = capacity;
        horses = new Horse[capacity];
        horseCount = 0;
    }

    void addHorse(Horse h) {
        if (horseCount < capacity) {
            horses[horseCount] = h;
            horseCount++;
        }
    }

    Horse findHorseByName(String name) {
        for (int i = 0; i < horseCount; i++) {
            if (horses[i].name.equals(name)) {
                return horses[i];
            }
        }
        return null;
    }
}
