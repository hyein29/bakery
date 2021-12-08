package com.bakery.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "member")
@Data
public class Member {

    @Id // primary key 설정
//    @Size(min = 5, max = 15, message = "ID는 5자 이상 15자 이하입니다.")
    private String username;

    @NotNull
//    @Size(min = 8, max = 15, message = "비밀번호는 8자 이상 15자 이하입니다.")
    private String password;

    @NotNull
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @NotNull
    private String phone;

    @Column(name = "reg_date", nullable = false)
    private Timestamp regDate;

    @Column(name = "unreg_date")
    private Timestamp unregDate;

    @NotNull
    private boolean enabled;

    @ManyToOne
    @JoinColumn(name = "grade_no")
    private Grade gradeNo;

}
