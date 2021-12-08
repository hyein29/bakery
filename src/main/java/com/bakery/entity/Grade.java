package com.bakery.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Grade {

    @Id
    @Column(name = "grade_no")
    private int gradeNo;

    @NotNull
    private String name;

}
