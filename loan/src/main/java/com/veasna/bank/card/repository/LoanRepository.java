package com.veasna.bank.card.repository;

import com.veasna.bank.card.entity.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 7/12/23 15:14
 */
public interface LoanRepository extends MongoRepository<Loan, Long> {
}
