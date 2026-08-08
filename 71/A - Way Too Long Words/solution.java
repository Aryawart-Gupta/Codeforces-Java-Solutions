import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
             int length = word.length();
            if (length > 10) {
            char firstLetter = word.charAt(0);
                char lastLetter = word.charAt(length - 1);
                int middleCount = length - 2;
                System.out.println("" + firstLetter + middleCount + lastLetter);
                  } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}