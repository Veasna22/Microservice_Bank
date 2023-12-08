package com.veasna.bank.account.controller;

import com.veasna.bank.account.dto.AccountDTO;
import com.veasna.bank.account.entity.Account;
import com.veasna.bank.account.service.AccountMapper;
import com.veasna.bank.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 13:29
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/accounts")
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;


    @PostMapping
    public ResponseEntity<?> saveAccount (@RequestBody AccountDTO dto) {
        Account account = accountMapper.toAccount(dto);
        account = accountService.save(account);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public ResponseEntity<?> getAccounts (){
        return ResponseEntity.ok(accountService.getAccounts());
    }
    @GetMapping("/{accountId}")
    public ResponseEntity<?> getAccountsById(@PathVariable Long accountId){
        return ResponseEntity.ok(accountService.getById(accountId));
    }
}
