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
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0){
                if (arr[j - 1] > temp){
                    arr[j] = arr[j - 1];
                    j-=1;
                }else {

                    arr[j] = temp;
                    break;
                }
            }


        }
        ArrayUtil.print(arr);
        return arr;
    }

}


interface A {

}


class C{

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        new C().swap(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        User user = new User();
        System.out.println(user);
        new C().change(user);
        System.out.println(user);
    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
    public void change(User user) {
        user = null;
    }
}
class User{
    public String name = "name";
    public String age = "age";


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

