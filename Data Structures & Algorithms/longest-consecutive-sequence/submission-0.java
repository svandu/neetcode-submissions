class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int i : nums) {
            numSet.add(i);
        }

        int longest = 0;

        for(int n : nums) {
            if(!numSet.contains(n-1)) {
                int length = 0;
                while(numSet.contains(n+length)) {
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}
