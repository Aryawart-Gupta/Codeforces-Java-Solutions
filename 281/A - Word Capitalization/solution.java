import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
 
        String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);
 
        System.out.println(capitalized);
        scanner.close();
    }
}