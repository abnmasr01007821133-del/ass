import java.util.Scanner;

class studnt {
    @Override
    public String toString() {
        return "studnt{" +
                "name='" + name + '\'' +
                '}';
    }

    String name;
    private int id;
    double grade;

    studnt(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    studnt(double grade) {
        this.grade = grade;
    }
}

class main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of Student");
        int n = sc.nextInt();
        studnt[] names = new studnt[n];
        studnt[] grades = new studnt[n];

        while (true) {

            System.out.println("1. Display Students\n" +
                    "2. Calculate Average Grade\n" +
                    "3. Find Highest Grade\n" +
                    "4. Search Student by ID\n" +
                    "0. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {

                for (int i = 0; i < n; i++) {
                    System.out.println("ENTER STUDENT NAME");
                    String name = sc.next();
                    System.out.println("ENTER STUDENT grade");
                    double grade = sc.nextDouble();
                    System.out.println("ENTER STUDENT ID");
                    int id = sc.nextInt();
                    names[i] = new studnt(name, id, grade);
                }

                for (int t = 0; t < n; t++) {
                    System.out.println("STUDENTS detals" + ":" + names[t]);
                }

            } else if (choice == 2) {

                int count = 0;
                int avv = 0;
                for (int j = 0; j < n; j++) {
                    double grade = names[j].grade;
                    if (grade > 50) {
                        count++;
                        avv = count / n;
                        System.out.println("Avvrage student graduate is" + avv);
                    }
                }

            } else if (choice == 3) {

                int max = 0;
                for (int j = 0; j < n; j++) {
                    double grade = names[j].grade;
                    if (grade > max) {
                        max = (int) grade;
                    } else {
                        System.out.println("Highest Gradeis" + ":" + grade);
                    }
                }

            } else if (choice == 4) {

                int search = 0;
                boolean found = false;
                System.out.println("ENTER STUDENT ID");
                search = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    if (names[i].getId() == search) {
                        System.out.println("student is found");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("student not found");
                }

            } else if (choice == 0) {
                System.out.println("EXIT");
                break;

            } else {
                System.out.println("INVALID");
            }
        }
    }
}