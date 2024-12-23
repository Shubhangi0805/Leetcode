class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            result += word1.charAt(i++);
            result += word2.charAt(j++);
        }
        result += word1.substring(i);
        result += word2.substring(j);
        return result;
    }
}