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
    fun inorderTraversal(root: TreeNode?): List<Int> {
    return arrayListOf<Int>().apply {
        inorder(root) { add(it) }
    }
}

fun inorder(root: TreeNode?, onReceive: (Int) -> Unit) {
    if (root == null) return

    inorder(root.left, onReceive)
    onReceive(root.`val`)
    inorder(root.right, onReceive)
}
}