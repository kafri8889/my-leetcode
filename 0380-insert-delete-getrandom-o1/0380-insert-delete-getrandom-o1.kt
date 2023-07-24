class RandomizedSet() {
    private val sets = mutableSetOf<Int>()
    
    fun insert(`val`: Int): Boolean = sets.add(`val`)
    fun remove(`val`: Int): Boolean = sets.remove(`val`)
    fun getRandom(): Int = sets.random()
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */