import java.util.*;
class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        List<String> res = letterCasePermutation(s);
        for (String str : res) {
            System.out.println(str);
        }
    }
    
    public static List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        helper(new StringBuilder(s), res, 0);
        return res;
    }

    public static void helper(StringBuilder sb, List<String> res, int i) {
        if (i == sb.length()) {
            res.add(sb.toString());
            return;
        }
        
        if (Character.isLetter(sb.charAt(i))) {
            // Try lowercase
            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            helper(sb, res, i + 1);
            
            // Try uppercase
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            helper(sb, res, i + 1);
        } else {
            helper(sb, res, i + 1);
        }
    }
}