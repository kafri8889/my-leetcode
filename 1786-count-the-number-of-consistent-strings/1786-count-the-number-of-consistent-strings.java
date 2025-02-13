class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();
        int count = 0;

        for (char ca: allowed.toCharArray()) {
            allowedSet.add(ca);
        }

        for (String s: words) {
            boolean consistent = true;
            for (char c : s.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) count++;
        }

        return count;
    }
}