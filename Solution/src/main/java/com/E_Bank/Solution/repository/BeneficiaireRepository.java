package com.E_Bank.Solution.repository;

import com.E_Bank.Solution.model.Beneficiaire;
import com.E_Bank.Solution.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Long> {
    List<Beneficiaire> findByCompte(Compte compte);
}
