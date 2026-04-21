class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int temp = target - nums[i];
            if(hmap.containsKey(temp)) {
                return new int[] { hmap.get(temp), i };
            }
            hmap.put(nums[i], i);
        }

        return new int[2];
    }
}
