//SUM OF EVEN AND ODD
public class java043 {
    public static void main(String[] args) {
        int s = 0;

        System.out.print("The even numbers are: ");
        
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            s += i;
        }

        System.out.println("\nThe Sum of 10 even Natural Numbers: " + s);

        int sum = 0;

        System.out.println("The odd numbers are: ");
        
        for (int j = 1; j <= 20; j += 2) {
            System.out.print(j + " ");
            sum += j;
        }

        System.out.println("\n\nThe Sum of 10 odd Natural Numbers: " + sum);
    }
}
