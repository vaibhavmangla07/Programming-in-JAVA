import java.util.*;

public class java011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter rate of interest: ");
        float rate = scanner.nextFloat();

        System.out.print("Enter time taken: ");
        float time = scanner.nextFloat();

        // Calculate simple interest
        float simpleInterest = (principal * rate * time) / 100;
        System.out.printf("Simple interest is %.2f\n", simpleInterest);

        // Calculate amount payable
        float amountPayable = principal + simpleInterest;
        System.out.printf("Amount payable is %.2f\n", amountPayable);
    }
}

