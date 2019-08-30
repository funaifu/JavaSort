package com.fnf.sort;

import android.util.Log;

/**
 * @ProjectName: JavaSort
 * @Package: com.fnf.sort
 * @ClassName: Fibonacci
 * @Description: 斐波那契数列
 * @Author: Fu_NaiFu
 * @CreateDate: 2019/8/28 16:22
 * @UpdateUser: 更新者：Fu_NaiFu
 * @UpdateDate: 2019/8/28 16:22
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class Fibonacci {

    public void printlnByFor(int number) {
        int[] arr = new int[number];
        arr[0] = 1;
        arr[1] = 1;
        Log.i("Fibonacci", "" + arr[0]);
        Log.i("Fibonacci", "" + arr[1]);
        for (int i = 2; i < number; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            Log.i("Fibonacci", "" + arr[i]);
        }

//        for (int i = 0; i < number; i++) {
//            int x = printlnByRecursion(i);
//            Log.i("Fibonacci", "" + x);
//            //102334155
//        }

    }

    public int printlnByRecursion(int i) {
        if (i < 2)
            return 1;
        return printlnByRecursion(i - 1) + printlnByRecursion(i - 2);
    }

}
