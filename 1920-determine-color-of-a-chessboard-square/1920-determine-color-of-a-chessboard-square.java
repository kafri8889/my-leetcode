class Solution {
    public boolean squareIsWhite(String coordinates) {
        // genap genap = heise
        // genap ganjil = baise
        // ganjil genap = baise
        // ganjil ganjil = heise

        boolean coor1Odd = (coordinates.charAt(0) - 'a') % 2 == 0;
        boolean coor2Odd = ((coordinates.charAt(1) - '0') - 1) % 2 == 0;

        return (!coor1Odd || !coor2Odd) && (coor1Odd || coor2Odd);
    }
}