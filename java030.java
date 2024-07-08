//CHECK CONSONANT OR VOWEL
import java.util.Scanner;

public class java030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {
            System.out.println("Alphabet is a vowel.");
        } 
        else 
        {
            System.out.println("Alphabet is a consonant.");
        }
    }
}
