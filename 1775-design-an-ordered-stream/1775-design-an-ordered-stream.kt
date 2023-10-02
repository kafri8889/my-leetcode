class OrderedStream(private val n: Int) {

    private val arr = Hashtable<Int, String>()
    private var pointer = 1

    fun insert(idKey: Int, value: String): List<String> {
        arr[idKey] = value

        // Cek jika idKey sama dengan pointer, maka pindahkan pointer
        if (idKey == pointer) {
            return arrayListOf<String>().apply {
                while (!arr[pointer].isNullOrBlank()) {
                    add(arr[pointer]!!).also { pointer++ }
                }
            }

        }

        return emptyList()
    }

}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * var obj = OrderedStream(n)
 * var param_1 = obj.insert(idKey,value)
 */