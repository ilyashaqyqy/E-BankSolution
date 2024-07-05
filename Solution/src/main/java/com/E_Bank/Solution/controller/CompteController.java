package com.E_Bank.Solution.controller;

import com.E_Bank.Solution.dto.CompteDTO;
import com.E_Bank.Solution.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comptes")
public class CompteController {

    @Autowired
    private CompteService compteService;

    @PostMapping
    public CompteDTO createCompte(@RequestBody CompteDTO compteDTO) {
        return compteService.createCompte(compteDTO);
    }

    @PutMapping("/{id}")
    public CompteDTO updateCompte(@PathVariable Long id, @RequestBody CompteDTO compteDTO) {
        return compteService.updateCompte(id, compteDTO);
    }

    @GetMapping("/{id}")
    public CompteDTO getCompteById(@PathVariable Long id) {
        return compteService.getCompteById(id);
    }

    @GetMapping
    public List<CompteDTO> getAllComptes() {
        return compteService.getAllComptes();
    }

    @PutMapping("/{id}/close")
    public CompteDTO closeCompte(@PathVariable Long id, @RequestParam String reason) {
        return compteService.closeCompte(id, reason);
    }
}
