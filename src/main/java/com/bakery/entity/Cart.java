package com.bakery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cart")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 필수
public class Cart {

    @Id // primary key 설정
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;

//    @OneToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "username")
    private String username;

}
