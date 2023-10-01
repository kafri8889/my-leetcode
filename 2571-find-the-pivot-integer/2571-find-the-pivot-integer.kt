class Solution {
fun pivotInteger(n: Int): Int {
    for (i in 1..n) {
        // Deret 1: sum dari 1 sampai i
        // Deret 2: sum dari i sampai n
        // Ingat! n yang dimasukkan ke function deretAritmatikaPenjumlahan adalah 
        // jarak dari i ke n (n di function pivotInteger)
        // misalnya i = 6 dan n = 8, berarti jaraknya 3 => 6, 7, 8
        if (deretAritmatikaPenjumlahan(1, 1, i) == deretAritmatikaPenjumlahan(i, 1, n - i + 1)) return i
    }

    return -1
}

fun deretAritmatikaPenjumlahan(a: Int, b: Int, n: Int): Int {
    // Sn = (n * (2a + (n - 1) * b)) / 2
    return (n * (2 * a + (n - 1) * b)) / 2
}
}