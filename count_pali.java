public class count_pali {
    public static void main(String[] args) {

        String s = "madam level hello noon".toLowerCase();
        String[] parts = s.split(" ");

        int count = 0;

        for (int x = 0; x < parts.length; x++) {

            String word = parts[x];
            int i = 0;
            int j = word.length() - 1;
            boolean pali = true;

            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    pali = false;
                    break;
                }
                i++;
                j--;
            }

            if (pali) {
                count++;
            }
        }

        System.out.println(count);
    }
}
