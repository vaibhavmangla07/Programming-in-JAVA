//DISCOUNT %
import java.util.Scanner;

public class java027 {
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
        }
        else if (a >= 2500 && a < 5000) 
        {
            System.out.println("30%");
        } 
        else if (a >= 5000 && a < 10000) 
        {
            System.out.println("50%");
        } 
        else 
        {
            System.out.println("60%");
        }
    }
}

