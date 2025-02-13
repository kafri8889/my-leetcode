class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, String> allowedMap = new HashMap<>();
        int count = 0;

        for (char ca: allowed.toCharArray()) {
            allowedMap.put(ca, "");
        }

        mainLoop:
        for (String s: words) {
            for (char c : s.toCharArray()) {
                if (!allowedMap.containsKey(c)) continue mainLoop;
            }

            count++;
        }

        return count;
    }
}