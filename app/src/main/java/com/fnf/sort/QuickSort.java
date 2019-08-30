package com.fnf.sort;

import android.util.Log;

/**
 * @ProjectName: JavaSort
 * @Package: com.fnf.sort
 * @ClassName: QuickSort
 * @Description: 快速排序
 * @Author: Fu_NaiFu
 * @CreateDate: 2019/8/30 11:48
 * @UpdateUser: 更新者：Fu_NaiFu
 * @UpdateDate: 2019/8/30 11:48
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class QuickSort {

    public void execute() {
        int[] arr = new int[]{12, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 89};
        quickSort(arr, 0, arr.length - 1);
        Log.i("QuickSort", "execute====:");
        for (int i : arr) {
            Log.i("QuickSort", "i====:" + i);
        }
    }

    private void quickSort(int[] ags, int low, int high) {
        if (ags == null || ags.length == 0)
            return;
        if (low > high)
            return;
        int tem = ags[low];
        int i = low;
        int j = high;
        while (i < j) {

            while (i < j && ags[j] >= tem)
                j--;
            while (i < j && ags[i] <= tem)
                i++;

            int x = ags[i];
            ags[i] = ags[j];
            ags[j] = x;
        }
        ags[low] = ags[i];
        ags[i] = tem;
        quickSort(ags, low, i - 1);
        quickSort(ags, i + 1, high);
    }

}
