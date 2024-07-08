//4 GREATER NUMBER WITH REPETITION
import java.util.Scanner;

public class java020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();

        if (i > j) 
        {
            if (i > k) 
            {
                if (i > l)
                    System.out.println(i + " is the greater number.");
                else
                    System.out.println(l + " is the greater number.");
            }
        } 
        else 
        {
            if (j > k) 
            {
                if (j > l)
                    System.out.println(j + " is the greater number.");
                else
                    System.out.println(l + " is the greater number.");
            }
        }
        
        if (k > l)
            System.out.println(k + " is the greater number.");
        else
            System.out.println(l + " is the greater number.");
    }
}
