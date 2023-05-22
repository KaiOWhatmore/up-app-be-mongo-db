package com.up.upappbemongodb;

import com.up.upappbemongodb.dto.TransactionsCurt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionsCurtRepository extends MongoRepository<TransactionsCurt, String> {

}
