import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by sethugayu on 3/31/17.
 */
public class FindProduct {
    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] input = null;
        int div=1000000007;
        try {
            while ((line = stdin.readLine()) != null && line.length() != 0) {
                input = line.split(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int answer = 1;
        for (String a : input) {
            answer = (answer * Integer.parseInt(a))%div;
        }
        System.out.print(answer);
    }
}
