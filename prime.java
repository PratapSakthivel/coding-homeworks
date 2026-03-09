/*public class prime {
    public static void main(String[] args) {
        int count=0;
        for (int a = 2; a <= 10; a++) {

            boolean isprime = true;

            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    isprime = false;
                    break;
                }

            }

            if(isprime){
                count++;
            }
        }
        System.out.println(count);
    }
}*/

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
