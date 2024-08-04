//Tribonacci
public class java051 {
    public static void main(String[] args) {
        long a = 0, b = 1, c = 1, d;

        System.out.print("The first 20 Tribonacci numbers are: 0 1 1 ");

        for (int i = 0; i < 20; i++) {
            d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}
