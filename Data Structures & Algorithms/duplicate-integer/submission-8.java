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

    // Parce que tu ne peux pas add des doublons sur hashset donc s'il n'arrive pas a ajouter c un doublons
}