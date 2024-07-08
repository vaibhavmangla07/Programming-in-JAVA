//4 GREATER NUMBER WITHOUT REPETITION
import java.util.Scanner;

public class java023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a > b && a > c && a > d) 
        {
            System.out.println(a + " is the greater no.");
        } 
        else if (b > c && b > d) 
        {
            System.out.println(b + " is the greater no.");
        } 
        else if (c > d)
        {
            System.out.println(c + " is the greater no.");
        }
        else 
        {
            System.out.println(d + " is the greater no.");
        }
    }
}
