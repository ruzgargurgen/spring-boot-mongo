package com.rgurgen.springbootmongo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private Date birthDate;
    private String password;
    private Date createdAt;
    private Boolean active;
}
