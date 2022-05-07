class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> d =new HashMap<Character, Integer>();
        d.put('I',1);
        d.put('V',5);
        d.put('X',10);
        d.put('L',50);
        d.put('C',100);
        d.put('D',500);
        d.put('M',1000);
        int res = 0;
        for(int i =0; i < s.length(); i++){
            int s1 = d.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = d.get(s.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                }
                else {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }
        return res;
    }
}

// Time Complexity :- O(n)
