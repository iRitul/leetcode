//https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        String st = String.valueOf(x);
        boolean fl = true;
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i) != st.charAt(st.length()-1-i)){
                fl = false;
                break;
            }
        }
        return fl;
    }
}
