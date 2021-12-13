package com.bakery.dto;

import com.bakery.entity.ItemCategory;
import com.bakery.entity.Member;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 필수
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CartDTO {

    private Integer cartId;
    private String username;

}