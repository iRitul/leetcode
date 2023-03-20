//https://leetcode.com/problems/n-th-tribonacci-number

class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int t = 2;
        if(n==0){
            return a;
        }
        if(n==1)
        return b;
        if(n==2)
        return c;
        n = n-3;
        while (n-- > 0) {
            a = b;
            b = c;
            c = t;
            t = a + b + c;
        }
        return t;
    }
}
