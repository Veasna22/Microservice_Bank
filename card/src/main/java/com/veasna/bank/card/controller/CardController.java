package com.veasna.bank.card.controller;

import com.veasna.bank.card.dto.CardDTO;
import com.veasna.bank.card.entity.Card;
import com.veasna.bank.card.mapper.CardMapper;
import com.veasna.bank.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 8/12/23 15:31
 */
@RestController
@RequestMapping("api/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CardDTO dto) {
        Card loan = cardService.save(cardMapper.toCard(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }

    @GetMapping
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(cardService.getList());
    }




}
