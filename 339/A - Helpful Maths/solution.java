import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
 
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
 
        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            if (ch == '1') {
                count1++;
            } else if (ch == '2') {
                count2++;
            } else if (ch == '3') {
                count3++;
            }
        }
 
        StringBuilder sb = new StringBuilder();
 
        while (count1-- > 0) {
            sb.append("1+");
        }
        while (count2-- > 0) {
            sb.append("2+");
        }
        while (count3-- > 0) {
            sb.append("3+");
        }
 
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1); 
        }
 
        System.out.println(sb.toString());
        scanner.close();
    }
}