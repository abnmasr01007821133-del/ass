import java.util.Scanner;

class proj1  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[][] grades = new int[5][3];

        while (true) {

            System.out.println("enter your choice \n" +
                    "1. Show All Students names\n" +
                    "2. Show all Students grades in each subject.\n" +
                    "3. Search Student by name.\n" +
                    "4. Count Passed Students\n" +
                    "0. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("ENTER STUDENT NAME");
                    names[i] = sc.next();
                }
                for (int t = 0; t < 5; t++) {
                    System.out.println("STUDENTS NAME" + ":" + names[t]);
                }

            } else if (choice == 2) {
                for (int j = 0; j < 5; j++) {
                    for (int a = 0; a < 3; a++) {

                        int grade = -1;
                        while (true) {
                            System.out.print("Enter grade for subject " + (a + 1) +
                                    " for student " + names[j] + ": ");
                            grade = sc.nextInt();

                            if (grade < 0 || grade > 100) {
                                System.out.println("Invalid grade.");
                            } else {
                                break;
                            }
                        }

                        grades[j][a] = grade;
                    }
                }


                for (int r = 0; r < 5; r++) {
                    for (int e = 0; e < 3; e++) {
                        System.out.println(names[r] + " grade in subject " + (e + 1) + " is " + grades[r][e]);
                    }
                }

            } else if (choice == 3) {
                System.out.println("enter student name");
                String search = sc.next();
                boolean found = false;

                for (int s = 0; s < names.length; s++) {
                    if (names[s].equalsIgnoreCase(search)) {
                        System.out.println("student name is available");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("the student not found");
                }

            } else if (choice == 4) {
                int count = 0;
                for (int i = 0; i < 5; i++) {
                    int sum1 = grades[i][0] + grades[i][1] + grades[i][2];
                    double avr = (double) sum1 / 3;
                    if (avr >= 50) {
                        count++;
                    }
                }
                System.out.println("the number of passed students is " + count);

            } else if (choice == 0) {
                System.out.println("EXIT");
                break;

            } else {
                System.out.println("INVALID");
            }

        }
    }
}
