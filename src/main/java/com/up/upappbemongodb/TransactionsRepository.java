package com.up.upappbemongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionsRepository extends MongoRepository<Transactions, String> {

}
