package com.bakery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authority {

    private String username;
    private String auth;

}
