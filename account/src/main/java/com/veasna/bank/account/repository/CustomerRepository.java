package com.veasna.bank.account.repository;

import com.veasna.bank.account.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 30/11/23 12:21
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
