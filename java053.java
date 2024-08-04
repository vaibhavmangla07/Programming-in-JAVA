//HCF
import java.util.Scanner;

public class java053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int hcf = 0; // Variable to hold the HCF

        for (int i = (x > y ? x : y); i > 0; i--) 
        {
            if (x % i == 0 && y % i == 0) 
            {
                hcf = i;
                break;
            }
        }
        System.out.println("HCF is " + hcf);
    }
}
