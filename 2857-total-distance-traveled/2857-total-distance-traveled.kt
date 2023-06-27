class Solution {
    fun distanceTraveled(mainTank: Int, additionalTank: Int): Int {
        var mMainTank = mainTank
    var mAdditionalTank = additionalTank
    var totalTank = mainTank

    while (mMainTank >= 5) {
        if (mMainTank >= 5 && mAdditionalTank.minus(1).let { mAdditionalTank = it; it >= 0 }) {
            mMainTank++
            totalTank++
        }

        mMainTank -= 5
    }

    return totalTank * 10
    }
}