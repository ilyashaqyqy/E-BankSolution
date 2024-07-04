package com.E_Bank.Solution.dto;

import com.E_Bank.Solution.model.Compte;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferDTO {
    private Double montant;
    private LocalDateTime dateHeure;
    private String description;
    private Compte compteSource;
    private Compte compteDestination;
}
