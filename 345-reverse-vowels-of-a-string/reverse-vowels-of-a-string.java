class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length() - 1;
        String vowels = "aeiouAEIOU";
        while (left < right) {
            if (vowels.indexOf(sb.charAt(left)) == -1) {
                left++;
                continue;
            }
            if (vowels.indexOf(sb.charAt(right)) == -1) {
                right--;
                continue;
            }
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();
    }
}