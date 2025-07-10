package src.zhang.leetcode.p002;
import java.util.Arrays;

public class Solution {
    public int minCost(int[] costs) {
        int len = costs.length;
        int[] result = new int[len];
        result[0] = 0;
        result[1] = 0;
        for (int i = 2; i < len; i++) {
            result[i] = Math.min(result[i-2]+costs[i-2], result[i-1]+costs[i-1]);
        }
        return result[len-1];
    }
}
