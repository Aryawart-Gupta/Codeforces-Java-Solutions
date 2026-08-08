import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
 
        int luckyCount = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }
 
        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        scanner.close();
    }
}