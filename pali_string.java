public class pali_string {
    public static void main(String[] args) {
        String s = "MaDaM" .toLowerCase();

        int i = 0;
        int j = s.length() - 1;
        boolean pali = true;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                pali = false;
                break;

            }
            i++;
            j--;

        }

        System.err.println(pali ? "pali" : "not pali");
    }

}
