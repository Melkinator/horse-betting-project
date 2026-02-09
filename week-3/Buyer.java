public class Buyer {
    String buyerName;
    Horse horse;
    double snapshotWeight;
    double budget;

    Buyer(String buyerName, Horse horse, double budget) {
        this.buyerName = buyerName;
        this.horse = horse;
        this.budget = budget;

        // SNAPSHOT (primitive copy)
        snapshotWeight = horse.weight;
    }

    void printBuyerInfo() {
        System.out.println("Buyer: " + buyerName);
        System.out.println("Horse weight at purchase time: " + snapshotWeight);
    }
}
