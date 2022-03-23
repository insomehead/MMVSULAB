package six.kyu;

public class HowManyPagesInABook {

    public static int amountOfPages(int summary) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(result.length() != summary){
            i++;
            result.append(i);
        }
        return i;
    }

}