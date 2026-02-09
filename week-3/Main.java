public class Main {
    public static void main(String[] args) {
        // int i = 0;
        // String s = "hi";
        // String s1 = new String("je");

        Horse h1 = new Horse(1, "Still in Love", "Thoroughbred", 500, true);
        Horse h2 = new Horse(2, "Wonder Acute", "Thoroughbred", 480, false);

        Stable stable = new Stable("Sunny Stables", 5);
        stable.addHorse(h1);
        stable.addHorse(h2);

        System.out.println("Horse in array = " + stable.horses[1].name);

        Horse found = stable.findHorseByName("Wonder Acute");
        if (found == null) {
            System.out.println("Horse not found.");
        }

        Staff staff = new Staff("Melk", 101, h1, stable);
        staff.printStaff();

        // f1 primitive copy
        int original = 5;
        int copy = original;
        copy = 10;
        System.out.println("f1: original = " + original + ", copy = " + copy);

        // f2 reference copy
        Horse refHorse = h1;
        refHorse.weight = 550;
        System.out.println("f2: h1.weight = " + h1.weight);

        // f3 array store references
        h2.name = "Neo Universe";
        System.out.println("f3: horse in the array = " + stable.horses[1].name);

        // f4 snapshot behavior
        Buyer buyer = new Buyer("John", h1, 10000);
        h1.weight = 600;
        buyer.printBuyerInfo();
    }
}