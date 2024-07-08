//3 GREATER NUMBER WITH REPETITION
import java.util.Scanner;

public class java019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x > y) 
        {
            if (x > z)
                System.out.println(x + " is the greater number.");
            else
                System.out.println(z + " is the greater number.");
        } 
        else 
        {
            if (y > z)
                System.out.println(y + " is the greater number.");
            else
                System.out.println(z + " is the greater number.");
        }
    }
}
