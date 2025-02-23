class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;

        for (String cmd : commands) {
            switch (cmd) {
                case "DOWN":
                    pos += 1 * n;
                    break;
                case "UP":
                    pos += -1 * n;
                    break;
                case "RIGHT":
                    pos += 1;
                    break;
                case "LEFT":
                    pos += -1;
                    break;
            }
        }

        return pos;
    }
}