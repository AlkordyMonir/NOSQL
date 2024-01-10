package com.example.nosql.repo;

import com.example.nosql.model.Livre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Livre,String> {
}
