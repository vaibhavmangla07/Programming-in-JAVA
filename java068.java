
import java.util.Scanner;

public class java068 {
    public static void main(String[] args) {
        System.err.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;
        while (n>0) 
    {
        n = n/10;
        i++;
    }
    System.out.printf("The number of the digit is %d", + i);
    }
}
