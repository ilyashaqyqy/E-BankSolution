package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.CarteDTO;
import com.E_Bank.Solution.model.Carte;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarteMapper {
    CarteDTO toDTO(Carte carte);
    Carte toEntity(CarteDTO carteDTO);
}
