import java.util.Scanner;

public class devry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("What is your SAT score? ");
        int satScore = scanner.nextInt();
        if (gpa < 1.8) {
            System.out.println("You were rejected.");
        } else if (satScore < 900) {
            System.out.println("You were rejected.");
        } else {
            System.out.println("You were accepted!");
        }
        scanner.close();
    }
}