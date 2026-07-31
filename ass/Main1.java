import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_CARS = 20;
        final int MAX_CUSTOMERS = 20;

        Car[] cars = new Car[MAX_CARS];
        Customer[] customers = new Customer[MAX_CUSTOMERS];
        int carCount = 0;
        int customerCount = 0;

        boolean running = true;

        while (running) {
            System.out.println(
                    "========================================\n" +
                            " SPEEDWAY RENTALS SYSTEM\n" +
                            "========================================\n" +
                            "1. Add Regular Car\n" +
                            "2. Add Luxury Car\n" +
                            "3. Add Customer\n" +
                            "4. Display All Cars\n" +
                            "5. Display Available Cars\n" +
                            "6. Rent a Car\n" +
                            "7. Return a Car\n" +
                            "8. Search Car by ID\n" +
                            "9. Search Car by Brand\n" +
                            "10. Display All Customers\n" +
                            "11. Display Statistics\n" +
                            "0. Exit\n" +
                            "========================================\n" +
                            "Enter your choice:"
            );

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (carCount >= MAX_CARS) {
                        System.out.println("Error: Fleet is full.");
                        break;
                    }
                    System.out.print("Enter Car ID: ");
                    int id1 = sc.nextInt();
                    System.out.print("Enter Brand: ");
                    String brand1 = sc.next();
                    System.out.print("Enter Model: ");
                    String model1 = sc.next();
                    System.out.print("Enter Year: ");
                    int year1 = sc.nextInt();
                    System.out.print("Enter Price Per Day: ");
                    double price1 = sc.nextDouble();
                    cars[carCount] = new Car(id1, brand1, model1, year1, price1);
                    carCount++;
                    System.out.println("Car added successfully with ID: " + id1);
                    break;

                case 2:
                    if (carCount >= MAX_CARS) {
                        System.out.println("Error: Fleet is full.");
                        break;
                    }
                    System.out.print("Enter Car ID: ");
                    int id2 = sc.nextInt();
                    System.out.print("Enter Brand: ");
                    String brand2 = sc.next();
                    System.out.print("Enter Model: ");
                    String model2 = sc.next();
                    System.out.print("Enter Year: ");
                    int year2 = sc.nextInt();
                    System.out.print("Enter Price Per Day: ");
                    double price2 = sc.nextDouble();
                    System.out.print("Enter Insurance Fee: ");
                    double insurance2 = sc.nextDouble();


                    cars[carCount] = new LuxuryCar(id2, brand2, model2, year2, price2, insurance2);
                    carCount++;
                    System.out.println("Luxury car added successfully with ID: " + id2);
                    break;

                case 3:
                    if (customerCount >= MAX_CUSTOMERS) {
                        System.out.println("Error: Customer list is full.");
                        break;
                    }
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Phone: ");
                    String phone = sc.next();


                    customers[customerCount] = new Customer(cid, name, phone);
                    customerCount++;
                    System.out.println("Customer added: " + name);
                    break;

                case 4:
                    if (carCount == 0) {
                        System.out.println("No cars in the fleet.");
                        break;
                    }
                    for (int i = 0; i < carCount; i++) {
                        System.out.println((i + 1) + ". " + cars[i]);

                    }
                    break;

                case 5:
                    break;

                case 6:

                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 0:
                    running = false;
                    System.out.println("Goodbye! Total Cars: " + carCount +
                            ", Total Customers: " + customerCount);
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        sc.close();
    }
}