//3 GREATER NUMBER WITHOUT REPETITION
import java.util.Scanner;

public class java022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x > y && x > z) 
        {
            System.out.println(x+ " is the greater no.");
        } 
        else if (y > z) 
        {
            System.out.println(y+ " is the greater no.");
        } 
        else 
        {
            System.out.println(z+ " is the greater no.");
        }
    }
}
