
import java.util.*;

public class unique_number_occurence {
    public static void main(String[] args) {
        int arr[] = { -3, -1, -1, 2, 2, 2 };

        /*
         * for handling postive numbers
         * 
         * int size[] = new int[10];
         * 
         * for (int i = 0; i < arr.length; i++) {
         * size[arr[i]]++;
         * }
         * 
         * boolean uo = true;
         * 
         * for (int i = 0; i < size.length; i++) {
         * 
         * if (size[i] == 0) {
         * continue;
         * }
         * 
         * for (int j = i + 1; j < size.length; j++) {
         * if (size[j] == 0) {
         * continue;
         * }
         * 
         * if (size[i] == size[j]) {
         * uo=false;
         * System.out.println(uo);
         * return;
         * 
         * }
         * }
         * 
         * }
         * System.out.println(uo);
         */

        /* for handling negative numerbs */

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);

            } else {
                map.put(num, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (int val : map.values()) {

            if (set.contains(val))
                
            {
                System.out.println("false");
                return;
            }
            else{
                set.add(val);
            }

        }

        System.out.println(true);

    }
}
