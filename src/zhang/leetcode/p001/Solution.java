package src.zhang.leetcode.p001;

public class Solution {
    public int climbStairs(int n){
        if (n <= 2) return n;
    //创建一个答案列表
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i = 2;i<n;i++){
            res[i] = res[i-1] + res[i-2];
    }
        return res[n-1];
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // --- 测试用例 ---

        // 测试用例 1: 边界情况
        int n1 = 2;
        int expected1 = 2;
        int actual1 = solution.climbStairs(n1);
        System.out.println("输入 n=" + n1 + ", 期望结果: " + expected1 + ", 实际结果: " + actual1);

        // 测试用例 2: 常规情况
        int n2 = 5;
        int expected2 = 8;
        int actual2 = solution.climbStairs(n2);
        System.out.println("输入 n=" + n2 + ", 期望结果: " + expected2 + ", 实际结果: " + actual2);

        // 测试用例 3: 另一个常规情况
        int n3 = 3;
        int expected3 = 3;
        int actual3 = solution.climbStairs(n3);
        System.out.println("输入 n=" + n3 + ", 期望结果: " + expected3 + ", 实际结果: " + actual3);
    }
}

