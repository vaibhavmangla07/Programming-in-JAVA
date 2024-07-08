import java.util.Scanner;

public class java013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = scanner.nextInt();

        System.out.print("Enter time: ");
        int time = scanner.nextInt();

        int distance = speed * time;
        System.out.println("The distance traversed is " + distance);
    }
}
