//Fibonacci
public class java050 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;

        System.out.println("The first 20 Fibonacci numbers are:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(c + " ");
            c = a + b;
            b = a;
            a = c;
        }
    }
}
