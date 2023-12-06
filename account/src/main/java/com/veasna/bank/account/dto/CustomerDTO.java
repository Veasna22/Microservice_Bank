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
public class CustomerDTO {
    private String customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private String createDate;
}
