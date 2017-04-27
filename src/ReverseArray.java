/**
 * Created by sethugayu on 4/27/17.
 */


import java.util.*;
        import java.io.*;
public class ReverseArray{
    public static void main(String args[] ) throws Exception {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[100];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = N -1; i >= 0 ; i--) {

            System.out.println(arr[i]);
        }
    }
}