package seven.kyu;

public class XO {

    public static boolean getXO (String str) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'X' || str.charAt(i) == 'x'){
                x++;
            }
            if (str.charAt(i) == 'O' || str.charAt(i) == 'o'){
                o++;
            }
        }
        return x == o;
    }
}
