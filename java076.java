import java.util.Scanner;

public class java076{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int c = n;
        int s = 0;
        
        while (n > 0) {
            int r = n % 10;
            s = r + (s * 10);
            n /= 10;
        }
        
        if (c == s) {
            System.out.printf("%d is a palindrome number", c);
        } else {
            System.out.printf("%d is not a palindrome number", c);
        }
    }
}

