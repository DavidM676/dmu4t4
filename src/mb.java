public class mb {

    public int maxBlock(String str) {
        if (str.equals("")) {
            return 0;
        }
        int count=1;
        int max = 1;
        String prev = "";
        for (int i = 0; i<str.length(); i++) {


            String s = str.substring(i, i+1);
            System.out.println(s+" "+prev);
            if (s.equals(prev)) {
                System.out.println("yes"+count);
                count ++;
                if (count>max) {
                    max = count;
                }
            } else {
                prev = s;
                count = 1;
                System.out.println("yes2");
            }
        }

        return max;
    }

}
