import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String s1 = scanner.next();
        String s2 = scanner.next();
 
        int result = s1.compareToIgnoreCase(s2);
 
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
 
        scanner.close();
    }
}