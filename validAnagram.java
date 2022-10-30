class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=freq2[i])
                return false;
        }
        return true;
    }
}
