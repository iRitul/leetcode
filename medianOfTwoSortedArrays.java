//https://leetcode.com/problems/median-of-two-sorted-arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int b1 = nums2.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        for (int i = 0; i < a1; i = i + 1) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < b1; i = i + 1) {
            c[a1 + i] = nums2[i];
        }
        Arrays.sort(c);
        if(c1%2!=0){
            return Double.valueOf(c[c1/2]);
        }
        else{
            return (Double.valueOf(c[c1/2 -1]) + Double.valueOf(c[c1/2]) )/2 ;
        }
    }
}
