import java.util.LinkedList;

class Solution {
    static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> l3 = new LinkedList<>();
        String str1 = "";
        String str2 = "";
        // l3.add(45);
        for (int i = 0; i < l1.size(); i++) {
            str1 = str1 + String.valueOf(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            str2 = str2 + String.valueOf(l2.get(i));
        }
        String num = String.valueOf(Integer.valueOf(str1)+Integer.valueOf(str2));
        // System.out.println(num);
        for (int i = 0; i < num.length(); i++) {
            l3.add(Integer.valueOf(String.valueOf(num.charAt(i))));
        }
        return l3;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ls1 = new LinkedList<>();
        LinkedList<Integer> ls2 = new LinkedList<>();
        ls1.add(7);
        ls1.add(8);
        ls1.add(9);
        ls2.add(5);
        ls2.add(6);
        ls2.add(7);
        System.out.println(Solution.addTwoNumbers(ls1, ls2));
        
    }
}