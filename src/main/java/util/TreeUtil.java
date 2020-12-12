package util;


import java.util.ArrayList;
import java.util.List;

/**
 * @author JGod
 * @create 2020-12-21-21:52
 */
public class TreeUtil {

    private static Tree tree;
    private static List<Integer> list = new ArrayList<>();
    /**
     *
     * 前序遍历：   1   2   4   8   5   9   3   6   7   10
     * 中序遍历：   8   4   2   5   9   1   6   3   7   10
     * 后续遍历：   8   4   9   5   2   6   10  7   3   1
     * 二叉树原型
     *                1
*              2           3
     *     4      5     6      7
     *  8           9            10
     *                              11
     * @return
     */
    public static Tree init(){
        Tree root = new Tree(1);
        Tree tree2 = new Tree(2);
        Tree tree3 = new Tree(3);
        Tree tree4 = new Tree(4);
        Tree tree5 = new Tree(5);
        Tree tree6 = new Tree(6);
        Tree tree7 = new Tree(7);
        Tree tree8 = new Tree(8);
        Tree tree9 = new Tree(9);
        Tree tree10 = new Tree(10);
        Tree tree11 = new Tree(11);

        root.setLeftTree(tree2);
        root.setRightTree(tree3);

        tree2.setLeftTree(tree4);
        tree2.setRightTree(tree5);

        tree3.setLeftTree(tree6);
        tree3.setRightTree(tree7);

        tree4.setLeftTree(tree8);

        tree5.setRightTree(tree9);
        tree7.setRightTree(tree10);

        tree10.setRightTree(tree11);

        TreeUtil.tree = root;
        return root;
    }

    private static void pre(Tree root){
        if (root == null){
            return;
        }
        list.add(root.getValue());
        pre(root.getLeftTree());
        pre(root.getRightTree());
    }

    public static void preJudge(Integer[] arr){
        pre(TreeUtil.tree);
        judge(arr);
    }

    private static void mid(Tree root){
        if (root == null){
            return;
        }
        mid(root.getLeftTree());
        list.add(root.getValue());
        mid(root.getRightTree());
    }

    public static void midJudge(Integer[] arr){
        mid(TreeUtil.tree);
        judge(arr);
    }

    private static void after(Tree root){
        if (root == null){
            return;
        }
        after(root.getLeftTree());
        after(root.getRightTree());
        list.add(root.getValue());
    }

    public static void afterJudge(Integer[] arr){
        after(TreeUtil.tree);
        judge(arr);
    }

    public static Tree getTree() {
        return tree;
    }

    public static void setTree(Tree tree) {
        TreeUtil.tree = tree;
    }

    public static void judge(Integer[] arr) {
        if (arr.length != list.size()){
            System.out.println("解答错误");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(list.get(i))){
                System.out.println("解答错误");
                return;
            }
        }
        System.out.println("恭喜，解答正确");
    }
}
