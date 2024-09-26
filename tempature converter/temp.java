import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("temp: ");
        double degrees = scanner.nextDouble();
        System.out.println("starting scale: ");
        System.out.println("1: Fahrenheit");
        System.out.println("2: Celsius");
        System.out.println("3: Kelvin");
        int firstChoice = scanner.nextInt();
        System.out.println("ending scale: ");
        System.out.println("1: Fahrenheit");
        System.out.println("2: Celsius");
        System.out.println("3: Kelvin");
        int secondChoice = scanner.nextInt();
        double convertedDegrees = 0.0;

        if (firstChoice == 1) {
            if (secondChoice == 1) {
                convertedDegrees = degrees;
            } else if (secondChoice == 2) {
                convertedDegrees = (degrees - 32) * (5.0 / 9.0);
            } else if (secondChoice == 3) {
                convertedDegrees = (degrees - 32) * (5.0 / 9.0) + 273.15; 
            }
        } else if (firstChoice == 2) {
            if (secondChoice == 1) {
                convertedDegrees = (degrees * 9.0 / 5.0) + 32;
            } else if (secondChoice == 2) {
                convertedDegrees = degrees; 
            } else if (secondChoice == 3) {
                convertedDegrees = degrees + 273.15;
            }
        } else if (firstChoice == 3) { 
            if (secondChoice == 1) {
                convertedDegrees = (degrees - 273.15) * (9.0 / 5.0) + 32;
            } else if (secondChoice == 2) {
                convertedDegrees = degrees - 273.15;
            } else if (secondChoice == 3) {
                convertedDegrees = degrees; 
            }
        } else {
            System.out.println("this is not a valid choice, please run the program again and choose more wisely");
            return;
        }
        System.out.printf("temp: is: %.2f degrees.\n", convertedDegrees);
    }
}