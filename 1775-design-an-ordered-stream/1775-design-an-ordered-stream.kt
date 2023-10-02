class OrderedStream(n: Int) {

    private val arr = Array(n) { "" }
    private var pointer = 0

    fun insert(idKey: Int, value: String): List<String> {
        arr[idKey - 1] = value

        // Cek jika idKey sama dengan pointer, maka pindahkan pointer
        if (idKey - 1 == pointer) {
            return arrayListOf<String>().apply {
                while (!arr.getOrNull(pointer).isNullOrBlank()) {
                    add(arr[pointer]).also { pointer++ }
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