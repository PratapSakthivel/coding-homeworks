import java.util.*;

public class armstrong_number {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            int digitcount = 0;

            int temp = i;

            while (i > 0) {
                int digit = i % 10;
                digitcount++;
                i = i / 10;
            }

            i = temp;

            int fvalue = 0;

            while (i > 0) {
                int digits = i % 10;
                fvalue += (int) Math.pow(digits, digitcount);
                i = i / 10;
            }

            if (temp == fvalue) {
                System.out.println("AN");
            } else {
                System.out.println("Enter a Valid AN");
            }

        }
    }
}
/*public class CountArmstrongInRange {
    public static void main(String[] args) {

        int start = 100;
        int end = 500;
        int count = 0;

        for (int num = start; num <= end; num++) {

            int temp = num;
            int digits = 0;

            // Step 1: Count digits
            int x = num;
            while (x > 0) {
                digits++;
                x = x / 10;
            }

            // Step 2: Armstrong calculation
            int sum = 0;
            x = num;
            while (x > 0) {
                int d = x % 10;
                sum += (int) Math.pow(d, digits);
                x = x / 10;
            }

            // Step 3: Compare
            if (sum == temp) {
                count++;
                System.out.println(temp + " is an Armstrong number");
            }
        }

        System.out.println("Total Armstrong numbers = " + count);
    }
}
 */