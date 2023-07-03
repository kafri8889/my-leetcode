/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDiffInBST(root: TreeNode?): Int {
    var (min, prev) = Pair<Int, Int?>(Int.MAX_VALUE, null)
    inorder(root) { if (prev != null) { min = Math.min(min, it - (prev ?: 0)) }; prev = it }
    return min
}

fun inorder(root: TreeNode?, onReceive: (Int) -> Unit) {
    if (root == null) return

    inorder(root.left, onReceive)
    onReceive(root.`val`)
    inorder(root.right, onReceive)
}
}