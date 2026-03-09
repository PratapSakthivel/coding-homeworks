import java.util.Scanner;

public class reverse_a_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int rev = 0;
        while (a > 0) {
            int lastdig = a % 10;
            rev = rev * 10 + lastdig;
            a = a / 10;
        }

        System.out.print(rev);

    }
}
