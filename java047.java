//cube
import java.util.Scanner;

public class java047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int terms;

        System.out.print("Input number of terms: ");
        terms = scanner.nextInt();

        for (int i = 1; i <= terms; i++) {
            System.out.printf("Cube of %d is: %d \n",  i, i * i * i);
        }
    }
}
