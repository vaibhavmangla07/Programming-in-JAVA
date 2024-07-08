//GRADES OF STUDENTS
import java.util.Scanner;

public class java029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int a = scanner.nextInt();

        if (a < 40) 
        {
            System.out.println("fail");
        }
         else if (a >= 40 && a < 50) 
        {
            System.out.println("Third");
        } 
        else if (a >= 50 && a < 60) 
        {
            System.out.println("Second");
        } 
        else if (a >= 60 && a < 80) 
        {
            System.out.println("First");
        } 
        else 
        {
            System.out.println("Merit");
        }
    }
}
