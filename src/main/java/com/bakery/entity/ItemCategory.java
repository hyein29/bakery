package com.bakery.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item_category")
@Data
public class ItemCategory {

    @Id
    @Column(name = "cate_code")
    private String cateCode;

    private String name;

    @OneToMany(mappedBy = "itemCategory")
    private List<Item> items = new ArrayList<>();

}
