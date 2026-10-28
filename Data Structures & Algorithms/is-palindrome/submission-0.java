class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder nwst = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                nwst.append(Character.toLowerCase(c));
            }
        }
        return nwst.toString().equals(nwst.reverse().toString());
    }
}
