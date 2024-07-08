//SWITCH CASE QUATER OF MONTHS
import java.util.Scanner;

public class java038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("1st Quarter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2nd Quarter");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3rd Quarter");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4th Quarter");
                break;
            default:
                System.out.println("Invalid input! Please enter a month number between 1-12.");
        }
    }
}
