import java.util.*;

public class java010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter diameter of circle: ");
        float diameter = scanner.nextFloat();

        float radius = diameter / 2;
        System.out.printf("Radius of circle is %.2f\n", radius);

        float area = 3.14f * radius * radius;
        System.out.printf("Area of circle is %.2f\n", area);
    }
}

