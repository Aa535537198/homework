package util;


/**
 * @author JGod
 * @create 2020-12-21-21:49
 */
public class Tree {

    private int value;

    private Tree leftTree;

    private Tree rightTree;

    public Tree(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tress{" +
                "value=" + value +
                '}';
    }

    public Tree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(Tree leftTree) {
        this.leftTree = leftTree;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tree getRightTree() {
        return rightTree;
    }

    public void setRightTree(Tree rightTree) {
        this.rightTree = rightTree;
    }
}
