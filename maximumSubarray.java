// Maximum Subarray   : beats 100% in time and 99.12% in space complexity
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currentSum = 0;
        int i;
        for(i=0;i<nums.length;i++){
            if(currentSum<0){
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            maxSub = maxSub >= currentSum ? maxSub : currentSum ;
        }
        return maxSub;
    }
}
