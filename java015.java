//+, -, *, /
import java.util.Scanner;

public class java015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Check if b is not zero to avoid division by zero
        if (b != 0) {
            System.out.printf("a / b = %.2f\n", (float) a / b);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
