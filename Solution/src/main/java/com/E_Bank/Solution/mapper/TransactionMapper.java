package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.TransactionDTO;
import com.E_Bank.Solution.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionDTO toDTO(Transaction transaction);
    Transaction toEntity(TransactionDTO transactionDTO);
}
