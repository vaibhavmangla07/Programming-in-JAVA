//(SWITCH) ODD EVEN
import java.util.Scanner;

public class java035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = scanner.nextInt();

        switch (a % 2) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }
}
