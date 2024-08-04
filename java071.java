import java.util.Scanner;

public class java071 {
    public static void main(String[] args) {
        char another = 'y' & 'Y';
        int num;
        Scanner scanner = new Scanner(System.in);

        while (another == 'y' || another =='Y') {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            System.out.println("Square of " + num + " is " + (num * num));
            System.out.println("Cube of " + num + " is " + (num * num * num));

            System.out.print("Want to enter another number? (y/n) ");
            another = scanner.next().charAt(0);
        }
    }
}

