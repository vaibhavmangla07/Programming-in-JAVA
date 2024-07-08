import java.util.Scanner;

public class java008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Swapping logic
        int t = a;
        a = b;
        b = t;

        System.out.println("Swapped numbers: " + a + " " + b);
    }
}

