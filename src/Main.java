import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String line= scanner.nextLine();
        char[] charArr= line.toCharArray();


        for(int c:charArr){
            int ch=c;
            if(c>=65 && c<=90){
                ch=c+32;
            }else if(c>=97 && c<=122){
                ch=c-32;
            }
            System.out.print((char)ch);
        }
        scanner.close();

    }
}
