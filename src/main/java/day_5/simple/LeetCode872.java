package day_5.simple;

import util.Tree;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JGod
 * @create 2020-12-14-14:44
 */

/**
 * LeetCode: https://leetcode-cn.com/problems/leaf-similar-trees/
 */
public class LeetCode872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return root1 == null && root2 == null;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        midForeach(root1, list1);
        midForeach(root2, list2);
        if (list1.size() != list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;
    }

    public void midForeach(TreeNode root, List<Integer> list) {
        if (root == null){
            return;
        }
        midForeach(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        midForeach(root.right,list);
    }
}
/**
 * 简洁版
 */

class Leet872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return root1 == null && root2 == null;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        midForeach(root1, list1);
        midForeach(root2, list2);
        return list1.size() == list2.size() && list1.equals(list2);
    }

    public void midForeach(TreeNode root, List<Integer> list) {
        if (root == null) return;
        midForeach(root.left, list);
        if (root.left == null && root.right == null)  list.add(root.val);
        midForeach(root.right,list);
    }
}
