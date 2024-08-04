import java.util.Scanner;

public class java065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number (Table to be calculated) : ");
        int n = scanner.nextInt();
        System.out.println();

        int i = 1;
        while (i <= 10) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
            i++;
        }
    }
}
