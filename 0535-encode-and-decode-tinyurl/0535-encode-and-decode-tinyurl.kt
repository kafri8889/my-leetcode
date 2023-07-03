class Codec() {
    val shortUrlWithRealUrl = mutableMapOf<String, String>()

// Encodes a URL to a shortened URL.
fun encode(longUrl: String): String {
    // Encode longUrl pake md5
    val encoded = md5(longUrl)

    // Ambil stringnya dgn interval [0..1] + [16..17] + [30..31]
    return with(encoded) {
        substring(0..1) + substring(16..17) + substring(30..31)
    }.also { shortUrlWithRealUrl[it] = longUrl }
}

// Decodes a shortened URL to its original URL.
fun decode(shortUrl: String): String {
    return shortUrlWithRealUrl[shortUrl]!!
}

fun md5(input:String): String {
    val md = MessageDigest.getInstance("MD5")
    return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
}
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */