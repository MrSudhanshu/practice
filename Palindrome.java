public class Palindrome {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        int num = x;
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        if(x != rev) ans = false; 
        if(x < 0 ) ans = false;
        return ans;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        boolean res = p.isPalindrome(-131);
        System.out.println(res);
    }
}
