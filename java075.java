import java.util.Scanner;

public class java075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, n, s = 0, count = 0, m = 0;

        while (a == 1) {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();

            s += n;
            count++;
            m = s / count;

            System.out.print("To enter another number, press 1 / To stop, press 0: ");
            a = scanner.nextInt();
        }

        System.out.println("Sum is " + s);
        System.out.println("Mean is " + m);
    }
}
