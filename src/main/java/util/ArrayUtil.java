package util;

import java.util.Arrays;
import java.util.Random;

/**
 * @author JGod
 * @create 2020-12-15-15:29
 */
public class ArrayUtil {

    public static int[] randomInit(int size){
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
        return arr;
    }

    public static boolean judge(int[] arr1){
        if (arr1 == null) return false;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]){
                System.out.println("回答错误");
                return false;
            }
        }
        System.out.println("回答正确");
        return true;
    }


}
