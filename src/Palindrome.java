import java.util.Scanner;

/**
 * Created by sethugayu on 3/31/17.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        String str1;
        String str2;
        if (line.length() % 2 == 0) {
            str1 = line.substring(0, line.length() / 2);
            str2 = line.substring(line.length() / 2, line.length());
        } else {
            str1 = line.substring(0, line.length() / 2);
            str2 = line.substring((line.length() / 2) + 1, line.length());
        }
        StringBuffer stringBuffer= new StringBuffer(str2);
        stringBuffer.reverse();
        str2=stringBuffer.toString();

        if (str1.equals(str2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        scanner.close();
    }
}
