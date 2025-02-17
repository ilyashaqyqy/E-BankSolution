package com.E_Bank.Solution.repository;

import com.E_Bank.Solution.dto.UserDTO;
import com.E_Bank.Solution.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUserName(String userName);


}
