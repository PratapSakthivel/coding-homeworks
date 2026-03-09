/* 
public class print_all_subarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();
            }
        }
    }
}
*/



public class print_all_subarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int finalcount=0;
        int target =3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int countcheck=0;

                for (int k = i; k <= j; k++) {
                    countcheck+=arr[k];

                }
                if(countcheck == target){
                    finalcount++;
                }
                
            }
        }
        System.out.print(finalcount);
    }
}