
import java.util.Scanner;

public class Cuarteros_ITB_Palindrome_activity1 {
    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            String reversedName = reverseName(name);
            boolean isPalindrome = isPalindrome(name, reversedName);

            System.out.println("Reversed Name: " + reversedName);
            System.out.println("Is it a Palindrome? " + (isPalindrome ? "Yes" : "No"));

            scanner.close();
        }

        public static String reverseName(String name) {
            return new StringBuilder(name).reverse().toString();
        }

        public static boolean isPalindrome(String original, String reversed) {
            return original.equals(reversed);
        }
    }
