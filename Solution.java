package Leetcod;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<String> ans;
    public static void  solve(StringBuilder str, int count, int n) {
        if (n == 0) {
            ans.add(str.toString());
            return;
        }

        if (count != n) {
            str.append("(");
            solve(str, count+1, n);
            str.setLength(str.length() - 1);
        }

        if (count != 0) {
            str.append(")");
            solve(str, count-1, n-1);
            str.setLength(str.length() - 1);
        }
    }
    public static List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        solve(new StringBuilder(), 0, n);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}