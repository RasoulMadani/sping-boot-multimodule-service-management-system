package org.bank.maktabsharif.entity;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity<Long>{
    private String name;
}
