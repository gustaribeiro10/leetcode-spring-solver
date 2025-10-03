package org.leetcode.spring.solver.models;

import jakarta.validation.constraints.NotNull;

public class TwoSumRequestDTO {

    @NotNull
    private int[] nums;

    @NotNull
    private int target;

    public int[] getNums() {
        return nums;
    }

    public int getTarget() {
        return target;
    }
}