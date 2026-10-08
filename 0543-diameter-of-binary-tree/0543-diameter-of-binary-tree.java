/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }
    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight, rheight) + 1;
    }
    int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int sp = height(root.left) + height(root.right);
        return Math.max(Math.max(ld,rd), sp);
    }
}