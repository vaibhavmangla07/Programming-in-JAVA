//multiplier table vertically
import java.util.Scanner;

public class java048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Input up to the table number starting from 1 to: ");
        n = scanner.nextInt();

        System.out.printf("Multiplication table from 1 to %d\n", n);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%dx%d = %d, ", j, i, i * j);
            }
            System.out.println();
        }
    }
}
