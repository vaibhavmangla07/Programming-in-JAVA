//UPPER LOWER CASE SYMBOL AND DIGIT CHECK
import java.util.Scanner;

public class java031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') 
        {
            System.out.println("Uppercase");
        } 
        else if (ch >= 'a' && ch <= 'z') 
        {
            System.out.println("Lowercase");
        } 
        else if (ch >= '0' && ch <= '9') 
        {
            System.out.println("Digit Numbers");
        } 
        else 
        {
            System.out.println("Special Symbol");
        }
    }
}
