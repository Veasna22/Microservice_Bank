package com.veasna.bank.account.service.impl;

import com.veasna.bank.account.entity.Customer;
import com.veasna.bank.account.repository.CustomerRepository;
import com.veasna.bank.account.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:26
 */
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
