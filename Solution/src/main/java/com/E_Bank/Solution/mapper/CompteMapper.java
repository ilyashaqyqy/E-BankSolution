package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.CompteDTO;
import com.E_Bank.Solution.model.Compte;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompteMapper {
    @Mapping(source = "userId", target = "user.userId")
    Compte toEntity(CompteDTO compteDTO);

    @Mapping(source = "user.userId", target = "userId")
    CompteDTO toDTO(Compte compte);
}