import java.util.*;

public class java079 {
    public static void main(String[] args) {
        // input 153 ----> 1*1*1 + 5*5*5 + 3*3*3 = 153
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int b = n;
        int c = n;
        int arm = 0;
        int num = 0;

        while(b>0) {
            int r = b % 10;
            num += 1;
            b = b/10;
        }
        
        while (n > 0) {
            int r = n % 10;
            arm += Math.pow(r, num);
            n /= 10;
        }
        
        if (c == arm) {
            System.out.printf("%d is an armstrong number", c);
        } else {
            System.out.printf("%d is not an armstrong number", c);
        }
    }
}

