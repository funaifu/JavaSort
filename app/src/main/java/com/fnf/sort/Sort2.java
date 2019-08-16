package com.fnf.sort;

import android.util.Log;

import java.util.Arrays;

/**
 * @ProjectName: JavaSort
 * @Package: com.fnf.sort
 * @ClassName: Sort2
 * @Description: java类作用描述
 * @Author: Fu_NaiFu
 * @CreateDate: 2019/8/15 15:03
 * @UpdateUser: 更新者：Fu_NaiFu
 * @UpdateDate: 2019/8/15 15:03
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class Sort2 {
    /**
     * 数组旋转
     *
     * @param nums
     * @param k
     */
    public void displace(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int next = nums[nums.length - 1];
            for (int y = 0; y < nums.length; y++) {
                int tem = nums[y];
                nums[y] = next;
                next = tem;
            }
        }
    }

    /**
     * 返回表格行列
     *
     * @param n
     * @return
     */
    public String convert(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        while (n > 0) {
            int y = n % 26;
            if (y == 0) {
                y = 26;
                n -= 1;
            }
            char c = (char) ((y - 1) + (int) 'A');
            stringBuffer.insert(0, c);
            n = n / 26;
        }
        return stringBuffer.toString();
    }
//    有一堆石头，每块石头的重量都是正整数。
////
////    每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
////
////    如果 x == y，那么两块石头都会被完全粉碎；
////    如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
////    最后，最多只会剩下一块石头。返回此石头最小的可能重量。如果没有石头剩下，就返回 0。

    public int min(int[] stones) {
        if (stones == null)
            return 0;
        Arrays.sort(stones);
        int[] newArr;
        do {
            if (stones.length < 2)
                return stones[0];

            int i = stones.length - 1;
            int tem = stones[i] - stones[i - 1];
            newArr = new int[i];
            for (int x = 0; x < newArr.length; x++) {
                if (x == newArr.length - 1)
                    newArr[x] = tem;
                else
                    newArr[x] = stones[x];
            }
            stones = newArr;
            Arrays.sort(stones);
        } while (stones.length > 1);
        return newArr[0];
    }

    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int[] numMovesStones(int a, int b, int c) {
        int[] answer = new int[2];
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int center = a + b + c - max - min;
        if (max - center < 2 && center - min < 2)
            answer[0] = 0;
        else if (max - center > 2 && center - min > 2)
            answer[0] = 2;
        else
            answer[0] = 1;

        answer[1] = max - min - 2;
        return answer;
    }

    /**
     * 山脉数据
     *
     * @param A
     * @return
     */
    public boolean validMountainArray(int[] A) {
        int length = A.length;
        if (length < 3)
            return false;
        int y = 0;

        while (y + 1 < length && A[y] < A[y + 1])
            y++;
        if (y == 0 || y == length - 1)
            return false;
        while (y + 1 < length && A[y] > A[y + 1])
            y++;
        return y == length - 1;
    }
//    给你一个由一些多米诺骨牌组成的列表 dominoes。
//
//    如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
//
//    形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
//
//    在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。


    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int len = dominoes.length;
        int x = len;
        int y = x - 1;
        int i = 0;
        int j = 0;
        while (i <= y * (y - 1)) {
            int index = i % (len - 1);
            if (index == 0) {
                j += 1;
            }
            if (index + j >= len) {
                continue;
            }
            int[] current = dominoes[index];
            int[] next = dominoes[index + j];
            if ((current[0] == next[0] && current[1] == next[1])
                    || (current[0] == next[1] && current[1] == next[0])) {
                count += 1;
            }
            i += 1;
        }
        return count;
    }

}
