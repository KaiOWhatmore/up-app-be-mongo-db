package com.up.upappbemongodb;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionsController {

    private final TransactionsRepository transactionsRepository;

    private final TransactionsVerboseRepository transactionsVerboseRepository;

    @GetMapping("/succ")
    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    @GetMapping("verb")
    public List<TransactionsVerbose> getAllTransactionsVerbose() {
        return transactionsVerboseRepository.findAll();
    }



}
