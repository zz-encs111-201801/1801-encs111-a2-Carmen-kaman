package q4_matching;
import java.util.ArrayList;

public class Solution {

    /*
     * 假设 formula 一定不会是 null
     */

    public boolean isValid(String formula) {
        char[] sFormula = formula.toCharArray();
        ArrayList cFormula = new ArrayList();
        char x = '{';
        char y = '[';
        char z = '(';
        for (char c : sFormula) {
            if (c == '{' || c == '[' || c == '(') {
                cFormula.add(c);
            } else if (c == '}' || c == ']' || c == ')' && cFormula.size() != 0) {
                int i = cFormula.size()-1;
                    if (i >= 0 && cFormula.get(i).equals(x) && c == '}') {
                        cFormula.remove(i);
                    } else if (i >= 0 && cFormula.get(i).equals(y) && c == ']') {
                        cFormula.remove(i);
                    } else if (i >= 0 && cFormula.get(i).equals(z) && c == ')') {
                        cFormula.remove(i);
                    } else {
                        System.out.println("Matching failure");
                        return false;
                    }
            }else {
                return false;
            }
        }
        int j = cFormula.size();
        while (j != 0) {
            return false;
        }
        return true;
    }
}
