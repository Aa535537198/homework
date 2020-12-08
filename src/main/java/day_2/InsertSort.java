package day_2;

/**
 * @author JGod
 * @create 2020-12-09-9:29
 */

import util.ArrayUtil;

/**
 * 插入排序： 从前往后一次排序，把一条记录插入到已经排序好的有序列表中
 * 如 {1,7,5,2,3}
 * 排序过程：
 * 1   5   7   2   3
 * 1   5   7   2   3
 * 1   2   5   7   3
 * 1   2   3   5   7
 */
public class InsertSort {

    public static void main(String[] args) {
        int[]  arr = ArrayUtil.randomInit(20);
        ArrayUtil.setArr(arr);
        ArrayUtil.judge(insert(arr));
    }

    private static int[] insert(int[] arr) {
        return arr;
    }

}
