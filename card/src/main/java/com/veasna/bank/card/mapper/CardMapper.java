package com.veasna.bank.card.mapper;

import com.veasna.bank.card.dto.CardDTO;
import com.veasna.bank.card.entity.Card;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author Veasna
 * @version 1.0
 * @license Veasna , LLC
 * @since 8/12/23 15:33
 */
@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toCard(CardDTO cardDTO);

}
