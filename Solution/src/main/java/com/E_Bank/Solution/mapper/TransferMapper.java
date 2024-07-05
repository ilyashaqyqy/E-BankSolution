package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.TransferDTO;
import com.E_Bank.Solution.model.Transfer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransferMapper {
    TransferDTO toDTO(Transfer transfer);
    Transfer toEntity(TransferDTO transferDTO);
}
