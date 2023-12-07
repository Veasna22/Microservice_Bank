package com.veasna.bank.account.controller;

import com.veasna.bank.account.dto.CustomerDTO;
import com.veasna.bank.account.entity.Customer;
import com.veasna.bank.account.service.CustomerMapper;
import com.veasna.bank.account.service.CustomerService;
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
@RequestMapping("api/customers")
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;


    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO dto) {
        Customer customer = customerMapper.toCustomer(dto);
        customer = customerService.save(customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<?> getCustomers(){
        return ResponseEntity.ok(customerService.getCustomers());
    }
    @GetMapping("/{customerId}")
    public ResponseEntity<?> getCustomerById(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.getById(customerId));
    }
}
