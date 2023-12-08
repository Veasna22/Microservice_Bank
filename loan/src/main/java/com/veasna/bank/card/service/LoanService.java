package com.veasna.bank.card.service;

import com.veasna.bank.card.entity.Loan;

import java.util.List;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 7/12/23 14:46
 */
public interface LoanService {
    Loan save(Loan loan);
    List<Loan> getList();
//    Loan getById(Long id);

}
