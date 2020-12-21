package day_5.simple;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JGod
 * @create 2020-12-14-14:58
 */

/**
 * leetCode： https://leetcode-cn.com/problems/binary-tree-paths/
 */
public class LeetCode257 {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        layer(root, "", res);
        return res;
    }


    public void layer(TreeNode root, String cur, List<String> res){
        cur += "->" + root.val;
        if (root.left == null && root.right == null){
            cur = cur.substring(2);
            res.add(cur);
        }

        if (root.left != null){
            layer(root.left, cur, res);
        }

        if (root.right != null){
            layer(root.right, cur, res);
        }
    }


}
/**
 * 简洁版
 */
 class Leet257 {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        layer(root, new StringBuilder(), res);
        return res;
    }


    public void layer(TreeNode root, StringBuilder cur, List<String> res){
        if (root == null) return;
        cur.append("->").append(root.val);
        if (root.left == null && root.right == null){
            res.add(cur.toString().substring(2));
        }
        layer(root.left, new StringBuilder(cur), res);
        layer(root.right, new StringBuilder(cur), res);
    }


}
