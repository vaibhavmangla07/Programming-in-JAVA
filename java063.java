//sum and mean
public class java063 {
    public static void main(String[] args) {
        int i = 1, s = 0, m = 0;
        System.out.println("The first 10 natural numbers are:");

        while (i <= 10) {
            System.out.print(i + " ");
            s = s + i;
            i++;
        }

        System.out.println("\nThe Sum is : " + s);
        m = s / 10;
        System.out.println("The mean is : " + m);
    }
}