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
    public static void main(String[] args) {
        ArrayUtil.judge(1000);
    }

    /**
     * 非递归方式进行二分查找
     */
    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (arr[mid] > target){
                r = mid - 1;
            }else if (arr[mid] < target){
                l = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归方式二分查找
     */
    public static int binarySearchDfs(int[] arr, int target){
        return help(arr, target, 0, arr.length - 1);
    }

    public static int help(int[] arr, int target, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] > target){
            return help(arr, target, left, mid - 1);
        }else if (arr[mid] < target) {
            return help(arr, target, mid + 1, right);
        }else {
            return mid;
        }

    }
}
