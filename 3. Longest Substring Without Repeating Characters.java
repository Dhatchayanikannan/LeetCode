class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        int p= 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (m.containsKey(c) && m.get(c) >= p) {
                p = m.get(c) + 1;
            }
            m.put(c, i);
            ans = Math.max(ans, i - p + 1);
        }
        return ans;
    }
}
