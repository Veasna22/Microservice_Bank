package com.veasna.bank.account.service;

import com.veasna.bank.account.dto.AccountDTO;
import com.veasna.bank.account.dto.CustomerDTO;
import com.veasna.bank.account.entity.Account;
import com.veasna.bank.account.entity.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 13:37
 */
@Component
public class AccountMapper {
    public Account toAccount(AccountDTO dto){
        Account account = new Account();
        account.setAccountNumber(dto.getAccountNumber());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        account.setCreateDate(dto.getCreateDate());
//        account.setCustomerId(dto.getCustomerId());
        return account;
    }
}
