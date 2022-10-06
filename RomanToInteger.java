import java.util.HashMap;
import java.util.Map;

class Solution {
    static int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("IX", "VIIII");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CM", "DCCCC");
        s = s.replace("CD", "CCCC");
        for (int i = 0; i < s.length(); i++) {
            ans = ans + map.get(s.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }
}