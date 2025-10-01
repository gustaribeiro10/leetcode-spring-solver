package org.leetcode.spring.solver.service;


import org.leetcode.spring.solver.domain.TwoSumSolver;
import org.leetcode.spring.solver.models.TwoSumRequestDTO;
import org.leetcode.spring.solver.models.TwoSumResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class LeetCodeService {

    public TwoSumResponseDTO solveTwoSum(TwoSumRequestDTO twoSumRequestDTO) {
        TwoSumSolver twoSumSolver = new TwoSumSolver();
        int[] ints = twoSumSolver.twoSum(twoSumRequestDTO.getNums(), twoSumRequestDTO.getTarget());
        return new TwoSumResponseDTO(ints);
    }
}