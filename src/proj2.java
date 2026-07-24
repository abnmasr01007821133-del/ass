import java.util.Scanner;

public class proj2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] seats = new char[][]{
                {'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O'}
        };

        String[] movieNames = {"Superman", "Avatar", "Minecraft", "Inside Out", "F1"};

        while (true) {

            System.out.println("\nEnter your choice \nMain Menu\n" +
                    "1. Display Seats\n" +
                    "2. Book Seat\n" +
                    "3. Cancel Booking\n" +
                    "4. Show all movies.\n" +
                    "5. Show number of available and booked seats\n" +
                    "0. Exit ");

            int choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < seats.length; i++) {
                    for (int j = 0; j < seats[i].length; j++) {
                        System.out.print(seats[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            else if (choice == 2) {
                System.out.print("Choose your seat: ");
                int seat = sc.nextInt();

                int row = seat / 10;
                int col = seat % 10;

                if (row < 1 || row > 5 || col < 1 || col > 6) {
                    System.out.println("Invalid Seat.");
                } else {
                    row--;
                    col--;
                    if (seats[row][col] == 'X') {
                        System.out.println("This seat is already booked.");
                    } else {
                        seats[row][col] = 'X'; // بيتسجل مباشرة في نفس الـ array
                        System.out.println("Seat " + seat + " booked.");
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter seat number to cancel: ");
                int seat = sc.nextInt();

                int row = seat / 10;
                int col = seat % 10;

                if (row < 1 || row > 5 || col < 1 || col > 6) {
                    System.out.println("Invalid Seat.");
                } else {
                    row--;
                    col--;
                    seats[row][col] = 'O';
                    System.out.println("Booking cancelled for seat " + seat);
                }
            }

            else if (choice == 4) {
                for (int i = 0; i < movieNames.length; i++) {
                    System.out.println((i + 1) + ". " + movieNames[i]);
                }
            }

            else if (choice == 5) {
                int available = 0;
                int booked = 0;
                for (int i = 0; i < seats.length; i++) {
                    for (int j = 0; j < seats[i].length; j++) {
                        if (seats[i][j] == 'O') {
                            available++;
                        } else {
                            booked++;
                        }
                    }
                }
                System.out.println("Available seats: " + available);
                System.out.println("Booked seats: " + booked);
            }

            else if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid choice, try again.");
            }
        }
    }
}