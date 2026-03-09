public class Pair_with_Given_Sum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 8, 11 };
        int i = 0;
        int j = arr.length - 1;
        int target = 10;

        Boolean cprrect = false;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                cprrect = true;
                break;

            } else if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            }

        }
        System.out.println(cprrect);

    }
}
