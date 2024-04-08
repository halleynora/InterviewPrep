import java.util.Stack;

public class BalancedBrackets {

//    Let's consider the basic validations for the input string:
//
//    If a null input is passed, then it's not balanced.
//    For a string to be balanced, the pairs of opening and closing brackets should match.
//    Therefore, it would be safe to say that an input string whose length is odd will not be balanced as it will contain at least one non-matched bracket.
//    As per the problem statement, the balanced behavior should be checked between brackets. Therefore, any input string containing non-bracket characters is an unbalanced string.
//    Given these rules, we can implement the validations:

    private static String matchParenthisis(String str) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else {
                if (c == ']' && !st.isEmpty() && st.pop() == '[') {
                    continue;
                } else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
                    continue;
                } else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
                    continue;
                } else {
                    return "NO";
                }
            }
        }
        if (!st.isEmpty()) {
            return "NO";
        }

        return "YES";
    }


    public static void main(String[] args)
    {
        String brackets = "([{{[(())]}}])";
//        String brackets = "{{[]()}}}}";
        System.out.println("I am a Geek");
        String isBalanced = matchParenthisis(brackets);
        System.out.println("Brackets are balanced:" + isBalanced);
    }
}
