//QUADRATIC EQUATIONS
import java.util.Scanner;

public class java026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the values of a, b, c: ");
        
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float d = b * b - 4 * a * c;

        if (d > 0) 
        {
            float r1 = (-b + (float)Math.sqrt(d)) / (2 * a);
            float r2 = (-b - (float)Math.sqrt(d)) / (2 * a);
            
            System.out.printf("The real roots = %f %f", r1, r2);
        }
        else if (d == 0) 
        {
            float r1 = -b / (2 * a);
            float r2 = -b / (2 * a);
            
            System.out.printf("Roots are equal = %f %f", r1, r2);
        } 
        else 
        {
            System.out.println("Roots are imaginary");
        }
    }
}
