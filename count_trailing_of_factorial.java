public class count_trailing_of_factorial {
    public static void main(String[] args) {
        int n=5;
        int count=0;

        while (n>0){
            n=n/5;
            count+=n;

        }
        System.out.println(count) ;
    }
}
