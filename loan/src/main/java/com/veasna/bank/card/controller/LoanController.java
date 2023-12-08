package com.veasna.bank.card.controller;

import com.veasna.bank.card.dto.LoanDTO;
import com.veasna.bank.card.entity.Loan;
import com.veasna.bank.card.mapper.LoanMapper;
import com.veasna.bank.card.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 7/12/23 15:15
 */
@RestController
@RequestMapping("api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private LoanMapper loanMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody LoanDTO dto) {
        Loan loan = loanService.save(loanMapper.toLoan(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }

    @GetMapping
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(loanService.getList());
    }




}
