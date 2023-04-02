// two sum II for a sorted array.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int rightPointer = numbers.length - 1;
        int leftPointer = 0;
        int[] result = new int[2];
        while(leftPointer<rightPointer){
            int sum = numbers[leftPointer] + numbers[rightPointer];
            if(sum > target){
                rightPointer = rightPointer - 1;
            }
            else if(sum < target){
                leftPointer = leftPointer + 1;
            }
            else{
                result[0] = leftPointer+1;
                result[1] = rightPointer+1;
                return result;
            }
        }
        return result;
    }         
}
