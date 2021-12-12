package com.bakery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "member")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 필수
public class Member {

    @Id // primary key 설정
//    @Size(min = 5, max = 15, message = "ID는 5자 이상 15자 이하입니다.")
    private String username;

//    @Size(min = 8, max = 15, message = "비밀번호는 8자 이상 15자 이하입니다.")
    private String password;

    private String name;

    private String email;

    private String phone;

    @Column(name = "reg_date")
    private Timestamp regDate;

    @Column(name = "unreg_date")
    private Timestamp unregDate;

    private boolean enabled;

    // 외래키 설정
    @ManyToOne
    @JoinColumn(name = "grade_no")
    private Grade grade;

//    @Builder
//    public Member(String username, String password, String name,
//                  String email, String phone) {
//        this.username = username;
//        this.password = password;
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//    }

}
