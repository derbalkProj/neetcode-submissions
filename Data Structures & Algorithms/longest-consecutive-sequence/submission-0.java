class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for (int num : nums){
            numset.add(num);
        }
        int lng = 0;

        for (int num : numset ){
            if(!numset.contains(num - 1)){
                int len = 1;
                while (numset.contains(num + len)){
                    len++;
                }
                lng = Math.max(lng, len);
            }
        }

        return lng;
    }
}
