package org.leetcode.spring.solver.service;

import org.leetcode.spring.solver.domain.TwoSumSolver;
import org.leetcode.spring.solver.models.TwoSumRequestDTO;
import org.leetcode.spring.solver.models.TwoSumResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeetCodeService {

    @Autowired
    public TwoSumSolver twoSumSolver;

    public TwoSumResponseDTO solveTwoSum(TwoSumRequestDTO twoSumRequestDTO) {
        int[] intsResult = TwoSumSolver.twoSum(twoSumRequestDTO.getNums(), twoSumRequestDTO.getTarget());
        return new TwoSumResponseDTO(intsResult);
    }
}