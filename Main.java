import model.Horse;
import model.Horse.Gender;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Horse uma = new Horse("Wonder Acute", "Thoroughbred", "Brown", Gender.GELDING, LocalDate.now(), LocalDate.now(), 1, "idk", "idk", 120, 120);

       uma.printInfo();
    }
}