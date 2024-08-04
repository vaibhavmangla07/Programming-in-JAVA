import java.util.*;

public class java078 {
    public static void main(String[] args) {
        System.out.println("Enter four number");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(a, b);
        int Max = Math.max(max, c);
        int MAX = Math.max(Max, d);

        System.out.println(MAX);



         
    }
}
