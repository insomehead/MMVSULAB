package six.kyu;

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i <  word.length(); i++){

            int count = 0;

            for (int j = 0; j < word.length(); j++){
                if (word.charAt(j) == word.charAt(i)){
                    count++;
                }
            }
            result.append(count > 1 ? ")" : "(");
        }
        return result.toString();
    }

}
