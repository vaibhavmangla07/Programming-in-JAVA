//sum of n natural no.
import java.util.Scanner;

public class java041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, s = 0;

        System.out.print("Input Value of terms: ");
        n = scanner.nextInt();

        System.out.println("\nThe first " + n + " natural numbers are:");

        for (int i = 1; i <= n; i++) 
        {
            System.out.print(i + " ");
            s += i;
        }

        System.out.println("\nThe Sum of natural numbers up to " + n + " terms: " + s);
    }
}
