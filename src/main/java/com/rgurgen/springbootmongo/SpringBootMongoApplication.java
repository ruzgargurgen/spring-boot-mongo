package com.rgurgen.springbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoApplication.class, args);
    }

}
