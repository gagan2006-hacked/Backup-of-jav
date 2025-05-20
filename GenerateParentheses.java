import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> result = new ArrayList<>();
        generateParentheses(result, new StringBuilder(), 0, 0, n);
        System.out.println(result);
    }

    private static void generateParentheses(List<String> result, StringBuilder current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }

        if (open < n) {
            current.append("(");
            generateParentheses(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }

        if (close < open) {
            current.append(")");
            generateParentheses(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
        System.out.println(current);
    }
}
