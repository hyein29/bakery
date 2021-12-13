package com.bakery.dto;

import com.bakery.entity.ItemCategory;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 필수
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemDTO {

    private Integer itemNo;
    private ItemCategory itemCategory;
    private String name;
    private int price;
    private int stock;
    private Timestamp regDate;
    private Timestamp updateDate;
    private String description;
    private String imgUrl;

}