/*public class perfect_number {
    public static void main(String[] args) {
        int x = 66;

        int temp = x;

        int arr[] = new int[x];

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                arr[i] = i;

            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }

        if (temp == count) {
            System.out.println("pn");
        }
        else{
            System.out.println("not pn");
        }
    }
}*/
public class perfect_number {
    public static void main(String[] args) {
        int x = 6;
        int sum = 0;

        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i;

            }
        }
        if (sum == x) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}