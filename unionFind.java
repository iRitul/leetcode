// 990. Satisfiability of Equality Equations
// https://leetcode.com/problems/satisfiability-of-equality-equations/

class Solution {
    int[] unionFind = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; ++i){
            unionFind[i] = i;
        }
        for (String st : equations){
            if (st.charAt(1) == '='){
                unionFind[find(st.charAt(0) - 'a')] = find(st.charAt(3) - 'a');
            }
        }
        for (String st : equations){
            if (st.charAt(1) == '!' && find(st.charAt(0) - 'a') == find(st.charAt(3) - 'a'))
                return false;
        }
        return true;
    }

    public int find(int x) {
        if (x != unionFind[x]){
            unionFind[x] = find(unionFind[x]);
        }
        return unionFind[x];
    }
}
