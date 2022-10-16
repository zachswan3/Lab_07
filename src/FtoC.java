import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {

        double tempC;
        double tempF;
        Scanner scanner = new Scanner(System.in);
        String trash;

        System.out.println("Please enter your temperature in C");

        if (scanner.hasNextDouble()) {
            tempC = scanner.nextDouble();
            tempF = tempC * 1.8 + 32;
            System.out.println("Your temperature in F is " + tempF);
        } else {
            trash = scanner.nextLine();
            System.out.println("You have entered an invalid number please try again. " + trash);
        }
        System.out.println("Please enter your value again");
        if (scanner.hasNextDouble()) {
            tempC = scanner.nextDouble();
            tempF = tempC * 1.8 + 32;
            System.out.println("Your temperature in F is " + tempF);
        }
    }
}
