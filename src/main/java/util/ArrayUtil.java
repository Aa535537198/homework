package util;

import java.util.Arrays;
import java.util.Random;

/**
 * @author JGod
 * @create 2020-12-15-15:29
 */
public class ArrayUtil {


    private static int[] arr;

    public static int[] randomInit(int size){
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * size);
        }
        return arr;
    }


    public static void judge(int[] arr1){
        if (arr1 == null) System.out.println("回答错误");;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]){
                System.out.println("回答错误");
            }
        }
        if (judgeHelper(arr1)) { System.out.println("回答正确"); }
    }

    public static boolean judgeHelper(int[] arr) {
        Arrays.sort(ArrayUtil.arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ArrayUtil.getArr()[i]){
                System.out.println("不要打破原数组哦，亲！！！");
                return false;
            }
        }
        return true;
    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void setArr(int[] arr) {
        ArrayUtil.arr = arr;
    }
    private static int[] getArr() {
        return arr;
    }
}
