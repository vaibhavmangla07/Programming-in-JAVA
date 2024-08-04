
import java.util.Scanner;

public class java067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int cube = 0, i = 0;

            while (i < number) {
                i++;
                cube = i * i * i;
            }
                System.out.printf("cube of %d is %d%n", number, cube);
    }   
}
