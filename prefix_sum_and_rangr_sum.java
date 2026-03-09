public class prefix_sum_and_rangr_sum {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 4, 5, 3 };

        int prefixsum[] = new int[arr.length];
        prefixsum[0] = arr[0];

        for (int idx = 1; idx < arr.length; idx++) {
            prefixsum[idx] = arr[idx] + prefixsum[idx - 1];

        }

        // find sum of range 1 -4

        // formula Rangesum = r - (l-1)
        int right = 4;
        int left = 1;

        System.out.println(prefixsum[right] - prefixsum[left - 1]);
    }
}
