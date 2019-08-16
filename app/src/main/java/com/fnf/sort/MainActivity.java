package com.fnf.sort;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Java算法题，以及时间空间复杂度的理解
 * https://leetcode-cn.com/problems/excel-sheet-column-title/
 */
public class MainActivity extends AppCompatActivity {

    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};//6,7,3,4,5,1,2
    //    int[] nums = new int[]{1, 2};//6,7,3,4,5,1,2
//    private int[] arr = new int[]{7, 6, 7, 6, 9};//97211
    //    private int[] arr = new int[]{2, 7, 1, 9, 1};//97211
    private int[][] arr = new int[][]{{2, 2}, {1, 2}, {1, 2}, {1, 1}, {1, 2}, {1, 1}, {2, 2}};//[[2,2],[1,2],[1,2],[1,1],[1,2],[1,1],[2,2]]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sort2 sort2 = new Sort2();
//        int[] ints = sort2.numMovesStones(5, 1, 3);
//        sort2.displace(nums, 3);
        int count = sort2.numEquivDominoPairs(arr);
//        for (int anInt : ints) {
//
        Log.i("onCreate", "count-------------" + count);
//        }
    }


}
