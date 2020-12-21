package day_5.simple;


import util.TreeNode;

import java.util.LinkedList;

/**
 * @author JGod
 * @create 2020-12-14-14:15
 */

/**
 * LeetCode网址： https://leetcode-cn.com/problems/check-balance-lcci/submissions/
 */
public class LeetCode04 {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        return foreach(root);
    }

    public boolean foreach(TreeNode root){
        LinkedList<TreeNode> linkedList =  new LinkedList<>();
        linkedList.addLast(root);

        while (linkedList.isEmpty()){
            TreeNode temp = linkedList.pollLast();
            if (!balance(temp)) return false;
            if (temp.left != null){
                linkedList.addLast(temp.left);
            }
            if (temp.right != null) linkedList.addLast(temp.right);
        }
        return true;
    }

    public boolean balance(TreeNode root){
        if (root == null) return true;
        if (Math.abs(maxLength(root.left) - maxLength(root.right)) > 1){
            return false;
        }
        return true;
    }

    public int maxLength(TreeNode root) {
        if (root == null){
            return 0;
        }
        return 1 + Math.max(maxLength(root.left), maxLength(root.right));
    }

}
/**
 * 简洁版
 */

class Leet04{

    public boolean isBalanced(TreeNode root) {
        return root == null || (Math.abs(maxLength(root.left) - maxLength(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }


    public int maxLength(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxLength(root.left), maxLength(root.right));
    }


}
