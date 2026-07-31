public class Customer {
    private int id;
    private String name;
    private String phone;
    private int rentedCarId;
    private int rentalDays;
    private double totalPaid;
    private static int count;

    public Customer(int id, String name, String phone) {

    }


    public boolean hasCar() {

        return false;
    }

    public void rentCar(int carId, int days, double cost) {

    }

    public void returnCar() {

    }

    @Override
    public String toString() {

        return "";
    }
}