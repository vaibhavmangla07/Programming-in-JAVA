//DISCOUNT WITH CALCULATIONS
import java.util.Scanner;

public class java028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to get discount: ");
        int a = scanner.nextInt();

        if (a < 1000) 
        {
            System.out.println("no discount");
        } 
        else if (a >= 1000 && a < 2500) 
        {
            System.out.println("15%");
            int b = (int)(a * 0.15);
            System.out.println(b);
        }
        else if (a >= 2500 && a < 5000) 
        {
            System.out.println("30%");
            int c = (int)(a * 0.30);
            System.out.println(c);
        }
        else if (a >= 5000 && a < 10000) 
        {
            System.out.println("50%");
            int d = (int)(a * 0.50);
            System.out.println(d);
        }
        else 
        {
            System.out.println("60%");
            int e = (int)(a * 0.60);
            System.out.println(e);
        }
    }
}
