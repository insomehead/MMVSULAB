package five.kyu;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(stack);
            if (str.charAt(i) == '(') {
                stack.add(str.charAt(i));
            } else if (!stack.isEmpty() && str.charAt(i) == ')') {
                stack.pop();
                continue;
            }
            if (str.charAt(i) == ')') {
                stack.add(str.charAt(i));
            }
            if (stack.contains(')')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
