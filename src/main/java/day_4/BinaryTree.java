package day_4;

import util.Tree;
import util.TreeUtil;

import java.util.*;

/**
 * @author JGod
 * @create 2020-12-21-21:49
 */
public class BinaryTree {

    public static void main(String[] args) {
        TreeUtil.init();
        TreeUtil.afterJudge(after(TreeUtil.getTree()));
    }

    public static Integer[] pre(Tree root){
        LinkedList<Tree> linkedList = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        linkedList.addLast(root);
        while (!linkedList.isEmpty()){
            Tree tree = linkedList.pollLast();
            res.add(tree.getValue());
            if (tree.getRightTree() != null){
                linkedList.addLast(tree.getRightTree());
            }
            if (tree.getLeftTree() != null){
                linkedList.addLast(tree.getLeftTree());
            }
        }
        Integer[] arr = new Integer[res.size()];
        return res.toArray(arr);
    }

    private static Integer[] mid(Tree root){
        LinkedList<Tree> linkedList = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        Tree temp = root;
        boolean flaf = true;
        while (!linkedList.isEmpty() || flaf){
            flaf = false;
            while (temp != null) {
                linkedList.addLast(temp);
                temp = temp.getLeftTree();
            }
            temp = linkedList.getLast();
            res.add(temp.getValue());
            if (temp.getRightTree() != null){ flaf = true; }
            linkedList.pollLast();
            temp = temp.getRightTree();
        }
        Integer[] arr = new Integer[res.size()];
        return res.toArray(arr);
    }

    private static Integer[] after(Tree root){
        LinkedList<Tree> linkedList = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        linkedList.addLast(root);
        while (!linkedList.isEmpty()){
            Tree tree = linkedList.pollLast();
            res.add(tree.getValue());
            if (tree.getLeftTree() != null){
                linkedList.addLast(tree.getLeftTree());
            }
            if (tree.getRightTree() != null){
                linkedList.addLast(tree.getRightTree());
            }
        }
        Collections.reverse(res);
        Integer[] arr = new Integer[res.size()];
        return res.toArray(arr);
    }


    /**
     * 层序遍历
     */
    private static Integer[] ceng(Tree root){
        LinkedList<Tree> linkedList = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        linkedList.addLast(root);
        while (!linkedList.isEmpty()){
            Tree tree = linkedList.pollFirst();
            res.add(tree.getValue());
            if (tree.getLeftTree() != null){
                linkedList.addLast(tree.getLeftTree());
            }
            if (tree.getRightTree() != null){
                linkedList.addLast(tree.getRightTree());
            }
        }
        Integer[] arr = new Integer[res.size()];
        return res.toArray(arr);
    }
}
