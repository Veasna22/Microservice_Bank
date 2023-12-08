package com.veasna.bank.account.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 13:34
 */
@Getter
@Setter
@ToString
public class AccountDTO {
    private Long customerId;
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}
