package com.veasna.bank.account.service;

import com.veasna.bank.account.entity.Customer;

import java.util.List;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:25
 */
public interface CustomerService {
    Customer save (Customer customer);
    List<Customer> getCustomers();
    Customer getById(Long id);

}
