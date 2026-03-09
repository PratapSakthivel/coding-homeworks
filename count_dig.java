
import java.util.*;

public class count_dig {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int a = s.nextInt();
        while (a > 0) {
            count++;
            a = a / 10;
        }
        System.out.print(count);
    }
}
