package com.veasna.bank.account.service;

import com.veasna.bank.account.dto.CustomerDTO;
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
public class CustomerMapper {
    public Customer toCustomer(CustomerDTO dto){
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setMobileNumber(dto.getMobileNumber());
        customer.setEmail(dto.getEmail());
        customer.setCreateDate(LocalDate.parse(dto.getCreateDate()));
        return customer;
    }
}
