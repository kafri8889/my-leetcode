class Solution {
fun isCircularSentence(sentence: String): Boolean {
    for (i in 1 until sentence.length) {
        if (sentence.getOrNull(i + 1) == null) {
            // Di kondisi ini, artinya pengecekan di kondisi if dibawah sudah berhasil
            // atau `sentence` hanya memiliki 1 kata
            // Berarti `firstChar` kita ganti menjadi karakter pertama dari kalimat ini

            // Cek apakah karakter pertama dan terakhir equals dari kalimat ini
            if (sentence[0] != sentence.last()) return false
        }

        if (sentence.getOrNull(i + 1)?.isWhitespace() == true) {
            // sentence[i] adl karakter terakhir dari kata saat ini
            // sentence[i + 1] adl karakter white space (spasi)
            // sentence[i + 2] adl karakter pertama dari kata selanjutnya
            if (sentence[i] != sentence[i + 2]) return false
        }
    }

    return true
}
}