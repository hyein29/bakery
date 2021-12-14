package com.bakery.dto;

import com.bakery.entity.Member;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 필수
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CartDTO {

    private Integer cartId;
//    private Member member;
    private String username;

}