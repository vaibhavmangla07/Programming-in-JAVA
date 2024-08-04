import java.util.Scanner;

public class java064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the number (Table to be calculated) : ");
        int n = scanner.nextInt();
        System.out.println();

        int j = 1;
        while (j <= 10) 
        {
            int m = n * j;
            System.out.println(m);
            j++;
        }
    }
}
