//5 GREATER NUMBER WITHOUT REPETITION
import java.util.Scanner;

public class java024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        if (a > b && a > c && a > d && a > e) 
        {
            System.out.println(a + " is the greater no.");
        } 
        else if (b > c && b > d && b > e) 
        {
            System.out.println(b + " is the greater no.");
        } 
        else if (c > d && c > e)
        {
            System.out.println(c + " is the greater no.");
        }
        else if (d > e)
        {
            System.out.println(d + " is the greater no.");
        }
        else 
        {
            System.out.println(e + " is the greater no.");
        }
    }
}
