package org.bank.maktabsharif.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Branch extends BaseEntity<Long>{
    private String name;
    @ManyToOne
    @JoinColumn(name = "bank_id", referencedColumnName = "id")
    private Bank bank;
    @OneToMany(targetEntity = Account.class , mappedBy="branch")
    private List<Account> accounts = new ArrayList<>();

}
