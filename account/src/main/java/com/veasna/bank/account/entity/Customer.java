package com.veasna.bank.account.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:10
 */
@Getter
@Setter
@ToString
@Document(collection = "customers")
public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private LocalDate createDate;

}
