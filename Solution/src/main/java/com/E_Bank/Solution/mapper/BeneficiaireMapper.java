package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.BeneficiaireDTO;
import com.E_Bank.Solution.model.Beneficiaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface BeneficiaireMapper {
    @Mapping(source = "compteId", target = "compte.idCompte")
    Beneficiaire toEntity(BeneficiaireDTO beneficiaireDTO);

    @Mapping(source = "compte.idCompte", target = "compteId")
    BeneficiaireDTO toDTO(Beneficiaire beneficiaire);
}
