package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.BeneficiaireDTO;
import com.E_Bank.Solution.model.Beneficiaire;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BeneficiaireMapper {
    BeneficiaireDTO toDTO(Beneficiaire beneficiaire);
    Beneficiaire toEntity(BeneficiaireDTO beneficiaireDTO);
}
