package six.kyu;

public class StringSplit {
    public static String[] solution(String s){
        if (s.length() % 2 != 0) {
            s+="_";
        }

        String[] result = {""};
        if (s.length() % 2 == 0){
            System.out.println("first");
            result = new String[s.length()/2];
            for (int i = 0; i < result.length; i++){
                result[i] = "" + s.charAt(i+i) + s.charAt(i+i+1);
            }
        }

        return result;
    }
}
