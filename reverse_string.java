
public class reverse_string {
    public static void main(String[] args) {
        String s = "hello";
        char arr[] = new char[s.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String result = new String(arr);
        System.out.println(result);
 
    }
}
