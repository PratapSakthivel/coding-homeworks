import java.util.*;

public class sum_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count=0;
        while(a>0){
            int dig=a%10;
            count+=dig;
            a--;

        }
        System.out.println(count);
    }
}
