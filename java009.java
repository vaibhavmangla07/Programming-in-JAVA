import java.util.Scanner;

public class java009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a + b + c + d + e;
        System.out.println("Sum of five numbers is: " + sum);

        int mean = sum / 5;
        System.out.println("Mean of five numbers is: " + mean);
    }
}

