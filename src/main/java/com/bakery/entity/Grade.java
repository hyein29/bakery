package com.bakery.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grade")
@Data
public class Grade {

    @Id
    @Column(name = "grade_no")
    private Integer gradeNo;

    private String name;

    @OneToMany(mappedBy = "grade")
    private List<Member> members = new ArrayList<>();

}
