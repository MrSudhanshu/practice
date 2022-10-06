import java.util.ArrayList;
import java.util.List;

class Solution {
    static int lengthOfLongestSubstring(String s) {
        String input = s;
        String temp;
        List<String> list = new ArrayList<String>();
        for(int i=0;i<input.length();i++){
             for(int j=1;j<=(input.length()-i);j++){
                temp = input.substring(i,i+j);
                    list.add(temp);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb")); 
    }
}