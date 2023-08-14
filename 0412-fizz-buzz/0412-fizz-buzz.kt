class Solution {
    fun fizzBuzz(n: Int): List<String> {
        return arrayListOf<String>().apply {
            for (i in 1..n) add(
                when {
                    i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                    i % 3 == 0 -> "Fizz"
                    i % 5 == 0 -> "Buzz"
                    else -> i.toString()
                }
            )
        }
    }
}