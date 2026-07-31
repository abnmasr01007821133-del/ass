public class LuxuryCar extends Car {
    private double insuranceFee;
    private final int minRentalDays = 3;

    public LuxuryCar(int id, String brand, String model, int year, double pricePerDay, double insuranceFee) {
        super(id, brand, model, year, pricePerDay);

    }

    public double getInsuranceFee() {

        return 0;
    }

    public int getMinRentalDays() {

        return 0;
    }


    @Override
    public double calculateRentCost(int days) {
        return 0;
    }
}