//sum of even number
public class java061 {
    public static void main(String[] args) {
        int i = 2, s = 0;

        System.out.print("The first 10 even numbers are ");

        while (i <= 20) {
            System.out.print(i + " ");
            s = s + i;
            i = i + 2;
        }

        System.out.println("\nSum of first 10 even numbers are " + s);
    }
}
