package day_1;

/**
 * @author JGod
 * @create 2020-12-15-15:25
 */

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 选择排序：
 *      每次从待排序的算法中选取出最小或者最大的数字，放在数组的头部或者尾部，然后重复此操作
 */
public class SelectSort {

    public static void main(String[] args) {
        ArrayUtil.judge(selectMax(ArrayUtil.randomInit(5000)));
    }

    private static int[] select(int[] arr) {
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
        }
        return arr;
    }

    private static int[] selectMax(int[] arr){
        int maxIndex ;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            maxIndex = 0;
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[len - 1- i];
            arr[len - 1 - i] = temp;
        }
        return arr;
    }
}
