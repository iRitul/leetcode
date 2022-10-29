class Solution {
    public void reverseString(char[] s) {
        char tem[] =new char[s.length];
        for(int i=0;i<s.length;i++){
            tem[i]=s[i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=tem[s.length-i-1];
        }
    }
}
