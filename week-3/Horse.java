public class Horse {
    int id;
    String name;
    String breed;
    double weight;
    boolean forSale;

    Horse(int id, String name, String breed, double weight, boolean forSale) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.forSale = forSale;
    }

    void printHorse() {
        System.out.println("Horse: " + name + ", Breed: " + breed + ", Weight: " + weight);
    }
}
