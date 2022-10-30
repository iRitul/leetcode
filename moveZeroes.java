class Solution {
    public void moveZeroes(int[] nums) {
        int temp =0;
        for(int i:nums){
            if(i!=0) nums[temp++]=i;
        }
        while(temp<nums.length){
            nums[temp++]=0;
        }
    }
}
