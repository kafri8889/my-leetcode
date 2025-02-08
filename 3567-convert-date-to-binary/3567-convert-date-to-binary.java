class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < date.length(); i++) {
            if (i == date.length() - 1) {
                temp.append(date.charAt(i));
                result.append(Integer.toBinaryString(Integer.parseInt(temp.toString())));
            }
            
            if (date.charAt(i) == '-') {
                result.append(Integer.toBinaryString(Integer.parseInt(temp.toString()))).append("-");
                temp = new StringBuilder();
            } else temp.append(date.charAt(i));
        }

        return result.toString();
    }
}