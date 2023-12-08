package com.veasna.bank.card.service.impl;

import com.veasna.bank.card.entity.Loan;
import com.veasna.bank.card.repository.LoanRepository;
import com.veasna.bank.card.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 7/12/23 15:13
 */
@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> getList() {
        return loanRepository.findAll();
    }
}
