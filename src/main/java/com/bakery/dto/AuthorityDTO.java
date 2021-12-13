package com.bakery.dto;

import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 필수
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthorityDTO {

    private String username;
    private String auth;

}