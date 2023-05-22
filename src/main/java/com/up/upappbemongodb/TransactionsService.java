package com.up.upappbemongodb;

import com.up.upappbemongodb.dto.TransactionsCurt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

@AllArgsConstructor
@Service
public class TransactionsService {

    @Autowired
    TransactionsCurtRepository transactionsCurtRepository;

    public List<TransactionsCurt> determineRunningTotalFromTransactions() {
        Double runningTotalDouble = 0d;
        int runningTotalInteger = 0;
        List<TransactionsCurt> transactionsCurtRepositoryAll = transactionsCurtRepository.findAll();
        for (TransactionsCurt transactionsCurt : transactionsCurtRepositoryAll) {
            runningTotalDouble += Double.parseDouble(transactionsCurt.getValue());
            transactionsCurt.setRunningTotalDouble(Double.parseDouble(new DecimalFormat("#.##").format(runningTotalDouble)));

            runningTotalInteger += transactionsCurt.getValueInBaseUnits();
            transactionsCurt.setRunningTotalInteger(runningTotalInteger);
        }
        return transactionsCurtRepositoryAll;
    }
}
