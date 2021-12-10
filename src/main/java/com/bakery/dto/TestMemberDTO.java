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
public class TestMemberDTO {

    private Long id;

    private String userId;

    private String userPw;




}