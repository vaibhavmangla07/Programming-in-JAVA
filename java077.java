import java.util.*;

public class java077 {
    public static void main(String[] args) {
        System.out.println("Enter three number");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, b);
        int MAX = Math.max(max, c);
        System.out.println(MAX);



         
    }
}
