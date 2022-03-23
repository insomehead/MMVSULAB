package six.kyu;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        String num = n + "";
        long result = 0;
        for (int i = 0; i < num.length(); i++){
            result += (long) Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))), p+i);
        }
        return result % n == 0 ? result / n : -1;
    }

}