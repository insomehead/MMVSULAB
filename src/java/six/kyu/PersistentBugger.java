package six.kyu;

class PersistentBugger {
    public static int persistence(long n) {
        String str = "" + n;
        int result = 0;
        while(true){
            int multi = 1;
            for (int i = 0; i < str.length(); i++) {
                multi *= Integer.parseInt("" + str.charAt(i));
            }
            str = Integer.toString(multi);
            result++;
            if (multi < 10){
                break;
            }
        }
        return  (n < 10) ? 0 : result;
    }
}