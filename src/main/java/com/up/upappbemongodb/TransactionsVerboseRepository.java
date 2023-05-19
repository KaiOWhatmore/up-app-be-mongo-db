package com.up.upappbemongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionsVerboseRepository extends MongoRepository<TransactionsVerbose, String> {
}
