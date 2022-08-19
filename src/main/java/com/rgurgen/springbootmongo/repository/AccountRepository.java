package com.rgurgen.springbootmongo.repository;

import com.rgurgen.springbootmongo.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {
}
