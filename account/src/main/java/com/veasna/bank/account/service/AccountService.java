package com.veasna.bank.account.service;

import com.veasna.bank.account.entity.Account;
import com.veasna.bank.account.entity.Customer;

import java.util.List;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:25
 */
public interface AccountService {
    Account save (Account account);
    List<Account> getAccounts();
    Account getById(Long id);

}
