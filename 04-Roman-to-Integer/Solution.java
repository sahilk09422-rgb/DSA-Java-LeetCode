import java.util.Map;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int Current = roman.get(s.charAt(i));
            int Next = roman.get(s.charAt(i + 1));

            if (Current < Next) {
                total -= Current;
            } else {
                total += Current;
            }
        }

        total += roman.get(s.charAt(s.length() - 1));

        return total;
    }
}