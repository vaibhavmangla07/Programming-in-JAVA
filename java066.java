import java.util.Scanner;

public class java066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sq = 0;
        int i = 1;

        while (i < n) {
            i++;
            sq = i * i;
        }
        System.out.printf("Square of %d is %d%n", n, sq);
    }
}
