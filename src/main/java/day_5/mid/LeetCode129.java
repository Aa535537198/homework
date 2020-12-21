package day_5.mid;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author JGod
 * @create 2020-12-16-16:44
 */

/**
 * LeetCode: https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/submissions/
 */
public class LeetCode129 {

    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, new StringBuilder(),  list);
        AtomicInteger sum = new AtomicInteger();
        list.forEach((x) -> sum.getAndSet(sum.get() + x));
        return sum.get();
    }


    public void dfs(TreeNode root, StringBuilder sb, List<Integer> res) {
        if (root == null) return;
        sb.append(root.val);
        if (root.left == null && root.right == null){
            res.add(Integer.parseInt(sb.toString()));
        }

        dfs(root.left, new StringBuilder(sb), res);

        dfs(root.right, new StringBuilder(sb), res);
    }

}

/**
 * 简洁版
 */
class Leet129{
    private int sum;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }


    public void dfs(TreeNode root, Integer res) {
        if (root == null) return;
        res = res * 10 + root.val;
        if (root.left == null && root.right == null){
            sum += res;
        }

        dfs(root.left, res);

        dfs(root.right, res);
    }

}
