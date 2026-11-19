class Solution {
    public boolean hasDuplicate(int[] nums) {
        

        for (int i = 0; i < nums.length ; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        // ici c en dirait i = 0 est comparé a chaque valeurs du tableau a partie de j ensuite on passe i = 1 etc
        return false;
    }
}