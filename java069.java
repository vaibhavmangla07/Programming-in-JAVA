import java.util.Scanner;

public class java069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int s = 0;
        while (n > 0) {
            int i = n % 10;
            s = s + i;
            n = n / 10;
        }
        
        System.out.println("The sum of digits is: " + s);
    }
}

