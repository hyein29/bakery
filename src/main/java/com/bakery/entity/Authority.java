package com.bakery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "authority")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 필수
public class Authority {

    @Id // primary key 설정
    private String username;

    private String auth;

}
