public class compare_without_builtin {
    public static void main(String[] args) {

        String s = "hello";
        String s1 = "kello";

        int len1 = 0, len2 = 0;

        try {
            while (true) {
                s.charAt(len1);
                len1++;
            }
        } catch (Exception e) {
        }

        try {
            while (true) {
                s1.charAt(len2);
                len2++;
            }
        } catch (Exception e) {
        }

        if (len1 != len2) {
            System.out.println("not equal");
            return;
        }

        boolean equal = true;
        for (int i = 0; i < len1; i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                equal = false;
                break;
            }
        }

        System.out.println(equal ? "equal" : "not equal");
    }
}
