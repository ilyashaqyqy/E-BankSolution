package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.CompteDTO;
import com.E_Bank.Solution.model.Compte;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompteMapper {
    CompteDTO toDTO(Compte compte);
    Compte toEntity(CompteDTO compteDTO);
}
