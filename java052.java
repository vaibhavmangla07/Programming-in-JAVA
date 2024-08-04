//LCMCalculator
import java.util.Scanner;

public class java052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int lcm = 0; // Variable to hold the LCM

        for (int i = 1; i <= x * y; i++) {
            if (i % x == 0 && i % y == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM is " + lcm);
    }
}
