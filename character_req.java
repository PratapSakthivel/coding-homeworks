public class character_req {
    public static void main(String[] args) {
        String s = "swiss";
        int size[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int result = c - 'a';
            size[result]++;
        }


        for (int i = 0; i <size.length; i++) {
            if(size[i]>0){
                char ch =(char)(i+'a');
                System.out.println(ch +" "+size[i]);
            }
        }

    }

}
