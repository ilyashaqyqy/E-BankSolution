package com.E_Bank.Solution.service;

import com.E_Bank.Solution.dto.TransferDTO;

import java.util.List;

public interface TransferService {
    TransferDTO createTransfer(TransferDTO transferDTO);
    List<TransferDTO> getAllTransfers();
    TransferDTO getTransferById(Long id);
}
