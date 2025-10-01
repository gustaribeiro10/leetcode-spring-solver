package org.leetcode.spring.solver.controllers;


import jakarta.validation.Valid;
import org.leetcode.spring.solver.models.TwoSumRequestDTO;
import org.leetcode.spring.solver.models.TwoSumResponseDTO;
import org.leetcode.spring.solver.service.LeetCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeetCodeController {

    @Autowired
    private LeetCodeService leetCodeService;

    @PostMapping("/two-sum-solve")
    public ResponseEntity<TwoSumResponseDTO> twoSumSolve(@RequestBody @Valid TwoSumRequestDTO twoSumRequestDTO) {
        TwoSumResponseDTO twoSumResponseDTO = leetCodeService.solveTwoSum(twoSumRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(twoSumResponseDTO);
    }
}