package com.veasna.bank.card.service;

import com.veasna.bank.card.entity.Card;

import java.util.List;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 8/12/23 15:19
 */
public interface CardService {
    Card save(Card card);
    List<Card> getList();
}
