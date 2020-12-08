package day_3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * @author JGod
 * @create 2020-12-20-20:14
 */

/**
 * 二分查找思想：
 *      将有序数组（强调，二分查找的数组为有序数组！！）如：arr =  { 1,  2, 3, 4, 5, 6, 7}， 若要查询数字 6 的下标
 *      则令数组的左右下标分别为left = 0， right = arr.length - 1 = 6
 *      首先取数组中间下标，即：  mid = 0 + （7 - 0） / 2 = 3   则 arr[mid] = 4
 *      则 arr[mid] < 6  则值必定在 下标为 3（mid） 的右边， 则 将left = mid + 1 = 4  right 保持 6
 *      则 mid = 5， arr[mid] =  6, 则为需要读取的数值， 则返回值为 5；
 *
 */

public class BinarySearch {
    private static int[] arr;
    public static void main(String[] args) {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    /**
     * 非递归方式进行二分查找
     */
    public static int binarySearch(int[] arr, int target){

        return -1;
    }

    /**
     * 递归方式二分查找
     */
    public static int binarySearchDfs(int[] arr, int target){
        return help(arr, target, 0, arr.length - 1);
    }

    public static int help(int[] arr, int target, int left, int right){
        return -1;
    }
}
