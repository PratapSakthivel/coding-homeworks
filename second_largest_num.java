public class second_largest_num {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // System.out.println(max);

        int secmax = arr[0];

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] < max && arr[idx]>secmax) {
                secmax=arr[idx];
            }

        }
        System.out.println(secmax);
    }

}
