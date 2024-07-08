//(SWITCH) EVEN ODD + -
import java.util.Scanner;

public class java037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Number is positive");

            switch (a % 2) {
                case 0:
                    System.out.println("Even");
                    break;
                case 1:
                    System.out.println("Odd");
                    break;
            }
        } 
        else 
        {
            System.out.println("Number is negative");
        }
    }
}
