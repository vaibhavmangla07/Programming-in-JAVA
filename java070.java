import java.util.Scanner;

public class java070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        
        int n = scanner.nextInt();
        System.out.print("Natural numbers in reverse order: ");

        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }
}