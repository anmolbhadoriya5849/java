import java.util.Scanner;
public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius: ");
        int choice = sc.nextInt();

        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            System.out.printf("Temperature in Fahrenheit:" +  (temp * 9 / 5) + 32);
        } else if (choice == 2) {
            System.out.printf("Temperature in Celsius:" + (temp - 32) * 5 / 9);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

