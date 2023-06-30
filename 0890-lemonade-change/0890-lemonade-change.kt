class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
    val duitGweh = mutableMapOf(
        5 to 0,
        10 to 0,
        20 to 0
    )

    for (bill in bills) {
        println(duitGweh)
        when (bill) {
            5 -> duitGweh[5] = duitGweh[5]!! + 1
            10 -> {
                if (duitGweh[5]!! < 0) return false
                else {
                    duitGweh[10] = duitGweh[10]!! + 1
                    duitGweh[5] = duitGweh[5]!! - 1
                }
            }
            20 -> {
                if (duitGweh[5]!! > 2 && duitGweh[10]!! < 1) {
                    duitGweh[5] = duitGweh[5]!! - 3
                    duitGweh[10] = 0
                } else {
                    duitGweh[10] = duitGweh[10]!! - 1
                    duitGweh[5] = duitGweh[5]!! - 1
                }
                duitGweh[20] = duitGweh[20]!! + 1
            }
        }

        if (duitGweh.values.any { it < 0 }) return false
    }

    return true
}
}