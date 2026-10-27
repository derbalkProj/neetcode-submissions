class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            int[] cpt = new int[26];
            for (char c : s.toCharArray()){
                cpt[c - 'a']++;
            }
            String k = Arrays.toString(cpt);
            res.putIfAbsent(k, new ArrayList<>());
            res.get(k).add(s);

        }
        return new ArrayList<>(res.values());
    }
}
