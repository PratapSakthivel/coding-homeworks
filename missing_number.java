public class missing_number {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 0 };

        int expsum = 0;

        for (int idx = 0; idx <= arr.length; idx++) {
            expsum += idx;

        }
        int acsum = 0;

        for (int i = 0; i < arr.length; i++) {
            acsum += arr[i];
        }
        System.out.println(expsum - acsum);
    }
}
