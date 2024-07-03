package com.E_Bank.Solution.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCart;

    private String numéroCarte;
    private LocalDate dateExpiration;
    private String typeDeCarte;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;
}
