//SIMPLE TABLE
import java.util.Scanner;

public class java044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Input the number (Table to be calculated): ");
        n = scanner.nextInt();

        System.out.println();

        for (int j = 1; j <= 10; j++) 
        {
            int m = n * j;
            System.out.println(m);
        }
    }
}
