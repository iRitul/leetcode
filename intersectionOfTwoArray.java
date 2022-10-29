class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Long> map = Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting()));
        return Arrays.stream(nums2).filter(e->{
            if(!map.containsKey(e))
                return false;
            map.put(e,map.get(e)-1);
            if(map.get(e)==0) 
                map.remove(e);
            return true;
        }).toArray();
    }
}
