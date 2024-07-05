package com.E_Bank.Solution.service.impl;

import com.E_Bank.Solution.dto.TransferDTO;
import com.E_Bank.Solution.mapper.TransferMapper;
import com.E_Bank.Solution.model.Transfer;
import com.E_Bank.Solution.repository.TransferRepository;
import com.E_Bank.Solution.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TransferMapper transferMapper;

    @Override
    public TransferDTO createTransfer(TransferDTO transferDTO) {
        Transfer transfer = transferMapper.toEntity(transferDTO);
        transfer = transferRepository.save(transfer);
        return transferMapper.toDTO(transfer);
    }

    @Override
    public List<TransferDTO> getAllTransfers() {
        return transferRepository.findAll().stream()
                .map(transferMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TransferDTO getTransferById(Long id) {
        Transfer transfer = transferRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transfer not found"));
        return transferMapper.toDTO(transfer);
    }
}
