package six.kyu;

public class Multiples_of_3_of_5 {
    public int solution(int number) {
        if (number < 1) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0) {
                    sum += i;
                    System.out.println(i);
                    continue;
                }
                if (i % 5 == 0) {
                    System.out.println(i);
                    sum += i;
                }
            }
            return sum;
        }
    }
}
