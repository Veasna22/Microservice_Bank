package com.veasna.bank.card.mapper;

import com.veasna.bank.card.dto.LoanDTO;
import com.veasna.bank.card.entity.Loan;
import org.springframework.stereotype.Component;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 7/12/23 15:17
 */
@Component
public class LoanMapper {

    public Loan toLoan(LoanDTO dto){
        Loan loan = new Loan();
        loan.setAmountPaid(dto.getAmountPaid());
        loan.setCreateDate(dto.getCreateDate());
        loan.setCustomerId(dto.getCustomerId());
        loan.setLoanNumber(dto.getLoanNumber());
        loan.setLoanType(dto.getLoanType());
        loan.setOutstandingAmount(dto.getOutstandingAmount());
        loan.setStartDate(dto.getStartDate());
        loan.setTotalLoan(dto.getTotalLoan());
        return loan;
    }
}
