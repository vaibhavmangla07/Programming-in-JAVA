//FACTORIAL
import java.util.Scanner;

public class java049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long i, n, f = 1;

        System.out.print("Enter a number: ");
        n = scanner.nextLong();

        for (i = 1; i <= n; i++) 
        {
            System.out.print(i + " ");
            f = f * i;
        }

        System.out.printf("\nThe factorial of %d is: %d\n", n, f);
    }
}
