package com.E_Bank.Solution.mapper;

import com.E_Bank.Solution.dto.UserDTO;
import com.E_Bank.Solution.model.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(Users user);
    Users toEntity(UserDTO userDTO);
}

