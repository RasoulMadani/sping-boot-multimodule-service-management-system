package org.bank.maktabsharif.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank extends BaseEntity<Long>{
    private String name;
    private String code;
    @OneToMany(targetEntity = Branch.class , mappedBy="bank")
    private List<Branch> branches = new ArrayList<>();
}
