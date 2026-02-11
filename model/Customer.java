package model;

public class Customer {

    private static int customerCount = 0;

    private String customerName;
    private Horse horse;
    private double snapshotWeight;
    private boolean isBuying;

    public Customer(String customerName, Horse horse, boolean isBuying) {
        this.customerName = customerName;
        this.horse = horse;
        this.isBuying = false;
        this.snapshotWeight = horse.getWeight();
        
        customerCount++;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Horse getHorse() {
        return horse;
    }

    public boolean isBuying() {
        return isBuying;
    }

    public void setBuying(boolean buying) {
        this.isBuying = buying;
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", horse=" + horse + ", snapshotWeight=" + snapshotWeight
                + ", isBuying=" + isBuying + "]";
    }

    
}