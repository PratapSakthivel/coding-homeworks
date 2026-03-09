public class max_min_in_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 0, 9 };

        int max = arr[0];
        int min = arr[0];
        int total = 0;
        int even = 0;
        int odd = 0;

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > max) {
                max = arr[idx];
            }

            if (arr[idx] < min) {
                min = arr[idx];
            }

            total += arr[idx];

            if (arr[idx] % 2 == 0) {
                even ++;

            } else {
                odd ++;
            }

        }
        System.out.println("max : " + max + " min : " + min + " avg : " + (double) total / arr.length + " even : " + even
                + " odd : " + odd);
    }
}
