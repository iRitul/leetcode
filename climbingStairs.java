class Solution {
    public int climbStairs(int n) {
        int[] array = new int[46];
        array[0]=1;
        array[1]=1;
        array[2]=2;
        for(int i=3;i<=n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }
}
