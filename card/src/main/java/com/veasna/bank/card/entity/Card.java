package com.veasna.bank.card.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 8/12/23 15:15
 */
@Getter
@Setter
@ToString
@Document(collection = "cards")
public class Card {
    private Long cardId;
    private Long customerId;
    private String cardNumber;
    private String cardType;
    private BigDecimal totalLimit;
    private BigDecimal amountUsed;
    private BigDecimal availableAmount;
    private LocalDate createDate;

}
