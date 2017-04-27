import java.util.Scanner;

/**
 * Created by sethugayu on 3/31/17.
 */
public class LittleShinoandCommonfactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();
        String[] str = line.split(" ");

        int count = 0;
        long a=0;
        long b=0;
        try {
            a = Integer.parseInt(str[0].trim());
            b = Integer.parseInt(str[1].trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
        long c = 0;
        if (a > b) {
            c = a;
        } else c = b;
        for (int i = 1; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
