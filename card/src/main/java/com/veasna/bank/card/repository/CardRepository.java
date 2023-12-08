package com.veasna.bank.card.repository;

import com.veasna.bank.card.entity.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 8/12/23 15:27
 */
public interface CardRepository extends MongoRepository<Card, Long> {
}
