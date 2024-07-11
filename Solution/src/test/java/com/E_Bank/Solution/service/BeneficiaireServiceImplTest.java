package com.E_Bank.Solution.service;

import com.E_Bank.Solution.dto.BeneficiaireDTO;
import com.E_Bank.Solution.mapper.BeneficiaireMapper;
import com.E_Bank.Solution.model.Beneficiaire;
import com.E_Bank.Solution.model.Compte;
import com.E_Bank.Solution.repository.BeneficiaireRepository;
import com.E_Bank.Solution.repository.CompteRepository;
import com.E_Bank.Solution.service.impl.BeneficiaireServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class BeneficiaireServiceImplTest {

    @InjectMocks
    private BeneficiaireServiceImpl beneficiaireService;

    @Mock
    private BeneficiaireRepository beneficiaireRepository;

    @Mock
    private CompteRepository compteRepository;

    @Mock
    private BeneficiaireMapper beneficiaireMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateBeneficiaire() {
        // Prepare test data
        BeneficiaireDTO beneficiaireDTO = new BeneficiaireDTO();
        beneficiaireDTO.setName("anass anis");
        beneficiaireDTO.setAccountNumber("2233449992");
        beneficiaireDTO.setBankName("CIH");
        beneficiaireDTO.setCompteId(8L);

        Compte compte = new Compte();
        compte.setIdCompte(8L);

        Beneficiaire beneficiaire = new Beneficiaire();
        beneficiaire.setName("anass anis");
        beneficiaire.setAccountNumber("2233449992");
        beneficiaire.setBankName("CIH");
        beneficiaire.setCompte(compte);

        Beneficiaire savedBeneficiaire = new Beneficiaire();
        savedBeneficiaire.setBeneficiaireId(5L);
        savedBeneficiaire.setName("anass anis");
        savedBeneficiaire.setAccountNumber("2233449992");
        savedBeneficiaire.setBankName("CIH");
        savedBeneficiaire.setCompte(compte);

        when(compteRepository.findById(8L)).thenReturn(Optional.of(compte));
        when(beneficiaireMapper.toEntity(beneficiaireDTO)).thenReturn(beneficiaire);
        when(beneficiaireRepository.save(any(Beneficiaire.class))).thenReturn(savedBeneficiaire);
        when(beneficiaireMapper.toDTO(savedBeneficiaire)).thenReturn(beneficiaireDTO);

        // Execute the service method
        BeneficiaireDTO createdBeneficiaireDTO = beneficiaireService.addBeneficiaire(beneficiaireDTO);

        // Assert the result
        assertNotNull(createdBeneficiaireDTO);
        assertEquals("anass anis", createdBeneficiaireDTO.getName());
        assertEquals("2233449992", createdBeneficiaireDTO.getAccountNumber());
        assertEquals("CIH", createdBeneficiaireDTO.getBankName());
        assertEquals(8L, createdBeneficiaireDTO.getCompteId());
    }
}
