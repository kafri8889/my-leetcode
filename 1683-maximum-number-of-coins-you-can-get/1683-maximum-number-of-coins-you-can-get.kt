class Solution {
fun maxCoins(piles: IntArray): Int {
    // Pattern
    // Diketahui alice akan mengambil max value,
    // dan kita mengambil value selanjutnya dari value alice
    // Bisa lihat contoh dibawah (iterasi dari terbesar ke terkecil)

    // 1, 2i, 2, 4, 7i, 8
    // alice mengambil angka "8", dan kita mengambil angka "7" (index selanjutnya), dst
    
    // 1, 2, 3, 4i, 5, 6i, 7, 8i, 9
    // alice mengambil angka "9", dan kita mengambil angka "8" (index selanjutnya), dst
    
    // 5, 5, 7, 7i, 7, 7i, 8, 8i, 10
    // alice mengambil angka "10", dan kita mengambil angka "8" (index selanjutnya), dst

    // "i" setelah angka adalah angka yang kita ambil

    Arrays.sort(piles)

    var max = 0
    var chance = piles.size / 3
    for (i in piles.size - 2 downTo 0 step 2) {
        if (chance <= 0) break
        max += piles[i].also { chance-- }
    }
    return max
}
}