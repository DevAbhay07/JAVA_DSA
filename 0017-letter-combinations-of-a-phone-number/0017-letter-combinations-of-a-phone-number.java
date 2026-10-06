import java.util.*;

class Solution {
    String[] map = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder());

        return result;
    }

    void backtrack(String digits, int index, StringBuilder current) {

        // Base case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters for current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try every possible letter
        for (char ch : letters.toCharArray()) {

            current.append(ch);

            // Move to next digit
            backtrack(digits, index + 1, current);

            // Undo choice
            current.deleteCharAt(current.length() - 1);
        }
    }
}