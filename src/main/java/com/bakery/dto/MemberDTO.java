package com.bakery.dto;

import com.bakery.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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