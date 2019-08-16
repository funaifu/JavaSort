package com.fnf.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: JavaSort
 * @Package: com.fnf.sort
 * @ClassName: Sort1
 * @Description: Java一些算法题，以及时间空间复杂度的理解(选择排序，冒泡排序，数组中三个数的和等于target的组合，数组中两个数的和等于target的组合)
 * @Author: Fu_NaiFu
 * @CreateDate: 2019/8/15 15:01
 * @UpdateUser: 更新者：Fu_NaiFu
 * @UpdateDate: 2019/8/15 15:01
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class Sort1 {
    private int arr[] = new int[]{100, 32, 1, 35, 15, 40, 80};
    private int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
//    private int nums[] = new int[]{2, 5, 5, 8, -7, -9, 5, -1, -4, 2, 8, 4, -6, -2, -2, 9, -2, 13, 1, 0, 9, 9, 4, -13, 13, 3, -14, 11, -5, -13, 3, 4, 7, -15, -11, 7, 13, 1, 13, -14, 11, -1, 5, -10, 12, 11, 14, -13, 1, -8, 3, -4, -14, 14, -10, -15, -6, -9, 3, -4, -7, -8, -15, 8, -8, 12, -8, 13, -2, -9, 14, -6, 5, -3, -9, -6, -7, -10, -3, 9, -2, 7, -10, -9, -2, -5, 13, 7, -6, 2, -12, -6, 1, 10, 9, 0, 7, -13, -2, -9, -7, -2, -8, 5, 10, -1, 6, -12, 4, 10, 12, 9, 2, 10, 8, -15, 12, 6, -1, -9, -7, 2};

    /**
     * 选择排序
     */
    private void selectorSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int y = i + 1; y < arr.length; y++) {
                if (arr[i] < arr[y]) {
                    int tem = arr[i];
                    arr[i] = arr[y];
                    arr[y] = tem;
                }
            }
        }
    }

    /**
     * 冒泡排序
     */
    private void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
    }

    /**
     * 数组中两个数的和等于target的组合
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if ((nums[i] + nums[y]) == target) {
                    index[0] = i;
                    index[1] = y;
                    return index;
                }

            }
        }
        return index;
    }

    /**
     * 数组中三个数的和等于target的组合
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> parent = new ArrayList<>();
        if (nums.length < 3)
            return parent;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0)
                break;
            int start = i + 1;
            int last = nums.length - 1;
            while (start < last) {
                int sum = nums[i] + nums[start] + nums[last];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[last]);
                    parent.add(list);
                    while (start < last && nums[start] == nums[start + 1]) start++;
                    while (start < last && nums[last] == nums[last - 1]) last--;
                    start++;
                    last--;
                } else if (sum < 0) {
                    start++;
                } else {
                    last--;
                }
            }
        }
        return parent;
    }
}
