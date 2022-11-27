class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int cache[] = new int[256];
        for(int i=0,j=0;i<s.length();i++){
            j = Math.max(j,cache[s.charAt(i)]);
            cache[s.charAt(i)] = i+1;
            count = Math.max(count, i-j+1);
        }
        return count;       
    }
}
