public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private double pricePerDay;
    private boolean available;
    private static int carCount;
    private static final double taxRate = 0.14;

    public Car(int id, String brand, String model, int year, double pricePerDay) {
    }


    public int getId() { return id; }


    public boolean isAvailable() {
        return false;
    }

    public void setAvailable(boolean available) {
    }

    public static int getCarCount() {
        return 0;
    }

    public double calculateRentCost(int days) {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}