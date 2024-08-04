//SumOfNaturalNumbers
import java.util.Scanner;

public class java058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Value of terms : ");
        int n = scanner.nextInt();
        System.out.println("The first " + n + " natural numbers are:");

        int i = 1;
        int s = 0;

        while (i <= n) {
            System.out.print(i + " ");
            s += i;
            i++;
        }
        System.out.println("\nThe Sum of first " + n + " numbers are : " + s);
    }
}
