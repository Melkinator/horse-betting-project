import model.Horse;
import model.Horse.Gender;
import model.Customer;
import model.Stable;
import model.Staff;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Horse uma1 = new Horse("Wonder Acute", "Thoroughbred", "Brown", Gender.GELDING, LocalDate.now(), LocalDate.now(), 1, "idk", "idk", 120, 120);
        Staff manager = new Staff("John", "caretaker");
        Stable stable = new Stable("Horse Stable", 10, manager);

        stable.addHorse(uma1);
        Customer c1 = new Customer("Melk", uma1, false);

        // f1 primitive copy
        boolean originalBuyingStatus = c1.isBuying();
        boolean buyingCopy = originalBuyingStatus;
        originalBuyingStatus = true;
        System.out.println("Original: " + originalBuyingStatus + "\nCopy: " + buyingCopy);

        // f2 reference copy
        uma1.setName("Kitasan Black");
        System.out.println("reference copy: " + c1.toString());

        // f3 array stores references
        Horse uma2 = stable.getHorse(0);
        if (uma2!=null) {
            uma2.setColor("White");
            System.out.println("Array reference check: Original horse color is now: " + uma1.getColor());
        }

        // f4 snapsnot behavior
        uma1.setWeight(700);
        System.out.println("Current horse weight is: " + uma1.getWeight());
        System.out.println(c1.toString());
    }
}