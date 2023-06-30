class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    val flipped = arrayListOf<IntArray>()
    for (im in image) {
        flipped.add(im.reversed().map { if (it == 0) 1 else 0 }.toIntArray())
    }
    return flipped.toTypedArray()
}
}