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
    fun preorderTraversal(root: TreeNode?): List<Int> {
    return arrayListOf<Int>().apply {
        preorder(root) { add(it) }
    }
}

fun preorder(root: TreeNode?, onReceive: (Int) -> Unit) {
    if (root == null) return

    onReceive(root.`val`)
    preorder(root.left, onReceive)
    preorder(root.right, onReceive)
}
}