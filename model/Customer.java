package model;

public class Customer {

    private static int customerCount = 0;

    private String customerName;
    private Horse horse;
    private double snapshotWeight;
    private double budget;

    public Customer(String customerName, Horse horse, double budget) {
        this.customerName = customerName;
        this.horse = horse;
        this.budget = budget;
        this.snapshotWeight = horse.weight;
        
        customerCount++;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public String getCutomerName() {
        return customerName;
    }

    public Horse getHorse() {
        return horse;
    }

    public double getBudget() {
        return budget;
    }

         void setBudget(double budget) {
        if (budget > 0) {  
            this.budget = budget;
        }
    }

        void printCustomerInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Horse weight at purchase time: " + snapshotWeight);
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", horse=" + horse + ", snapshotWeight=" 
                + snapshotWeight + ", budget=" + budget + "]";
    }
}