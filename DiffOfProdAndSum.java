//1281. Subtract the Product and Sum of Digits of an Integer

class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1,sum = 0;
        String s = Integer.toString(n);
        for(int i=0;i<s.length();i++){
            prod = prod * Integer.parseInt(""+s.charAt(i));
            sum = sum + Integer.parseInt(""+s.charAt(i));
        }
        return prod-sum;
    }
}
