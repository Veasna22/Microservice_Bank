package com.veasna.bank.account.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:12
 */
@Getter
@Setter
@ToString
@Document(collection = "accounts")
public class Account {
    private String customerId;
    private String accountNumber;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}
