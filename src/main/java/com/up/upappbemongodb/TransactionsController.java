package com.up.upappbemongodb;

import com.up.upappbemongodb.dto.Transactions;
import com.up.upappbemongodb.dto.TransactionsCurt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionsController {

    @Autowired
    private final TransactionsCurtRepository transactionsCurtRepository;

    @Autowired
    private final TransactionsRepository transactionsRepository;

    @Autowired
    private final TransactionsService transactionsService;

    @GetMapping("/curt")
    public List<TransactionsCurt> getAllTransactions() {
        return transactionsCurtRepository.findAll();
    }

    @GetMapping("/curt/runningTotal")
    public List<TransactionsCurt> getAllCurtTransactionsRunningTotal() {return transactionsService.determineRunningTotalFromTransactions();}

    @GetMapping("verb")
    public List<Transactions> getAllTransactionsVerbose() {
        return transactionsRepository.findAll();
    }



}
