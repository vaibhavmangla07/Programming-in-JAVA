//(SWITCH) CALCULATOR
import java.util.Scanner;

public class java034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an operator (1=+), (2=-), (3=/), (4=*)");
        char ch = scanner.next().charAt(0);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;

        switch (ch) {
            case '1':
                c = a + b;
                System.out.println("Addition of two numbers is " + c);
                break;
            case '2':
                c = a - b;
                System.out.println("Subtraction of two numbers is " + c);
                break;
            case '3':
                if (b != 0) {
                    c = a / b;
                    System.out.println("Division of two numbers is " + c);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            case '4':
                c = a * b;
                System.out.println("Multiplication of two numbers is " + c);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
