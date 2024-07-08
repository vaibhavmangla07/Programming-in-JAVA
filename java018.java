//2 GREATER NUMBER
import java.util.Scanner;

public class java018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two different numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) 
        {
            System.out.printf("%d is the greater number.%n", a);
        } 
        else 
        {
            System.out.printf("%d is the greater number.%n", b);
        }
    }
}
