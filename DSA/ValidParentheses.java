import java.util.Stack;

public class ValidParentheses {
    // brute force O(n^2)
//    public boolean isValid(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        boolean changed = true;
//
//        while (changed) {
//            changed = false;
//            for (int i = 0; i < sb.length() -1; i++) {
//                char c1 = sb.charAt(i);
//                char c2 = sb.charAt(i+1);
//                if ((c1 == '(' && c2 == ')') ||
//                     c1 == '{' && c2 == '}' ||
//                     c1 == '[' && c2 == ']') {
//                    sb.delete(i, i+2); // start index is inclusive, end is exclusive
//                    changed = true;
//                    break;
//                }
//            }
//        }
//        return sb.isEmpty();
//    }

    // stack solution O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                     c == '}' && top != '{'  ||
                     c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
