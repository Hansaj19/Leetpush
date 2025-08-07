class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int orig = x;
        int rev = 0;

        while (x != 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x /= 10;
        }

        return orig == rev;
    }
}