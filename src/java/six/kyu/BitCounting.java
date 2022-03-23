package six.kyu;

public class BitCounting {

    public static int countBits(int num) {
        int result = 0;
        String str = Integer.toBinaryString(num);
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}