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
    fun postorderTraversal(root: TreeNode?): List<Int> {
    return arrayListOf<Int>().apply {
        postorder(root) { add(it) }
    }
}

fun postorder(root: TreeNode?, onReceive: (Int) -> Unit) {
    if (root == null) return

    postorder(root.left, onReceive)
    postorder(root.right, onReceive)
    onReceive(root.`val`)
}
}