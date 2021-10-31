package TextbookExamples;

class Solution {
    public void reverseString(char[] s) {
        helper(0, s.length - 1, s);
    }

    public void helper(int leftIndex, int rightIndex, char[] s) {
        if (s == null || leftIndex >= rightIndex) {
            return;
        }
        helper(leftIndex + 1, rightIndex - 1, s);
        char temp = s[rightIndex];
        s[rightIndex] = s[leftIndex];
        s[leftIndex] = temp;
    }
}
