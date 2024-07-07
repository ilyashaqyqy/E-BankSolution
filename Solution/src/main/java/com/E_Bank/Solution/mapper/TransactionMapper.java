package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.TransactionDTO;
import com.E_Bank.Solution.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    @Mappings({
            @Mapping(source = "compte.idCompte", target = "compteId")
    })
    TransactionDTO toDTO(Transaction transaction);

    @Mappings({
            @Mapping(source = "compteId", target = "compte.idCompte")
    })
    Transaction toEntity(TransactionDTO transactionDTO);
}
