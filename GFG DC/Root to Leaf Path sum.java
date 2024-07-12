class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        String max, min;
        int maxScore, minScore;

        if (x > y) {
            max = "ab";
            min = "ba";
            maxScore = x;
            minScore = y;
        } else {
            max = "ba";
            min = "ab";
            maxScore = y;
            minScore = x;
        }

        int res = 0;

        // First pass to maximize the higher score pairs
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == max.charAt(0) && s.charAt(i) == max.charAt(1)) {
                stack.pop();
                res += maxScore;
            } else {
                stack.push(s.charAt(i));
            }
        }

        // Remaining characters after removing the higher score pairs
        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.insert(0, stack.pop());
        }

        // Second pass to maximize the lower score pairs in the remaining string
        for (int i = 0; i < remaining.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == min.charAt(0) && remaining.charAt(i) == min.charAt(1)) {
                stack.pop();
                res += minScore;
            } else {
                stack.push(remaining.charAt(i));
            }
        }

        return res;
    }
}
