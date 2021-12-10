package com.bakery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test_member")
@Data
@NoArgsConstructor
public class TestMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String userPw;

    @Builder
    public TestMember(Long id, String userId, String userPw){
        this.id = id;
        this.userId = userId;
        this.userPw = userPw;
    }


}
