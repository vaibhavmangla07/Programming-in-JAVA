//5 GREATER NUMBER WITH REPETITION
import java.util.Scanner;

public class java021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        if (a > b) 
        {
            if (a > c) 
            {
                if (a > d) 
                {
                    if (a > e)
                        System.out.println(a + " is the greater no.");
                    else
                        System.out.println(e + " is the greater no.");
                }
            }
        }

        if (b > c) 
        {
            if (b > d) 
            {
                if (b > e)
                    System.out.println(b + " is the greater no.");
                else
                    System.out.println(e + " is the greater no,");
            }
        }

        if (c > d) 
        {
            if (c > e)
                System.out.println(c + " is the greater no.");
            else
                System.out.println(e + " is the greater no.");
        }

        if (d > e)
            System.out.println(d + " is the greater no.");
        else
            System.out.println(e + " is the greater no.");
    }
}
