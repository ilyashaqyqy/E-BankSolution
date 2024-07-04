package com.E_Bank.Solution.repository;

import com.E_Bank.Solution.model.Carte;
import com.E_Bank.Solution.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Long> {
    Optional<Carte> findByCompte(Compte compte);
}
