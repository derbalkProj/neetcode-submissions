class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> vu = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!vu.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}