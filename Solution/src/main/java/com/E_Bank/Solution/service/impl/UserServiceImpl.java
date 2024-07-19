package com.E_Bank.Solution.service.impl;

import com.E_Bank.Solution.dto.UserDTO;
import com.E_Bank.Solution.mapper.UserMapper;
import com.E_Bank.Solution.model.Users;
import com.E_Bank.Solution.repository.UsersRepository;
import com.E_Bank.Solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        Users user = userMapper.toEntity(userDTO);
        user = usersRepository.save(user);
        return userMapper.toDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return usersRepository.findAll().stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toDTO(user);
    }

    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setUserName(userDTO.getUserName());
        user.setPassword(userDTO.getPassword());
        usersRepository.save(user);
        return userMapper.toDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}

