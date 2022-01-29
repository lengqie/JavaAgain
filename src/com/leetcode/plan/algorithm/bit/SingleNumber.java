package com.leetcode.plan.algorithm.bit;

import java.util.HashSet;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 2,3}));
    }

    /**
     * 使用异或运算，将所有值进行异或
     * 异或运算，相异为真，相同为假，所以 a^a = 0 ;0^a = a
     * 因为异或运算 满足交换律 a^b^a = a^a^b = b 所以数组经过异或运算，单独的值就剩下了
     */
    public static Integer singleNumber(int[] nums){
        int reduce = 0;
        for (int num : nums) {
            reduce =  reduce ^ num;
        }
        return reduce;
    }

    @Deprecated
    public static Integer singleNumber1(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num :
            nums) {
            if (!set.add(num)) {
                //如果添加失败，说明这个值
                //在集合Set中存在，我们要
                //把他给移除掉
                set.remove(num);
            }
        }
        System.out.println(set);
        return (int) set.toArray()[0];
    }
}
