package com.bakery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "item")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 필수
public class Item {

    @Id // primary key 설정
    @Column(name = "item_no")
    private Integer itemNo;

    @ManyToOne
    @JoinColumn(name = "cate_code")
    private ItemCategory itemCategory;

    private String name;

    private int price;

    private int stock;

    @Column(name = "reg_date")
    private Timestamp regDate;

    @Column(name = "update_date")
    private Timestamp updateDate;

    private String description;

    @Column(name = "img_url")
    private String imgUrl;

}
