class Solution {
    public boolean isPowerOfThree(int n) {
        return n>0 && (1162261467%n==0);
        // for(int i = 0; i<Math.sqrt(n);i++){
        //     if(Math.pow(3,i)==n){
        //         return true;
        //     }
        // }return false;
    }
}
