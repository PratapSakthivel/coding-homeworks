
import java.util.*;

public class even_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int a = s.nextInt();
        for (int i = 1; i <=a; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
        
    }
}
