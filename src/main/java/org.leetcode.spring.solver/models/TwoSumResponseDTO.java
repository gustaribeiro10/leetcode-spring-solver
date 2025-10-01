package org.leetcode.spring.solver.models;

public class TwoSumResponseDTO {

    private int[] solution;

    public TwoSumResponseDTO(int[] solution) {
        this.solution = solution;
    }

    public int[] getSolution() {
        return solution;
    }

    public void setSolution(int[] solution) {
        this.solution = solution;
    }
}
