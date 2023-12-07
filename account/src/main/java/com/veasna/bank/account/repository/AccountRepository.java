package com.veasna.bank.account.repository;

import com.veasna.bank.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:21
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}
