public class isomorphic_string {
    public static void main(String[] args) {
        String str1 = "paper";
        String str2 = "title";

        int[] size = new int[256];
        int[] size1 = new int[256];
        Boolean check = true;

        for (int i = 0; i < str1.length(); i++) {

            char c = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (size[c] != size1[c2]) {
                // not isomorphic
                check = false;
                return;
            }

            size[c] = i + 1;

            size1[c2] = i + 1;

        }
        check = true;
        System.out.println(check);

    }

}
