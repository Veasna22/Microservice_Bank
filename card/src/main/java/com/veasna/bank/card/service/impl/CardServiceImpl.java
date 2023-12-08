package com.veasna.bank.card.service.impl;

import com.veasna.bank.card.entity.Card;
import com.veasna.bank.card.repository.CardRepository;
import com.veasna.bank.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 8/12/23 15:25
 */
@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getList() {
        return cardRepository.findAll();
    }
}
