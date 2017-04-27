

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sethugayu on 3/31/17.
 */
public class FredoAndArrUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String line = scanner.nextLine();

        if (line != null) {
            String[] str = line.split(" ");

            int[] ints = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                try {
                    ints[i] = Integer.parseInt(str[i]);
                } catch (NumberFormatException nfe) {
                    //Not an integer
                }
            }

            int total = 0;
            Arrays.sort(ints);

            for (int st1 : ints) {
                total = total + st1;
            }
            for (int st2 : ints) {
                if (st2 * count > total) {
                    System.out.print(st2);
                    break;
                }
            }
        }
    }
}
