package com.up.upappbemongodb;

import com.up.upappbemongodb.dto.Transactions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionsRepository extends MongoRepository<Transactions, String> {
}
