package com.example.account.model;
import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name="account_tbl")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String accountNumber;

    public Account(String name, String address, String accountNumber) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
    }
}
