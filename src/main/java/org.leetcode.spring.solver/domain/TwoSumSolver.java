package org.leetcode.spring.solver.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TwoSumSolver {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}