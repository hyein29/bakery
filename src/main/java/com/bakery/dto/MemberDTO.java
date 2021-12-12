package com.bakery.dto;

import com.bakery.entity.Grade;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 필수
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberDTO {

    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private Timestamp regDate;
    private Timestamp unregDate;
    private boolean enabled;
    private Grade grade;

}